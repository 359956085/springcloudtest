package com.fs.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EurekaserverApplicationTests {

	@Test
	public void contextLoads() {
	}

	public static void main(String[] args) {
		Map<String, String> m = new HashMap<>();
		m.put("sdf", "sd");
		m.put("sdf", "sd");
		System.out.println((int)(26/0.75));
	}
	
	public boolean isEqual(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Map<Character, Integer> map = new HashMap<>(35);
		for (char c : c1) {
			if (map.containsKey(c)) {
//				map.get(c). + 1;
			} else {
				map.put(c, 1);
			}
		}
		for (char c : c2) {
			if (map.containsKey(c2)) {
				
			}
		}
		
		
		return true;
	}
}
