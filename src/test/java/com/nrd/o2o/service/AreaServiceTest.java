package com.nrd.o2o.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nrd.o2o.entity.Area;
@SpringBootTest
public class AreaServiceTest  {
	@Autowired
	private AreaService areaService;

	@Test
	public void testGetAreaList() {
		List<Area> areaList = areaService.getAreaList();
		assertEquals("西苑", areaList.get(1).getAreaName());
	}
}
