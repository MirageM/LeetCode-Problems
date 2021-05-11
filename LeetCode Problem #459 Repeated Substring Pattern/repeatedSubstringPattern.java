import java.util.*;

public class repeatedSubstringPattern{
	public boolean repeatedSubstringPattern(String s){
		for(int i = s.length()/2; i>=1; i--){
			if(s.length()%i == 0){
				int repeated = s.length()/i;
				String substring = s.substring(0,i);
				StringBuilder str = new StringBuilder("");
				for(int j = 0; j<repeated; j++)
					str.append(substring);
			}	if(str.toString().equals(s)) return true;

		}
		return false;

	}
	
}