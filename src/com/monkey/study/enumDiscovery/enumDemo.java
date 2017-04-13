package com.monkey.study.enumDiscovery;

/**
* @ClassName: enumDemo 
* @Description: demo for enum
* @author lt
* @date 2017年4月13日 下午1:28:02
 */
public enum enumDemo {
	MON("周一"),
	TUE("周二"),
	WED("周三"),
	THU("周四"),
	FRI("周五"),
	SAT("周六"),
	SUN("周日");
	
	private String value;

	private enumDemo(String value) {
		this.value = value;
	}
	
	public String toString(){
		return this.value.toString();
	}

}
