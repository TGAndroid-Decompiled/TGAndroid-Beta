package v7;

import j$.util.Objects;
public abstract class r {
    public static boolean a(e0.n0 n0Var, e0.n0 n0Var2) {
        if (n0Var == null && n0Var2 == null) {
            return true;
        }
        if (n0Var == null || n0Var2 == null) {
            return false;
        }
        String str = n0Var.d;
        String str2 = n0Var2.d;
        if (str == null && str2 == null) {
            if (Objects.equals(Objects.toString(n0Var.f8453a), Objects.toString(n0Var2.f8453a)) && Objects.equals(n0Var.f8455c, n0Var2.f8455c) && Boolean.valueOf(n0Var.f8456e).equals(Boolean.valueOf(n0Var2.f8456e)) && Boolean.valueOf(n0Var.f8457f).equals(Boolean.valueOf(n0Var2.f8457f))) {
                return true;
            }
            return false;
        }
        return Objects.equals(str, str2);
    }

    public static int b(e0.n0 n0Var) {
        if (n0Var == null) {
            return 0;
        }
        String str = n0Var.d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(n0Var.f8453a, n0Var.f8455c, Boolean.valueOf(n0Var.f8456e), Boolean.valueOf(n0Var.f8457f));
    }
}
