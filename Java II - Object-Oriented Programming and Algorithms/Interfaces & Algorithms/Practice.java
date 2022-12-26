import java.io.*;
import java.util.*;

public class Practice{
	public static void main(String[] args){
		int[] list = new int[] {3,9,6,1,2};
		s_sort(list);

	}

	private static void s_sort(int[] name){

		int new_min;
		int swap;

		for(int old_min = 0; old_min < name.length-1; old_min++){
			new_min = old_min;
			for(int current_index = old_min+1; current_index < name.length; current_index++){
				if(name[current_index] < name[new_min]){
					new_min = current_index;
				}

			}
			swap = name[new_min];
			name[new_min] = name[old_min];
			name[old_min] = swap;
		}
		System.out.println(Arrays.toString(name));
	}

}
