public class Basic1 {
    int rec(int num){
        if(num<=1){
            return num;
        }
        return rec(num-1)+rec(num-2);
        }
        public static void main(String[] args) {
            Basic1 obj=new Basic1();
           for(int i=0;i<10;i++){
               System.out.println(obj.rec(i));
           }
    }
    
}
