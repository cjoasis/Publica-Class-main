

public class hello {
    
    
    public static void main (String[] args){
    
        
        int x=Peluches(1,(1+2),1,1);
        System.out.println("Los peluches son "+x);
    }
     
    static int Peluches(int cabeza,int patas,int brazos, int ojos)
    {
    
        return cabeza+(brazos*2)+(ojos*2)+(patas*2);
    }
    

            
}