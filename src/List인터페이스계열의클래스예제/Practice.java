package List인터페이스계열의클래스예제;

import java.util.List;
import java.util.Vector;

public class Practice {

	public static void main(String[] args) {
		//고정 배열 객체 생성
	    String [] name = {"김진영", "최인호", "조정래", "김흥신", "박경리"};
	
	
		//가변 배열 객체 생성<E> 제네릭 기능 => Element(요소)
	   List<String> list = new Vector<String>(5,4);
	   
		//벡터의 용량은: 5
	    System.out.println(((Vector<String>)list).capacity());
		
		//고정 배열의 String 객체들을Vector 가변배열에 저장하기
	   
	     
	
	    //[김진영, 최인호, 조정래, 김흥신, 박경리]
	
	
	    
	   //가변배열 중간에 객체 끼어넣기(삽입) 김진영과 최인호 사이에"공지영"을 삽입
	
	
	
	   //[김진영, 공지영, 최인호, 조정래, 김흥신, 박경리, 박근혜]
	
	
	
		//true
	
	
		
		//향상된 for문
	
	
	
		//김진영	공지영	최인호	조정래	김흥신	박경리	박근혜
	
	
	
	
	}

}
