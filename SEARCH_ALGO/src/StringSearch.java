public class StringSearch {
    public static void main(String[] args) {
        String name = "Dhiraj";
        char target = 'D';
        boolean isCharExist = characterExistInWord(name, target);
        boolean isChrExist = characterExistInWordInRange(name, target, 1, 3);
        System.out.println(isCharExist);
        System.out.println(isChrExist);
        System.out.println(characterExistInWord2(name, target));

    }

    static boolean characterExistInWord(String str, char target) {
        if (str.isEmpty()) return false;

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static boolean characterExistInWord2(String str, char target) {
        if (str.isEmpty()) return false;

        for (char Chr : str.toCharArray()) {
            if (target == Chr) {
                return true;
            }
        }
        return false;
    }
    static boolean characterExistInWordInRange(String str, char target, int start, int end) {
        if (str.isEmpty()) return false;

        for (int i = start; i<=end; i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
