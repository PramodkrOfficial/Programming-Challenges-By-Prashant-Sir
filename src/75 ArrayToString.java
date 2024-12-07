class ArrayToString {
    public static void main(String[] args) {
        String[] arr = new String[] {"This", "is", "the", "best", "and", "most", "Detailed",
                       "course", "on", "Java", "on", "the", "internet."};
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s).append(" ");
        }
        System.out.println(sb);
    }
}
