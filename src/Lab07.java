import java.util.HashSet;

public class Lab07 {
    public static void main(String[] args){
        HashSet<String> hs = new HashSet<>(10);
        HashSet<String> sth = new HashSet<>(10);
        hs.add("joe");
        hs.add("mama");
        hs.add("lolz");

        sth.add("joe");
        sth.add("mama");
        sth.add("huh");
        sth.add("bruh");
        //Object[] arr = hs.toArray();
        System.out.println(hs);
        System.out.println(sth);
        //hs.remove("lolz");
        //hs.addAll(sth);
        hs.retainAll(sth);
        System.out.println(hs);

        //hs.clear();

        System.out.println();
        System.out.println(hs.size());
        System.out.println(hs.contains("lolz"));
        System.out.println(hs.containsAll(sth));
    }
}
