package com.xtxk;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
	
	
	public static void main(String[] args) {
		Person person =new Person();
		person.setName("�������� - �ܵ���");
		person.setAge(68);
		
		List<Person> list = new ArrayList<>();
		list.add(person);
		
		// 1 �Ӽ������������ȡ�����һ���ֶ�
		List<Integer> ageList = list.stream().map(Person::getAge).collect(Collectors.toList());
		System.out.println(ageList);
		
	}
}
