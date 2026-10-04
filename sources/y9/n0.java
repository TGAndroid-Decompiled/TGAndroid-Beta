package y9;

import java.util.List;
public final class n0 extends s1 {
    public final List f50722a;
    public final o1 f50723b;
    public final g1 f50724c;
    public final p1 d;
    public final List f50725e;

    public n0(List list, p0 p0Var, g1 g1Var, q0 q0Var, List list2) {
        this.f50722a = list;
        this.f50723b = p0Var;
        this.f50724c = g1Var;
        this.d = q0Var;
        this.f50725e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s1) {
            s1 s1Var = (s1) obj;
            List list = this.f50722a;
            if (list != null ? list.equals(((n0) s1Var).f50722a) : ((n0) s1Var).f50722a == null) {
                o1 o1Var = this.f50723b;
                if (o1Var != null ? o1Var.equals(((n0) s1Var).f50723b) : ((n0) s1Var).f50723b == null) {
                    g1 g1Var = this.f50724c;
                    if (g1Var != null ? g1Var.equals(((n0) s1Var).f50724c) : ((n0) s1Var).f50724c == null) {
                        n0 n0Var = (n0) s1Var;
                        if (this.d.equals(n0Var.d) && this.f50725e.equals(n0Var.f50725e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i10 = 0;
        List list = this.f50722a;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        o1 o1Var = this.f50723b;
        if (o1Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = o1Var.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        g1 g1Var = this.f50724c;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return ((((i10 ^ i12) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f50725e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f50722a + ", exception=" + this.f50723b + ", appExitInfo=" + this.f50724c + ", signal=" + this.d + ", binaries=" + this.f50725e + "}";
    }
}
