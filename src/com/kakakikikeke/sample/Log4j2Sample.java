package com.kakakikikeke.sample;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Log4j2Sample {

	private static Logger log;
	
	public Log4j2Sample() {
		log = LogManager.getLogger(Log4j2Sample.this);
	}
	
	public static void main(String[] args) {
		new Log4j2Sample();
		log.error("This is error messages");
		log.trace("���L�ȍ~��log4j2.xml�t�@�C�����N���X�p�X�ɒʂ��Ă��Ȃ��ƕ\������܂���");
		log.trace("This is trace messages");
	}
	
}
