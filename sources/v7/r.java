package v7;

import j$.util.Objects;
public abstract class r {
    public static boolean a(e0.m0 m0Var, e0.m0 m0Var2) {
        if (m0Var == null && m0Var2 == null) {
            return true;
        }
        if (m0Var == null || m0Var2 == null) {
            return false;
        }
        String str = m0Var.d;
        String str2 = m0Var2.d;
        if (str == null && str2 == null) {
            if (Objects.equals(Objects.toString(m0Var.f8131a), Objects.toString(m0Var2.f8131a)) && Objects.equals(m0Var.f8133c, m0Var2.f8133c) && Boolean.valueOf(m0Var.e).equals(Boolean.valueOf(m0Var2.e)) && Boolean.valueOf(m0Var.f8134f).equals(Boolean.valueOf(m0Var2.f8134f))) {
                return true;
            }
            return false;
        }
        return Objects.equals(str, str2);
    }

    public static int b(e0.m0 m0Var) {
        if (m0Var == null) {
            return 0;
        }
        String str = m0Var.d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(m0Var.f8131a, m0Var.f8133c, Boolean.valueOf(m0Var.e), Boolean.valueOf(m0Var.f8134f));
    }
}
