package exercise;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.junit.Test;
import com.google.common.collect.ImmutableList;

import beans.Person;
import mockdata.MockData;

public class JavaTest{

  //Tasks
  //=====	
  //1) Reduce the list of people to ages over 25 and under 35
  //2) Print the average, max and min age from list generated in 1)
  //3) Print Group by Gender, with the ages in ascending order using the list in 1)
  @Test
  public void excercise() throws Exception {
	 
	 System.out.println("Java 8 Stream, Filter, Predicate, Map and Collector Test"); 
	 System.out.println("========================================================"); 
	 	 	 
	 ImmutableList<Person> persons= MockData.getPeople();
	 
	 
	 
  }

}
