package w7;
public abstract class s8 {
    public static String a(String str) {
        if (d(str)) {
            return null;
        }
        if ("American Express".equalsIgnoreCase(str)) {
            return "American Express";
        }
        if ("MasterCard".equalsIgnoreCase(str)) {
            return "MasterCard";
        }
        if ("Diners Club".equalsIgnoreCase(str)) {
            return "Diners Club";
        }
        if ("Discover".equalsIgnoreCase(str)) {
            return "Discover";
        }
        if ("JCB".equalsIgnoreCase(str)) {
            return "JCB";
        }
        if ("Visa".equalsIgnoreCase(str)) {
            return "Visa";
        }
        return "Unknown";
    }

    public static String b(String str) {
        if (d(str)) {
            return null;
        }
        if ("credit".equalsIgnoreCase(str)) {
            return "credit";
        }
        if ("debit".equalsIgnoreCase(str)) {
            return "debit";
        }
        if ("prepaid".equalsIgnoreCase(str)) {
            return "prepaid";
        }
        return "unknown";
    }

    public static boolean c(String str, String... strArr) {
        if (str != null) {
            for (String str2 : strArr) {
                if (str.startsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean d(String str) {
        if (str != null && str.trim().length() != 0) {
            return false;
        }
        return true;
    }

    public static String e(String str) {
        if (d(str)) {
            return null;
        }
        return str;
    }
}
