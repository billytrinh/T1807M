package Lab_session6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone{
    public ArrayList<PhoneNumber> PhoneList;

    public PhoneBook(){
        this.PhoneList = new ArrayList<>();
    }

    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneNumber pN:this.PhoneList){
            if(pN.getName().equals(name)){
                if(pN.getPhone().equals(phone)){
                    System.out.println("Sdt da ton tai");
                    return;
                }
                pN.setPhone(pN.getPhone()+":"+phone);
                return;
            }
        }
        this.PhoneList.add(new PhoneNumber(name,phone));
    }

    @Override
    public void removePhone(String name) {
        for (PhoneNumber pN:this.PhoneList){
            if(pN.getName().equals(name)){
                this.PhoneList.remove(pN);
                System.out.println("Done.");
            }
        }
    }

    @Override
    public void updatePhone(String name, String newphone) {
        for (PhoneNumber pN:this.PhoneList){
            if(pN.getName().equals(name)){
               pN.setPhone(newphone);
               System.out.println("done");
            }
        }
    }

    @Override
    public void searchPhone(String name) {
        for (PhoneNumber pN:this.PhoneList){
            if(pN.getName().equals(name)){
                System.out.println(pN.getName()+" "+pN.getPhone());
            }
        }
    }

    @Override
    public void sort() {
        Collections.sort(this.PhoneList,new Comparator<PhoneNumber>(){
            public int compare(PhoneNumber o1,PhoneNumber o2){
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
