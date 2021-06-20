package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> team1 = Arrays.asList("Scott","David","Jhon");
		List<String> team2 = Arrays.asList("Mary","Luna","Tom");
		List<String> team3 = Arrays.asList("Ken","Jony","Kitty");
		
		List<List<String>> playerinwc = Arrays.asList(team1,team2,team3); 
		
		// Before Java8
		System.out.println("-------Before Java8---------");
		for(List<String> team :playerinwc)
		{
			for(String name:team)
			{
				System.out.println(name);
			}
		}
		
		List<String>players=playerinwc.stream().flatMap(team->team.stream()).collect(Collectors.toList());
		System.out.println(players);
	}

}
