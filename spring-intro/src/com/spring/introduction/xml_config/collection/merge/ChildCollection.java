package com.spring.introduction.xml_config.collection.merge;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ChildCollection {
	
	private List<String> listMerge;
	private Set<String> setMerge;
	private Map<String, String> mapMerge;
	private Properties propsMerge;

	public List<String> getListMerge() {
		return listMerge;
	}

	public void setListMerge(List<String> listMerge) {
		this.listMerge = listMerge;
	}

	public Set<String> getSetMerge() {
		return setMerge;
	}

	public void setSetMerge(Set<String> setMerge) {
		this.setMerge = setMerge;
	}

	public Map<String, String> getMapMerge() {
		return mapMerge;
	}

	public void setMapMerge(Map<String, String> mapMerge) {
		this.mapMerge = mapMerge;
	}

	public Properties getPropsMerge() {
		return propsMerge;
	}

	public void setPropsMerge(Properties propsMerge) {
		this.propsMerge = propsMerge;
	}

	@Override
	public String toString() {
		return "ChildCollection [list=" + listMerge + "]";
	}
	
}
