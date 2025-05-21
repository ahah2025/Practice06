package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
	public void execute(String str) {

		if ("앱".equals(str)) {
			runApp();
		} else {
			super.execute(str);
        }

        }
        
	protected void playMusic(){
		System.out.println("다운로드해서 음악재생");
    }
        
	private void runApp(){
		System.out.println("앱실행");
    }
}
