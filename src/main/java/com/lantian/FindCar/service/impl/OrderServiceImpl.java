package com.lantian.FindCar.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lantian.FindCar.dao.OrderRecord;
import com.lantian.FindCar.dao.OrderRecordExample;
import com.lantian.FindCar.mapper.OrderRecordMapper;
import com.lantian.FindCar.service.OrderService;
import com.lantian.FindCar.text.OrderText;
import com.lantian.FindCar.util.CommonUtil;

@Service
public class OrderServiceImpl implements OrderService {

	private static Logger log = Logger.getLogger(OrderServiceImpl.class);
	
	@Autowired
	private OrderRecordMapper orderMapper;
	
	public long createOrder(long userAnimateId, String carCate,Date time,String startName, double startLat, double startLng,
			String endName, double endLat, double endLng) {
		long orderId = -1;
		try{
			OrderRecord orderRecord = new OrderRecord();
			orderRecord.setCarCate(carCate);
			orderRecord.setCreateTime(time);
			orderRecord.setUserAnimateId(userAnimateId);
			orderRecord.setStartLocationName(startName);
			orderRecord.setStartLocationLat(startLat);
			orderRecord.setStartLocationLng(startLng);
			orderRecord.setEndLocationName(endName);
			orderRecord.setEndLocationLat(endLat);
			orderRecord.setEndLocationLng(endLng);
			orderRecord.setOrderStatus(OrderText.user_created);
			orderMapper.insertSelective(orderRecord);
			orderId = getOrderIdByUserAnimateidAndTime(userAnimateId, time);
		}catch(Exception e){
			log.error("创建订单失败："+e.getLocalizedMessage());
		}
		return orderId;
	}

	
	public long getOrderIdByUserAnimateidAndTime(long userAnimateId,Date time){
		long orderId = -1;
		try{
			OrderRecordExample example = new OrderRecordExample();
			OrderRecordExample.Criteria criteria = example.createCriteria();
			criteria.andCreateTimeEqualTo(time);
			criteria.andUserAnimateIdEqualTo(userAnimateId);
			List<OrderRecord> list = orderMapper.selectByExample(example);
			if(!CommonUtil.isEmpty(list)){
				OrderRecord entity = list.get(0);
				orderId = entity.getId();
			}
		}catch(Exception e){
			log.error("获取订单id失败："+e.getLocalizedMessage());
		}
		return orderId;
	}


	public String getOrderStatusByOrderId(long orderId,long userAnimateId) {
		String orderStatus = null;
		try{
			OrderRecord record =orderMapper.selectByPrimaryKey(orderId);
			if(null != record){
				if(record.getUserAnimateId() == userAnimateId){
					orderStatus = record.getOrderStatus();
				}
			}
		}catch(Exception e){
			log.error("获取订单状态失败："+e.getLocalizedMessage());
		}
		return orderStatus;
	}


	public boolean cancelOrderByOrderId(long orderId,long userAnimateId) {
		boolean result = false;
		try{
			OrderRecord record = orderMapper.selectByPrimaryKey(orderId);
			if(record!=null){
				if(record.getUserAnimateId() == userAnimateId){
					record.setOrderStatus(OrderText.user_canceled);
					orderMapper.updateByPrimaryKey(record);
					result = true;
				}
			}
		}catch(Exception e){
			log.error("取消订单失败："+e.getLocalizedMessage());
		}
		return result;
	}


	public long getOrderDriverIdByOrderId(long orderId, long userAnimateId) {
		long driver_animate_id = -1;
		try{
			OrderRecord record =orderMapper.selectByPrimaryKey(orderId);
			if(null != record){
				if(record.getUserAnimateId() == userAnimateId){
					driver_animate_id = record.getDriverAnimateId();
				}
			}
			
		}catch(Exception e){
			log.error("获取订单司机失败："+e.getLocalizedMessage());
		}
		return driver_animate_id;
	}
}
