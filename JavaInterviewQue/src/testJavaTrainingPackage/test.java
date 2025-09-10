
package testJavaTrainingPackage;
/*
public class test {

	public static void main(String[] args) {
		String str = "amol java automatio";
		String newstr ="";
		int count = 1;
		
		for (int i = 0; i<str.length()-1; i++)
		{
			if(str.charAt(i) == str.charAt(i+1))
			{
				if(str.charAt(i) == str.charAt(i+1))
				{
					count++;
					continue;
				}
				
				else
				{
					newstr = newstr + count + str.charAt(i);
					count = 1;
				}
			}
		}
		
		newstr = newstr + count + str.charAt(str.length()-1);
		System.out.println("New String = " +newstr);
		
		

	}

}

*/



/*
public class test {
    public static void main(String[] args) {
    
        String s = "amol auto";
        String res = "";
        int cnt = 1;
        for(int i=0; i<s.length()-1 ;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                cnt++;
                continue;
            }
            else{
                res = res + cnt + s.charAt(i);
                cnt=1;
            }
        }
        
        res = res + cnt + s.charAt(s.length()-1);
        System.out.println(res);
   }
    }

*/




public class test {
    public static void main(String[] args) {
    
        String s = "accccbbeddddf";
        String res = "";
        int cnt = 1;
        for(int i=0; i<s.length()-1 ;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                cnt++;
                continue;
            }
            else{
                res = res + cnt + s.charAt(i);
                cnt=1;
            }
        }
        
        res = res + cnt + s.charAt(s.length()-1);
        System.out.println(res);
   }
}


