public class Lab3 {
    public static void main(String[] args) {
        HashTable<String, Integer> hashTable = new HashTable<>();
        hashTable.put("alo", 3);
        System.out.println(hashTable.get("alo"));
    }
}