class VarArgs {

    public static void main(String[] args) {
        System.out.println(concatenate("Pramod"));

        System.out.println(concatenate("Pramod","Developer"));

        System.out.println(concatenate("I", "like", "Java", "Language"));

    }
    public static String concatenate(String ...strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
}
