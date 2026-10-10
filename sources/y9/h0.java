package y9;

import java.util.List;
public final class h0 extends d2 {
    public final String f51990a;
    public final String f51991b;
    public final String f51992c;
    public final long d;
    public final Long f51993e;
    public final boolean f51994f;
    public final l1 f51995g;
    public final c2 h;
    public final b2 f51996i;
    public final m1 f51997j;
    public final List f51998k;
    public final int f51999l;

    public h0(String str, String str2, String str3, long j3, Long l4, boolean z10, l1 l1Var, c2 c2Var, b2 b2Var, m1 m1Var, List list, int i10) {
        this.f51990a = str;
        this.f51991b = str2;
        this.f51992c = str3;
        this.d = j3;
        this.f51993e = l4;
        this.f51994f = z10;
        this.f51995g = l1Var;
        this.h = c2Var;
        this.f51996i = b2Var;
        this.f51997j = m1Var;
        this.f51998k = list;
        this.f51999l = i10;
    }

    @Override
    public final g0 a() {
        ?? obj = new Object();
        obj.f51979a = this.f51990a;
        obj.f51980b = this.f51991b;
        obj.f51981c = this.f51992c;
        obj.d = Long.valueOf(this.d);
        obj.f51982e = this.f51993e;
        obj.f51983f = Boolean.valueOf(this.f51994f);
        obj.f51984g = this.f51995g;
        obj.h = this.h;
        obj.f51985i = this.f51996i;
        obj.f51986j = this.f51997j;
        obj.f51987k = this.f51998k;
        obj.f51988l = Integer.valueOf(this.f51999l);
        return obj;
    }

    public final boolean equals(Object obj) {
        String str;
        Long l4;
        c2 c2Var;
        b2 b2Var;
        m1 m1Var;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d2) {
            h0 h0Var = (h0) ((d2) obj);
            List list2 = h0Var.f51998k;
            m1 m1Var2 = h0Var.f51997j;
            b2 b2Var2 = h0Var.f51996i;
            c2 c2Var2 = h0Var.h;
            Long l10 = h0Var.f51993e;
            String str2 = h0Var.f51992c;
            if (this.f51990a.equals(h0Var.f51990a) && this.f51991b.equals(h0Var.f51991b) && ((str = this.f51992c) != null ? str.equals(str2) : str2 == null) && this.d == h0Var.d && ((l4 = this.f51993e) != null ? l4.equals(l10) : l10 == null) && this.f51994f == h0Var.f51994f && this.f51995g.equals(h0Var.f51995g) && ((c2Var = this.h) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((b2Var = this.f51996i) != null ? b2Var.equals(b2Var2) : b2Var2 == null) && ((m1Var = this.f51997j) != null ? m1Var.equals(m1Var2) : m1Var2 == null) && ((list = this.f51998k) != null ? list.equals(list2) : list2 == null) && this.f51999l == h0Var.f51999l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i10;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((this.f51990a.hashCode() ^ 1000003) * 1000003) ^ this.f51991b.hashCode()) * 1000003;
        int i11 = 0;
        String str = this.f51992c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.d;
        int i12 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        Long l4 = this.f51993e;
        if (l4 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l4.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        if (this.f51994f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode7 = (((i13 ^ i10) * 1000003) ^ this.f51995g.hashCode()) * 1000003;
        c2 c2Var = this.h;
        if (c2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2Var.hashCode();
        }
        int i14 = (hashCode7 ^ hashCode3) * 1000003;
        b2 b2Var = this.f51996i;
        if (b2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = b2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        m1 m1Var = this.f51997j;
        if (m1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = m1Var.hashCode();
        }
        int i16 = (i15 ^ hashCode5) * 1000003;
        List list = this.f51998k;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((i16 ^ i11) * 1000003) ^ this.f51999l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f51990a);
        sb2.append(", identifier=");
        sb2.append(this.f51991b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f51992c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.f51993e);
        sb2.append(", crashed=");
        sb2.append(this.f51994f);
        sb2.append(", app=");
        sb2.append(this.f51995g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f51996i);
        sb2.append(", device=");
        sb2.append(this.f51997j);
        sb2.append(", events=");
        sb2.append(this.f51998k);
        sb2.append(", generatorType=");
        return a1.g.o(this.f51999l, "}", sb2);
    }
}
