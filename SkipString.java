public class SkipString {
    public static void main(String[] args) {
        System.out.println(skip("thisapplelol"));
    }
    public static String skip(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);

        if(str.startsWith("apple")){
            return skip(str.substring(5));
        }
        else{
            return ch + skip(str.substring(1));
        }
    }
}
