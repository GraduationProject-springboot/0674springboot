package com.entity.model;

import com.entity.WentibaobiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 问题报表
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-27 16:31:40
 */
public class WentibaobiaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 问题类型
	 */
	
	private String wentileixing;
		
	/**
	 * 新增数量
	 */
	
	private Integer xinzengshuliang;
		
	/**
	 * 解决数量
	 */
	
	private Integer jiejueshuliang;
		
	/**
	 * 统计日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tongjiriqi;
				
	
	/**
	 * 设置：问题类型
	 */
	 
	public void setWentileixing(String wentileixing) {
		this.wentileixing = wentileixing;
	}
	
	/**
	 * 获取：问题类型
	 */
	public String getWentileixing() {
		return wentileixing;
	}
				
	
	/**
	 * 设置：新增数量
	 */
	 
	public void setXinzengshuliang(Integer xinzengshuliang) {
		this.xinzengshuliang = xinzengshuliang;
	}
	
	/**
	 * 获取：新增数量
	 */
	public Integer getXinzengshuliang() {
		return xinzengshuliang;
	}
				
	
	/**
	 * 设置：解决数量
	 */
	 
	public void setJiejueshuliang(Integer jiejueshuliang) {
		this.jiejueshuliang = jiejueshuliang;
	}
	
	/**
	 * 获取：解决数量
	 */
	public Integer getJiejueshuliang() {
		return jiejueshuliang;
	}
				
	
	/**
	 * 设置：统计日期
	 */
	 
	public void setTongjiriqi(Date tongjiriqi) {
		this.tongjiriqi = tongjiriqi;
	}
	
	/**
	 * 获取：统计日期
	 */
	public Date getTongjiriqi() {
		return tongjiriqi;
	}
			
}
