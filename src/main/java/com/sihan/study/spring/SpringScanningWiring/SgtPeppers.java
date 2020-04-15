package com.sihan.study.spring.SpringScanningWiring;

import org.springframework.stereotype.Component;

@Component 
//该类会作为组件类，并告知Spring要为这个类创建bean
//如果不指定bean ID，Spring会默认命名Bean的ID是sgtPeppers(第一个字母小写)，或通过@Component("sihanwang")来显示给个ID
public class SgtPeppers implements CompactDisc {

	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing "+title+" by " + artist);
	}

}
