package intArrayFunctions;
public class intArrayFunctions {        
  
     //checking the bigger number length and then creating 2 arrays.
     public byte[] second (String num1, byte n1[])
    {    
        //defining pos1 and pos2 to define positions in for loop
        int pos1=num1.length()-1;
        
        //for loop to assign array elements
        for (int i = n1.length-1; i >= 0; i--) 
        {
           
            if(pos1>=0)
            {   
                n1[i]=Byte.parseByte(Character.toString(num1.charAt(pos1)));
                pos1--;
            } 
        }
        return n1;
        
    }
    public String add(String num1, String num2)
    {   int l=num1.length() > num2.length() ? num1.length() : num2.length();
        byte n1[] =new byte[l];
        byte n2[] =new byte[l];
        byte res[] = new byte[l];
        intArrayFunctions abc = new intArrayFunctions();
        n1=abc.second(num1,n1);
        n2=abc.second(num2,n2);
         for (int i = 0; i < res.length; i++) 
            res[i]=(byte)(n2[i]+ n1[i]);
        
        int cr; //carry over variable. cr used to add 1 to the upper number
        // for used to do the same function
        for (int i = 1; i < res.length; i++) {
            if (res[i]>9) {
                cr=res[i]/10;
                res[i]%=10;
                res[i-1]+=cr;
            }   
        }

        String rt="";
        for (int i = 0; i < res.length; i++) 
            rt+=Integer.toString(res[i]);
        return rt;
            
        
               
    }

}
