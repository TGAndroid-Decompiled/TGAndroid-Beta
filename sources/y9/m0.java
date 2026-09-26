package y9;

import java.util.List;
public final class m0 extends u1 {
    public final s1 f46859a;
    public final List f46860b;
    public final List f46861c;
    public final Boolean d;
    public final t1 e;
    public final List f46862f;
    public final int f46863g;

    public m0(s1 s1Var, List list, List list2, Boolean bool, t1 t1Var, List list3, int i10) {
        this.f46859a = s1Var;
        this.f46860b = list;
        this.f46861c = list2;
        this.d = bool;
        this.e = t1Var;
        this.f46862f = list3;
        this.f46863g = i10;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        t1 t1Var;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1) {
            m0 m0Var = (m0) ((u1) obj);
            List list4 = m0Var.f46862f;
            t1 t1Var2 = m0Var.e;
            Boolean bool2 = m0Var.d;
            List list5 = m0Var.f46861c;
            List list6 = m0Var.f46860b;
            if (this.f46859a.equals(m0Var.f46859a) && ((list = this.f46860b) != null ? list.equals(list6) : list6 == null) && ((list2 = this.f46861c) != null ? list2.equals(list5) : list5 == null) && ((bool = this.d) != null ? bool.equals(bool2) : bool2 == null) && ((t1Var = this.e) != null ? t1Var.equals(t1Var2) : t1Var2 == null) && ((list3 = this.f46862f) != null ? list3.equals(list4) : list4 == null) && this.f46863g == m0Var.f46863g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (this.f46859a.hashCode() ^ 1000003) * 1000003;
        int i10 = 0;
        List list = this.f46860b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        List list2 = this.f46861c;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        Boolean bool = this.d;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i13 = (i12 ^ hashCode3) * 1000003;
        t1 t1Var = this.e;
        if (t1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = t1Var.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        List list3 = this.f46862f;
        if (list3 != null) {
            i10 = list3.hashCode();
        }
        return ((i14 ^ i10) * 1000003) ^ this.f46863g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.f46859a);
        sb2.append(", customAttributes=");
        sb2.append(this.f46860b);
        sb2.append(", internalKeys=");
        sb2.append(this.f46861c);
        sb2.append(", background=");
        sb2.append(this.d);
        sb2.append(", currentProcessDetails=");
        sb2.append(this.e);
        sb2.append(", appProcessDetails=");
        sb2.append(this.f46862f);
        sb2.append(", uiOrientation=");
        return a4.a.o(this.f46863g, "}", sb2);
    }
}
