//Name : Hsieh Meng Chin
//ID : U10316042
//Information : Big number calculate without BigDecimal class and BigInteger class.

public class Number {
    public static int[] add(int[] x, int[] y) { 
        
		int C = 0;	//建立變數C表示溢位 初始為0	
        int[] z = new int[x.length];  //new 一個陣列來儲存相加後的值

        for(int i = x.length - 1; i >= 0; i--) { 
            z[i] = x[i] + y[i] + C; 
            if(z[i] < 10000) //沒有溢位 
                C = 0; //C就為0
            else { 		
                z[i] = z[i] - 10000; //有溢位 
                C = 1; //C就為1
            } 
        }
        
        return z;
    } 


    
    public static void main(String[] args) {
        int[] x = {89446545};
        int[] y = {78961654};
        int[] z = Number.add(x, y); //陣列z將x,y數字相加
      
    int[] e = Number.add(x, y);
        for(int i = 0; i < z.length; i++) {
            System.out.print(z[i]);
        }
        System.out.println();
	
    }
}
