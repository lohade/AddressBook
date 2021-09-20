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
        boolean status=true;
        do {
            System.out.println("Enter choice to do operation like:");
            System.out.println("1:adding details:\n2:Display whole address book:\n3:for edit the details:\n4:to remove data:\n5:Exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    boolean isAdd = true;
                    while (isAdd) {
                        PersonInfo personInfo = Address.addPerson();
                        list.add(personInfo);
                        System.out.println("if you want add more details please enter 1 else 0:");
                        int num = scanner.nextInt();
                        if (num == 1)
                            isAdd = true;
                        else
                            isAdd = false;

                    }
                    askUser();
                    break;

                case 2:
                    for (int i = 0; i < list.size(); i++) {
                        Address.display(list.get(i));

                    }
                    askUser();
                    break;

                case 3:
                    edit();
                    askUser();
                    break;

                case 4:
                    remove();
                    askUser();
                    break;

                case 5:
                    status=false;
                    break;

            }
        }while(status);
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

    public  static void edit()
    {
        System.out.println("enter email to edit information:");
        String email=scanner.next();
        for(int i=0;i< list.size();i++)
        {
            if(list.get(i).getEmail().equals(email))
            {
                System.out.println("1:edit first name:\n2:edit surname:\n3:edit email:\n4:edit address:\n5:edit city:\n6:edit state:\n7:edit zip:\n8:edit phone:\n");
                int edit_option = scanner.nextInt();
                switch (edit_option) {
                    case 1:

                        System.out.println("Enter the firstname to edit::");
                        String edit_name = scanner.next();
                        list.get(i).setName(edit_name);
                        break;

                    case 2:

                        System.out.println("Enter the surname to edit:");
                        String edit_surname = scanner.next();
                        list.get(i).setSurname(edit_surname);
                        break;

                    case 3:
                        System.out.println("enter email to edit:");
                        String edit_email=scanner.next();
                        list.get(i).setEmail(edit_email);
                        break;

                    case 4:
                        System.out.println("enter address to edit:");
                        String edit_address=scanner.next();
                        list.get(i).setAddress(edit_address);
                        break;
                    case 5:
                        System.out.println("enter city to edit:");
                        String edit_city=scanner.next();
                        list.get(i).setEmail(edit_city);
                        break;
                    case 6:
                        System.out.println("enter state to edit:");
                        String edit_state=scanner.next();
                        list.get(i).setState(edit_state);
                        break;
                    case 7:
                        System.out.println("enter zip to edit:");
                        int edit_zip=scanner.nextInt();
                        list.get(i).setZip(edit_zip);
                        break;
                    case 8:
                        System.out.println("enter phone to edit:");
                        String edit_phone=scanner.next();
                        list.get(i).setPhone(edit_phone);
                        break;

                }
            }

        }
    }

    public static void remove()
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
    }

}