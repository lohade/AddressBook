import java.util.ArrayList;
import java.util.Scanner;

public class Address {
    private static final ArrayList<PersonInfo>list=new ArrayList<>();
    private static final Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        boolean add=true;
        while(add){
            PersonInfo personInfo=Address.addPerson();
            list.add(personInfo);
            System.out.println("are u want more details:");
            System.out.println("enter 1 else 0:");
            int choice=scanner.nextInt();
            if(choice==1)
                add=true;
            else {
                add=false;
            }
            for(int i=0;i< list.size();i++){
                Address.display(list.get(i));

            }
        }
    }
    private static PersonInfo addPerson(){
        System.out.println("Enter name:");
        String name = scanner.nextLine();

        System.out.println("Enter email:");
        String email = scanner.next();

        System.out.println("Enter address:");
        String address = scanner.next();

        System.out.println("Enter phone no:");
        String phone = scanner.next();

        System.out.println("enter zip:");
        int zip= scanner.nextInt();

        System.out.println("Enter state:");
        String state = scanner.next();

        System.out.println("Enter city:");
        String city = scanner.next();

        PersonInfo personInfo = new PersonInfo(name,address,email,city,state,zip,phone);
        return personInfo;
    }

    private static void display(PersonInfo personInfo){
        System.out.println("Name : "+ personInfo.getName());
        System.out.println("Email : "+ personInfo.getEmail());
        System.out.println("Address : "+ personInfo.getAddress());
        System.out.println("city :" +personInfo.getCity());
        System.out.println("state :" +personInfo.getState());
        System.out.println("zip:" +personInfo.getZip());
        System.out.println("phone:" +personInfo.getPhone());
        System.out.println("-----------------------------------------------------");
    }
}
