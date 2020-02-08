package com.malik.chaoxinghelper.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author MalikCheng
 * @since 2020-02-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("hepler_student_health_daily")
public class HeplerStudentHealthDaily implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("uid")
    private Integer uid;

    @TableField("user_name")
    private String userName;

    /**
     * 学号
     */
    @TableField("sno")
    private String sno;

    @TableField("phone_number")
    private String phoneNumber;

    /**
     * 学院
     */
    @TableField("institute")
    private String institute;

    /**
     * 班级 入学年份+专业+班级\n例如：2018计算机1班
     */
    @TableField("class_room")
    private String classRoom;

    /**
     * 身份证号
     */
    @TableField("Id_card")
    private String idCard;

    /**
     * 家庭住址 省+市+区/县+小区/村庄
     */
    @TableField("family_location")
    private String familyLocation;

    /**
     * 体温
     */
    @TableField("temperature")
    private Double temperature;

    /**
     * 疫情期间是否去过湖北或接触过湖北人员
     */
    @TableField("is_gone_hubei")
    private String isGoneHubei;

    /**
     * 疫情期间是否接触过确诊或疑似新型冠状病毒病毒人员
     */
    @TableField("is_touch_patient")
    private String isTouchPatient;

    /**
     * 学生身体情况
     */
    @TableField("student_health")
    private String studentHealth;

    /**
     * 家人身体情况
     */
    @TableField("family_health")
    private String familyHealth;

    /**
     * 紧急联系人及联系方式 张三18000000000
     */
    @TableField("emergency_contact")
    private String emergencyContact;


}
