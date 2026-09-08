package v7;

import j$.util.Objects;
public abstract class u {
    public static boolean a(e0.p0 p0Var, e0.p0 p0Var2) {
        if (p0Var == null && p0Var2 == null) {
            return true;
        }
        if (p0Var == null || p0Var2 == null) {
            return false;
        }
        String str = p0Var.d;
        String str2 = p0Var2.d;
        if (str == null && str2 == null) {
            if (Objects.equals(Objects.toString(p0Var.f8695a), Objects.toString(p0Var2.f8695a)) && Objects.equals(p0Var.f8697c, p0Var2.f8697c) && Boolean.valueOf(p0Var.f8698e).equals(Boolean.valueOf(p0Var2.f8698e)) && Boolean.valueOf(p0Var.f8699f).equals(Boolean.valueOf(p0Var2.f8699f))) {
                return true;
            }
            return false;
        }
        return Objects.equals(str, str2);
    }

    public static int b(e0.p0 p0Var) {
        if (p0Var == null) {
            return 0;
        }
        String str = p0Var.d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(p0Var.f8695a, p0Var.f8697c, Boolean.valueOf(p0Var.f8698e), Boolean.valueOf(p0Var.f8699f));
    }
}
