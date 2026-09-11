package y9;

import java.util.List;
public final class m0 extends u1 {
    public final s1 f49829a;
    public final List f49830b;
    public final List f49831c;
    public final Boolean d;
    public final t1 f49832e;
    public final List f49833f;
    public final int f49834g;

    public m0(s1 s1Var, List list, List list2, Boolean bool, t1 t1Var, List list3, int i10) {
        this.f49829a = s1Var;
        this.f49830b = list;
        this.f49831c = list2;
        this.d = bool;
        this.f49832e = t1Var;
        this.f49833f = list3;
        this.f49834g = i10;
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
            List list4 = m0Var.f49833f;
            t1 t1Var2 = m0Var.f49832e;
            Boolean bool2 = m0Var.d;
            List list5 = m0Var.f49831c;
            List list6 = m0Var.f49830b;
            if (this.f49829a.equals(m0Var.f49829a) && ((list = this.f49830b) != null ? list.equals(list6) : list6 == null) && ((list2 = this.f49831c) != null ? list2.equals(list5) : list5 == null) && ((bool = this.d) != null ? bool.equals(bool2) : bool2 == null) && ((t1Var = this.f49832e) != null ? t1Var.equals(t1Var2) : t1Var2 == null) && ((list3 = this.f49833f) != null ? list3.equals(list4) : list4 == null) && this.f49834g == m0Var.f49834g) {
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
        int hashCode5 = (this.f49829a.hashCode() ^ 1000003) * 1000003;
        int i10 = 0;
        List list = this.f49830b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        List list2 = this.f49831c;
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
        t1 t1Var = this.f49832e;
        if (t1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = t1Var.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        List list3 = this.f49833f;
        if (list3 != null) {
            i10 = list3.hashCode();
        }
        return ((i14 ^ i10) * 1000003) ^ this.f49834g;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.f49829a);
        sb2.append(", customAttributes=");
        sb2.append(this.f49830b);
        sb2.append(", internalKeys=");
        sb2.append(this.f49831c);
        sb2.append(", background=");
        sb2.append(this.d);
        sb2.append(", currentProcessDetails=");
        sb2.append(this.f49832e);
        sb2.append(", appProcessDetails=");
        sb2.append(this.f49833f);
        sb2.append(", uiOrientation=");
        return a4.a.n(this.f49834g, "}", sb2);
    }
}
