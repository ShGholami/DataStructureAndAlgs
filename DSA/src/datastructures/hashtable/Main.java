package datastructures.hashtable;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();

        hashTable.set("eat", 20);
        hashTable.set("tea", 40);
        hashTable.set("tan", 100);
        hashTable.set("ate", 50);
        hashTable.set("nat", 80);
        hashTable.set("bat", 80);

        hashTable.printTable();
        System.out.println("-".repeat(40));
        System.out.println(hashTable.keys());

        System.out.println("-".repeat(40));

    }
}
