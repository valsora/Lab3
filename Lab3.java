public class Lab3 {
    public static void main(String[] args) {
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
        System.out.println(hashTable.get("ko"));
        hashTable.remove("net");
    }
}