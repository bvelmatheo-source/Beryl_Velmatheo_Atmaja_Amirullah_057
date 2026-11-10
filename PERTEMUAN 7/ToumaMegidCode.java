import java.util.Scanner;
public class ToumaMegidCode {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        
int hpTouma = 100;
int hpMegid=100;
int ronde = 0;
int energi1 = 2; 
int energi2 = 2;
int energi3 = 2;

while (true) {
    System.out.print("Pilih buku : ");
    int pilih = input.nextInt();

    String namaBuku = "";
    int damage = 0;

    switch (pilih) {
        case 1:
            if (energi1 == 0) {
                System.out.println("Energi Wonder Almighty habis !");
                continue;   
            }
            energi1--;
            namaBuku="Wonder Almighty";
            damage=30;
            break;         
        case 2:
            if(energi2==0){
                System.out.println("Energi Primitive Dragon habis !");
                continue;
            }
            energi2--;
            namaBuku="Primitive Dragon";
            damage=20;
            break;
        case 3:
            if (energi3==0){
                System.out.println("Energi Brave Dragon habis !");
                continue;
            }
            energi3--;
            namaBuku="Brave Dragon";
            damage=10;
            
            break;
        default:
            
            System.out.println("Buku tidak valid !");
            continue;
    }

   
    ronde++;
    hpMegid -= damage;
    if (hpMegid <= 0) {
        System.out.println("[ Ronde " + ronde + "]" + " " + namaBuku + " ! Megid -" + damage + " ( HP 0) .");
        
        break;             
    }

  
    hpTouma-= 20;
    
    System.out.println("[Ronde " + ronde + " ]" +namaBuku+ " ! " + "Megid-" + damage+ " (HP" + hpMegid+  ")" + ". Touma-20  (HP" +hpTouma +").");

    if (hpTouma <= 0) {
        
        System.out.println("Touma gugur.........GAME OVER");
        return;            
    }
}


        System.out.println("Megid dikalahkan! RIDER KICK!");
        System.out.println("Total ronde =" + ronde + "  | Sisa HP Touma = " + hpTouma);
        
    
    }

}
