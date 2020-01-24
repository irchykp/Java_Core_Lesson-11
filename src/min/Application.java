package min;

import java.util.Random;
import java.util.Arrays;
import java.util.Collections;

public class Application {

	public static void main(String[] args) {
		
			Integer[] array1= new Integer[5];

			Random random = new Random();

			for (int i = 0; i < array1.length; i++) {
				array1[i] = random.nextInt();
			}
			
			Arrays.sort(array1);
			System.out.println(Arrays.toString(array1));

			Arrays.sort(array1, Collections.reverseOrder());
			System.out.println(Arrays.toString(array1));

	}

}
