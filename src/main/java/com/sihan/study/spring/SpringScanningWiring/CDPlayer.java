package com.sihan.study.spring.SpringScanningWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {

	private CompactDisc cd;
	
	@Autowired		
	public CDPlayer(CompactDisc cd)
	{
		this.cd=cd;
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		this.cd.play();
	}

}
