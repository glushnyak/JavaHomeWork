package com.pb.glushnyak.hw11;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;


import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

public class PhoneBook {
    List<Clients> phoneBook = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addClient(){
        System.out.println("Введите ФИО клиента:");
        String name = sc.nextLine();

        ArrayList<String> tl = new ArrayList<>();
        String answer = "Да";
        while (answer.equals("Да")){
            System.out.println("Введите номер телефона, хотябы один в формате +380");
            tl.add(sc.nextLine());
            System.out.println("Будет дополнительный номер телефона?");
            System.out.println("Ответьте Да или Нет");
            answer = sc.nextLine();
        }

        System.out.println("Дата рождения клиента известна? Да или Нет");
        String dateB = sc.nextLine();
        LocalDate Birthday = null;
        if (dateB.equals("Да")){
            System.out.println("День рождения:");
            int day = sc.nextInt();
            System.out.println("Месяц рождения:");
            int month = sc.nextInt();
            System.out.println("Год рождения:");
            int year = sc.nextInt();
            Birthday = LocalDate.of(year, month, day);
            sc.nextLine();
        }

        System.out.println("Адрес клиента известен? Да или Нет");
        String adr = sc.nextLine();
        String address = "";
        if (adr.equals("Да")){
            System.out.println("Адрес:");
            address = sc.nextLine();
        }

        if(dateB.equals("Нет") && adr.equals("Нет")){
            phoneBook.add(new Clients(name, tl));
        } else if(dateB.equals("Да") && adr.equals("Нет")){
            phoneBook.add(new Clients(name, Birthday, tl));
        } else if(dateB.equals("Нет") && adr.equals("Да")){
            phoneBook.add(new Clients(name, tl, address));
        } else {
            phoneBook.add(new Clients(name, Birthday, tl, address));
        }

    }

    public void deleteClient(String Name){
        for(int i = 0; i < phoneBook.size(); i++){
            if(phoneBook.get(i).getName().contains(Name)){
                phoneBook.remove(i);
            }
        }

    }

    public void serchClient(String Name){
        for(int i = 0; i < phoneBook.size(); i++){
            if(phoneBook.get(i).getName().contains(Name)){
                System.out.println(Name + " есть в справочнике, номера телефонов: " + phoneBook.get(i).gettel());
            }
        }
    }

    public void sortClient(){
        class byNameComparator implements Comparator<Clients>{
            @Override
            public int compare(Clients o1, Clients o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }
        byNameComparator comparator = new byNameComparator();
        phoneBook.sort(comparator);
        System.out.println(phoneBook);

    }

    public void sortdateEdit(){
        class byDateCreateNameComparator implements Comparator<Clients>{
            @Override
            public int compare(Clients o1, Clients o2) {
                return o1.getdateEdit().compareTo(o2.getdateEdit());
            }
        }
        byDateCreateNameComparator comparator = new byDateCreateNameComparator();
        phoneBook.sort(comparator);
        System.out.println(phoneBook);

    }

    public void editClient(String Name){
            System.out.println("Введите новое ФИО: ");
            String nameNew = sc.nextLine();
            for (int i = 0; i < phoneBook.size(); i++){
                if(phoneBook.get(i).getName().contains(Name)){
                    phoneBook.get(i).setName(nameNew);
                    phoneBook.get(i).setdateEdit();
                }
            }
        }


    public void writtenData() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        objectMapper.registerModule(module);

        String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(phoneBook);
        objectMapper.writeValue(new File("phoneBook.json"),phoneBook);
        System.out.println(json);
    }

    public ArrayList<Clients> loadingData() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        objectMapper.registerModule(module);

        File filePhoneBook = new File("phoneBook.json");
        ArrayList<Clients> Client = objectMapper.readValue(filePhoneBook, new TypeReference<ArrayList<Clients>>() {});
        System.out.println(Client);
        return Client;


    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBook=" + phoneBook.toString() +
                '}';
    }
}