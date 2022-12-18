package test;

import java.util.ArrayList;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {
	
	private List<String> list = new ArrayList<>() {{
		add("One");
		add("Two");
	}};
	
	@Test
	public void test1() {
		list.add("Three");
		System.out.println("Test1");
		System.out.println(list);
	}
	
	@Test
	public void test2() {
		List<String> list = new ArrayList<>() {{
			add("One");
			add("Two");
		}};
		
		System.out.println("Test2");
		System.out.println(list);
		Assert.assertEquals(list.size(), 2);
	}
}
