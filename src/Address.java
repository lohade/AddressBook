import java.util.ArrayList;
import java.util.Scanner;

public class Address {
    private static final ArrayList<PersonInfo>list=new ArrayList<>();
    private static final Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        Address addressBook = new Address();
        addressBook.askUser();
    }

    void askUser(){
            System.out.println("Enter choice to do operation like:");
            System.out.println("1:add  more person details:\n2:Display whole address book:\n3:Remove any details:\n");
            int option = scanner.nextInt();
            switch (option)
            {
                case 1:
                    boolean isAdd=true;
                    while(isAdd) {
                        PersonInfo personInfo = Address.addPerson();
                        list.add(personInfo);
                        System.out.println("if you want add more details please enter 1 else 0:");
                        int num= scanner.nextInt();
                        if(num==1)
                            isAdd=true;
                        else
                            isAdd=false;

                        }
                    askUser();
                    break;

                case 2:
                    for(int i=0;i< list.size();i++)
                    {
                        Address.display(list.get(i));

                    }
                    askUser();
                    break;
                /*
                case 3:
                    Address.remove();
                    askUser();
                    break;
                */



            }
    }

    private static PersonInfo addPerson(){
        System.out.println("Enter name:");
        String name = scanner.next();

        System.out.println("enter surname:");
        String surname= scanner.next();

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

        PersonInfo personInfo = new PersonInfo(name,surname,address,email,city,state,zip,phone);
        return personInfo;
    }

    private static void display(PersonInfo personInfo){
        System.out.println("Name : "+ personInfo.getName());
        System.out.println("Surname : "+ personInfo.getSurname());
        System.out.println("Email : "+ personInfo.getEmail());
        System.out.println("Address : "+ personInfo.getAddress());
        System.out.println("city :" +personInfo.getCity());
        System.out.println("state :" +personInfo.getState());
        System.out.println("zip:" +personInfo.getZip());
        System.out.println("phone:" +personInfo.getPhone());
        System.out.println("-----------------------------------------------------");
    }

    /*
    private static void remove()
    {
        System.out.println("enter email to be remove from address book:");
        String email=scanner.next();
        for(int i=0;i<list.size();i++)
        {
            PersonInfo personInfo= list.get(i);
            if(email.equals(personInfo.getEmail()))
            {
                list.remove(personInfo);
            }
        }
    }*/




}
