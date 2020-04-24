    import java.util.*;
     
     
    class TestClass {
        public static void main(String args[] ) throws Exception {
                   try {
                Scanner sc= new Scanner(System.in);
                int T= sc.nextInt();
                sc.nextLine();
                for(int counter=0;counter<T;counter++){
                    String s=sc.nextLine();
     
                    for (int i=0;i<s.length();i++){
                        if(s.charAt(i)==' ')
                            System.out.print("$");
                        else
                            System.out.print((int)(s.toLowerCase().charAt(i))-96);
                    }
                    System.out.println();
                }
            }catch (Exception e){
     
            }
     
            // Write your code here
     
        }
    }
