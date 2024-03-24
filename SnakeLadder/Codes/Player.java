package player;

import java.util.Scanner;

public class Player {
    String name;
    String contactNo;
    String emailId;
    String address;
    int age;

    public void setPlayerDetails(String name,String emailId,String contactNo,String address,int age){
        this.name=name;
        this.emailId=emailId;
        this.contactNo=contactNo;
        this.address=address;
        this.age=age;
    }

    public void setPlayerName(String name)
{
        this.name=name;
}

    
    public void getPlayerDetails(){
        System.out.println("PLAYER DETAILS");
        System.out.println("Player name: "+this.name);
        System.out.println("Player age: "+this.age);
        System.out.println("Player contactNo:"+this.contactNo);
        System.out.println("Player emailId: "+this.emailId);
        System.out.println("Player address: "+this.address);

    }

    public String  getPlayerName(){
        return this.name;
    } 
    
    public void setPlayerDetailsFromUserInput(Player p){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter player name:");
         name=scn.nextLine();
        System.out.println("Enter email Id:");
         emailId=scn.nextLine();
        System.out.println("Enter contact no:");
         address=scn.nextLine();
        System.out.println("Enter age:");
         age=scn.nextInt();
        System.out.println("Enter address:");
         address=scn.nextLine();

         p.setPlayerDetails(name, emailId, contactNo, address, age);
        

        
    }



}
