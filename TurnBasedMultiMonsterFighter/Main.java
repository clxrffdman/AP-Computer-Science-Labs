import java.util.Scanner;
public class Main{

    private static Scanner userInput = new Scanner(System.in);

    public static void main(){
        Monster[] player1;
        player1 = gacha();
        Monster[] player2;
        player2 = gacha();

        boolean on = true;
        int a, b, c;

        while(on == true){
            a = -1;

            System.out.println("WELCOME! PLEASE SELECT YOUR OPTION! (1-9)\n1) View Player 1 Mons\n2) View Player 2 Mons\n3) Battle!\n9) Exit");
            a = userInput.nextInt();
            if(a==1){
                System.out.println("---------------------Player 1---------------------");
                for(int i = 0; i < 3; i++){
                    System.out.println(player1[i].toString());
                }
                System.out.println("--------------------------------------------------");
                a= -1;

            }

            if(a==2){
                System.out.println("---------------------Player 2---------------------");
                for(int i = 0; i < 3; i++){
                    System.out.println(player2[i].toString());
                }
                System.out.println("--------------------------------------------------");
                a= -1;

            }

            if(a==3){
                System.out.println("Battle Time!");
                boolean battle = true;
                int playa = 1;
                c=0;
                for(int i = 0; i < 3; i++){
                    player1[i].stamina = 1;
                    player2[i].stamina = 1;
                }
                clear();
                while(battle == true){

                    System.out.println("---------------------Player 1---------------------");
                    for(int i = 0; i < 3; i++){
                        if(i!=0)
                            System.out.println("--------------------------------------------------");
                        System.out.println("PLAYER 1 MOB " + (i+1));
                        System.out.println(player1[i].battleState());
                    }
                    System.out.println("---------------------Player 2---------------------");
                    for(int i = 0; i < 3; i++){
                        if(i!=0)
                            System.out.println("--------------------------------------------------");
                        System.out.println("PLAYER 2 MOB " + (i+1));
                        System.out.println(player2[i].battleState());
                    }
                    System.out.println("--------------------------------------------------");
                    System.out.println("Player " + playa + ", your turn!");
                    for(int i = 1; i < 4; i++){
                        c=0;
                        if(playa==1){
                            System.out.println("--------------------\nYour Mob: \n" + player1[i-1].battleState());
                            if(player1[i-1].state == true){
                                System.out.println("This mon is dead and must skip it's turn.");
                                a=2;
                                c=1;
                            }
                        }
                        else{
                            System.out.println("--------------------\nYour Mob: \n" + player2[i-1].battleState());
                            if(player2[i-1].state == true){
                                System.out.println("This mon is dead and must skip it's turn.");
                                a=2;
                                c=1;
                            }
                        }

                        if(c!=1){
                            System.out.println("--------------------\nMon " + i + ", choose Attack(1), or Skip(2)!");
                            a = userInput.nextInt();
                        }
                        if(a==1){
                            System.out.println("Which mon do you attack? (1-3)");
                            b = userInput.nextInt();
                        }
                        else{
                            b=0;
                        }
                        if(playa == 1){
                            if(a == 1){
                                player2[b-1].currentHealth -= player1[i-1].attack(player1[i-1].idNumber);

                            }
                            if(a == 2){
                                player1[i-1].skip();
                            }

                        }
                        if(playa == 2){
                            if(a == 1){
                                player1[b-1].currentHealth -= player2[i-1].attack(player2[i-1].idNumber);

                            }
                            if(a == 2){
                                player2[i-1].skip();
                            }

                        }

                        for(int j = 0; j < 3; j++){
                            if(player1[j].currentHealth <= 0){
                                player1[j].state=true;
                                player1[j].currentHealth=0;
                            }
                            if(player2[j].currentHealth <= 0){
                                player2[j].state=true;
                                player2[j].currentHealth=0;
                            }
                        }

                        if(playa == 1 && a==1){
                            System.out.println(player2[b-1].battleState());
                        }
                        if(playa == 2 && a==1){
                            System.out.println(player1[b-1].battleState());
                        }
                    }

                    if(playa==1){
                        for(int j = 0; j < 3; j++){
                            if(player1[j].stamina<player2[j].maxStamina)
                                player1[j].stamina++;
                        }
                        playa=2;
                    }
                    else{
                        for(int j = 0; j < 3; j++){
                            if(player2[j].stamina<player2[j].maxStamina)
                                player2[j].stamina++;
                        }
                        playa = 1;
                    }

                    if(player2[0].state==true && player2[1].state==true && player2[2].state==true){
                        System.out.println("Player 1 wins!");
                        battle=false;
                    }
                    if(player1[0].state==true && player1[1].state==true && player1[2].state==true){
                        System.out.println("Player 2 wins!");
                        battle=false;
                    }

                }

                a= -1;
            }

        }
    }

    public static Monster[] gacha(){
        Monster[] one = new Monster[3];
        int x = 0;
        int mon = 0;
        for(int i = 0; i < 3; i++){
            x = (int)(Math.random() * 100);
            if(x >= 0 && x < 60){
                mon = (int)(Math.random() * 5);
            }
            else if(x >= 60 && x < 85){
                mon = (int)(Math.random() * ((7-5)+1))+5;
            }
            else if(x >= 85 && x < 95){
                mon = (int)(Math.random() * ((9-8)+1))+8;
            }
            else if(x >= 95 && x < 99){
                mon = 10;   
            }
            else if(x == 99){
                mon = 11;
            }
            if(mon == 0){
                one[i] = new Mob0();
            }
            else if(mon == 1){
                one[i] = new Mob1();
            }
            else if(mon == 2){
                one[i] = new Mob2();
            }
            else if(mon == 3){
                one[i] = new Mob3();
            }
            else if(mon == 4){
                one[i] = new Mob4();
            }
            else if(mon == 5){
                one[i] = new Mob5();
            }
            else if(mon == 6){
                one[i] = new Mob6();
            }
            else if(mon == 7){
                one[i] = new Mob7();
            }
            else if(mon == 8){
                one[i] = new Mob8();
            }
            else if(mon == 9){
                one[i] = new Mob9();
            }
            else if(mon == 10){
                one[i] = new Mob10();
            }
            else if(mon == 11){
                one[i] = new Mob11();
            }
        }
        return one;
    }

    public static void clear(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}
