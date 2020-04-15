package com.sihan.study.spring.SpringScanningWiring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;;

@Configuration
@ComponentScan //如果需要指定多个搜索的基础包路径，可以使用@ComponentScan(basePackages={"soundsystem","video"}) 或 @ComponentScan({SgtPeppers.class,DVDPlayer.class})
public class CDPlayerConfig {

}
