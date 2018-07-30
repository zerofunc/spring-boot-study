package me.hj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ManRunner implements ApplicationRunner {

	@Autowired
	Man man;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(man);
	}
}
