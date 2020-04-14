package com.sihan.study.spring.SpringScanningWiring;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
	
@RunWith(SpringJUnit4ClassRunner.class) //测试开始时使用SpringJUnit4ClassRunner来创建Spring的上下文。
@ContextConfiguration(classes=CDPlayerConfig.class) //指明Spring配置类
public class CDPlayerTest {
	
	@Autowired //将Spring上下文中的Bean注入到代码中
	private CompactDisc cd;
	
	@Test
	public void cdShouldNotBeNull()
	{
		assertNotNull(cd);
	}

}
