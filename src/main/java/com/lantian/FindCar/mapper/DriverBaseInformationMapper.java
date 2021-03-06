package com.lantian.FindCar.mapper;

import com.lantian.FindCar.dao.DriverBaseInformation;
import com.lantian.FindCar.dao.DriverBaseInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DriverBaseInformationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver_base_information
     *
     * @mbggenerated
     */
    int countByExample(DriverBaseInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver_base_information
     *
     * @mbggenerated
     */
    int deleteByExample(DriverBaseInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver_base_information
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver_base_information
     *
     * @mbggenerated
     */
    int insert(DriverBaseInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver_base_information
     *
     * @mbggenerated
     */
    int insertSelective(DriverBaseInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver_base_information
     *
     * @mbggenerated
     */
    List<DriverBaseInformation> selectByExample(DriverBaseInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver_base_information
     *
     * @mbggenerated
     */
    DriverBaseInformation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver_base_information
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") DriverBaseInformation record, @Param("example") DriverBaseInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver_base_information
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") DriverBaseInformation record, @Param("example") DriverBaseInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver_base_information
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DriverBaseInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver_base_information
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DriverBaseInformation record);
}