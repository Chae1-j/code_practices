import java.util.*;

class Solution {
	public String[] solution(String[] files) {
    		Arrays.sort(files, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				String[] file1 = detach(s1);
				String[] file2 = detach(s2);
				
				int headValue = file1[0].compareTo(file2[0]);
				
				if(headValue == 0) {
					int num1 = Integer.parseInt(file1[1]);
					int num2 = Integer.parseInt(file2[1]);
					
					return num1 - num2;
				} else {
					return headValue;
				}
			}
			
			private String[] detach(String str) {
				String head = "";
				String number = "";
				String tail = "";

				int idx = 0;
				for( ; idx < str.length() ; ++idx) {
					char ch = str.charAt(idx);
					if(ch >= '0' && ch <= '9') break;
					head += ch;
				}
				
				for( ; idx < str.length() ; ++idx) {
					char ch = str.charAt(idx);
					if(!(ch >= '0' && ch <= '9')) break;
					number += ch;
				}
				
				for( ; idx < str.length() ; ++idx) {
					char ch = str.charAt(idx);
					tail += ch;
				}
				
				String[] file = {head.toLowerCase(), number, tail};
				
				return file;
			}
		});
		return files;
	}
}