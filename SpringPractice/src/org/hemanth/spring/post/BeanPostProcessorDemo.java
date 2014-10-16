package org.hemanth.spring.post;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemo implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessAfterInitialization"+arg0);
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		return arg0;
	}

}
