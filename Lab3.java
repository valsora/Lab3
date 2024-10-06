import java.util.HashMap;

public class Lab3 {
    public static void main(String[] args) {
        //task1
        HashTable<String, Integer> hashTable = new HashTable<>();
        System.out.println(hashTable.isEmpty());
        System.out.println(hashTable.getSize());
        hashTable.put("alo", 33);
        System.out.println(hashTable.getSize());
        hashTable.put("da", 55);
        System.out.println(hashTable.getSize());
        hashTable.put("alo", 34);
        System.out.println(hashTable.getSize());
        System.out.println(hashTable.get("alo"));
        System.out.println(hashTable.get("da"));
        System.out.println(hashTable.get("ko"));
        System.out.println(hashTable.isEmpty());
        hashTable.remove("alo");
        System.out.println(hashTable.getSize());
        System.out.println(hashTable.get("alo"));
        System.out.println(hashTable.get("da"));
        hashTable.remove("net");
        hashTable.remove("da");
        System.out.println(hashTable.isEmpty());
        //task2
        HashMap<String, Contact> phoneBook = new HashMap<>();
        phoneBook.put("+7 917 555-35-35", new Contact("Andrew", "Andrew@gmail.com", "skype: adrew35"));
        phoneBook.put("+7 123 789-14-48", new Contact("Ben", "yees@gmail.com", "No"));
        phoneBook.put("+7 501 212-27-29", new Contact("Boba", "BF@mail.ru", "discord: bobafett#0405"));
        System.out.println(phoneBook.get("+7 123 789-14-48").getName());
        phoneBook.remove("+7 501 212-27-29");
    }
}