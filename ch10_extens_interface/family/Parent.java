package ch10_extens_interface.family;

import java.security.PrivateKey;
import java.security.PublicKey;


/**
 * class Name   : parent
 * Author       : JINA
 * Created Date : 2025. 2. 7.
 * version      : 1.0
 * Purpose      : java 기초
 * Description  : 상속 (기본 상속 방법)
 */
public class Parent {

		
		private String name;
		private int age;
		
		public Parent() {
			super();
		}
		public Parent(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		// 오버라이팅 (부모의 메서드를 재정의(override)해서 사
		@Override
		public String toString() {
			return "Parent [name=" + name + ", age=" + age + "]";
		}
		
		public void sayHello() {
			System.out.println("부모입니다.");
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
	
}
