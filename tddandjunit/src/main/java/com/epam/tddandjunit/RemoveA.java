package com.epam.tddandjunit;

public class RemoveA {
	public String deleteA(String s){
		String res = "";
		if(s.length()==1 || s.length()==0){
			if(s.length()==1)
				if(s.charAt(0)=='A'){
					return res;
				}
				else{
					return s;
			}
			else{
				return res;
			}
		}
		else if(s.length()  >= 2){
			if(s.charAt(0)=='A' && s.charAt(1) == 'A'){
				res = s.substring(2);
			}
			else if(s.charAt(0) == 'A' && s.charAt(1)!='A'){
				res = s.substring(1);
			}
			else if(s.charAt(0) != 'A' && s.charAt(1)=='A'){
				res = s.charAt(0) + s.substring(2);
			}
			else{
				res = s;
			}
		}
		return res;
	}
}