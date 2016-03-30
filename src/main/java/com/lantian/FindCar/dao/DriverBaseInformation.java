package com.lantian.FindCar.dao;

import java.util.Date;

public class DriverBaseInformation {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column driver_base_information.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column driver_base_information.phonenum
     *
     * @mbggenerated
     */
    private String phonenum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column driver_base_information.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column driver_base_information.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column driver_base_information.create_location
     *
     * @mbggenerated
     */
    private String createLocation;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column driver_base_information.id
     *
     * @return the value of driver_base_information.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column driver_base_information.id
     *
     * @param id the value for driver_base_information.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column driver_base_information.phonenum
     *
     * @return the value of driver_base_information.phonenum
     *
     * @mbggenerated
     */
    public String getPhonenum() {
        return phonenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column driver_base_information.phonenum
     *
     * @param phonenum the value for driver_base_information.phonenum
     *
     * @mbggenerated
     */
    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column driver_base_information.name
     *
     * @return the value of driver_base_information.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column driver_base_information.name
     *
     * @param name the value for driver_base_information.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column driver_base_information.create_time
     *
     * @return the value of driver_base_information.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column driver_base_information.create_time
     *
     * @param createTime the value for driver_base_information.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column driver_base_information.create_location
     *
     * @return the value of driver_base_information.create_location
     *
     * @mbggenerated
     */
    public String getCreateLocation() {
        return createLocation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column driver_base_information.create_location
     *
     * @param createLocation the value for driver_base_information.create_location
     *
     * @mbggenerated
     */
    public void setCreateLocation(String createLocation) {
        this.createLocation = createLocation;
    }
}