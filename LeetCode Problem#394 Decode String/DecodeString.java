import java.util.*;
import java.io.*;

public class DecodeString{
	
	public String decodeString(String s){
		Stack<String> result = new Stack();
		Stack<Integer> counts = new Stack();
		String decodedString = "";
		int index = 0;


		while(index < s.length()){
			if(Character.isDigit(s.charAt(index))){
				int count = 0;
				while(Character.isDigit(s.charAt(index))){
					count = 10*count + (s.charAt(index) - '0');
					index +=1;
				}
				counts.push(count);
			}
			else if(s.charAt(index)=='['){
				result.push(decodedString);
				decodedString = "";
				index +=1;
			}
			else if(s.charAt(index)== ']'){
				StringBuilder temp = new StringBuilder(result.pop());
				int count = counts.pop();
				for(int i = 0; i<count; i++){
					temp.append(decodedString);
				}
				decodedString = temp.toString();
				index +=1;
			}
			else{
				decodedString += s.charAt(index);
				index+=1;
			}
		}
		return decodedString;
	}
}