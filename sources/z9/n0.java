package z9;

import java.util.List;
public final class n0 extends s1 {
    public final List f51441a;
    public final o1 f51442b;
    public final g1 f51443c;
    public final p1 d;
    public final List e;

    public n0(List list, p0 p0Var, g1 g1Var, q0 q0Var, List list2) {
        this.f51441a = list;
        this.f51442b = p0Var;
        this.f51443c = g1Var;
        this.d = q0Var;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s1) {
            s1 s1Var = (s1) obj;
            List list = this.f51441a;
            if (list != null ? list.equals(((n0) s1Var).f51441a) : ((n0) s1Var).f51441a == null) {
                o1 o1Var = this.f51442b;
                if (o1Var != null ? o1Var.equals(((n0) s1Var).f51442b) : ((n0) s1Var).f51442b == null) {
                    g1 g1Var = this.f51443c;
                    if (g1Var != null ? g1Var.equals(((n0) s1Var).f51443c) : ((n0) s1Var).f51443c == null) {
                        n0 n0Var = (n0) s1Var;
                        if (this.d.equals(n0Var.d) && this.e.equals(n0Var.e)) {
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
        List list = this.f51441a;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        o1 o1Var = this.f51442b;
        if (o1Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = o1Var.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        g1 g1Var = this.f51443c;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return ((((i10 ^ i12) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f51441a + ", exception=" + this.f51442b + ", appExitInfo=" + this.f51443c + ", signal=" + this.d + ", binaries=" + this.e + "}";
    }
}
