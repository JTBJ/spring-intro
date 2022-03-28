package com.spring.introduction.xml_config.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SpringCollectionDemo {
	
	private List<String> list;
	private Set<String> set;
	private Map<String, String> map;
	private Properties props;
	
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	@Override
	public String toString() {
		return "SpringCollectionDemo [list=" + list + ", set=" + set + ", map=" + map + ", props=" + props + "]";
	}

}
