

class pl {
    public static void main(String[] args) {

        String s1 = "mam";
        String s2 = "leeteel";
        String s3 = "letterettl";

        String rev1 = "";
        String rev2 = "";
        String rev3 = "";

        for (int i = s1.length() - 1; i >= 0; i--)
            rev1 = rev1 + s1.charAt(i);

        for (int i = s2.length() - 1; i >= 0; i--)
            rev2 = rev2 + s2.charAt(i);

        for (int i = s3.length() - 1; i >= 0; i--)
            rev3 = rev3 + s3.charAt(i);

        System.out.println(s1.equals(rev1) ? "true" : "false");
        System.out.println(s2.equals(rev2) ? "true" : "false");
        System.out.println(s3.equals(rev3) ? "true" : "false");
    }
}