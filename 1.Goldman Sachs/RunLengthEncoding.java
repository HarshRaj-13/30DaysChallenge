class GfG
 {
	String encode(String str)
	{
	    String res = "";
          for(int i = 0 ; i < str.length() ;){
              char ch = str.charAt(i);
              int len = func(i+1,ch,str);
              res += ch;
              res += String.valueOf(len);
              i += len;
          }
          return res;
	}
	int func(int i , char ch , String str){
	    int len = 1;
	    while(i < str.length() && ch == str.charAt(i)){
            len++;
            i++;
        }
        return len;
	}
 }