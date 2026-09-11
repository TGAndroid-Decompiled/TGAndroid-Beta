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
            if (Objects.equals(Objects.toString(p0Var.f8667a), Objects.toString(p0Var2.f8667a)) && Objects.equals(p0Var.f8669c, p0Var2.f8669c) && Boolean.valueOf(p0Var.f8670e).equals(Boolean.valueOf(p0Var2.f8670e)) && Boolean.valueOf(p0Var.f8671f).equals(Boolean.valueOf(p0Var2.f8671f))) {
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
        return Objects.hash(p0Var.f8667a, p0Var.f8669c, Boolean.valueOf(p0Var.f8670e), Boolean.valueOf(p0Var.f8671f));
    }
}
