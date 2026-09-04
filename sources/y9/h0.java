package y9;

import java.util.List;
public final class h0 extends d2 {
    public final String f49768a;
    public final String f49769b;
    public final String f49770c;
    public final long d;
    public final Long f49771e;
    public final boolean f49772f;
    public final l1 f49773g;
    public final c2 h;
    public final b2 f49774i;
    public final m1 f49775j;
    public final List f49776k;
    public final int f49777l;

    public h0(String str, String str2, String str3, long j3, Long l4, boolean z10, l1 l1Var, c2 c2Var, b2 b2Var, m1 m1Var, List list, int i10) {
        this.f49768a = str;
        this.f49769b = str2;
        this.f49770c = str3;
        this.d = j3;
        this.f49771e = l4;
        this.f49772f = z10;
        this.f49773g = l1Var;
        this.h = c2Var;
        this.f49774i = b2Var;
        this.f49775j = m1Var;
        this.f49776k = list;
        this.f49777l = i10;
    }

    @Override
    public final g0 a() {
        ?? obj = new Object();
        obj.f49757a = this.f49768a;
        obj.f49758b = this.f49769b;
        obj.f49759c = this.f49770c;
        obj.d = Long.valueOf(this.d);
        obj.f49760e = this.f49771e;
        obj.f49761f = Boolean.valueOf(this.f49772f);
        obj.f49762g = this.f49773g;
        obj.h = this.h;
        obj.f49763i = this.f49774i;
        obj.f49764j = this.f49775j;
        obj.f49765k = this.f49776k;
        obj.f49766l = Integer.valueOf(this.f49777l);
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
            List list2 = h0Var.f49776k;
            m1 m1Var2 = h0Var.f49775j;
            b2 b2Var2 = h0Var.f49774i;
            c2 c2Var2 = h0Var.h;
            Long l10 = h0Var.f49771e;
            String str2 = h0Var.f49770c;
            if (this.f49768a.equals(h0Var.f49768a) && this.f49769b.equals(h0Var.f49769b) && ((str = this.f49770c) != null ? str.equals(str2) : str2 == null) && this.d == h0Var.d && ((l4 = this.f49771e) != null ? l4.equals(l10) : l10 == null) && this.f49772f == h0Var.f49772f && this.f49773g.equals(h0Var.f49773g) && ((c2Var = this.h) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((b2Var = this.f49774i) != null ? b2Var.equals(b2Var2) : b2Var2 == null) && ((m1Var = this.f49775j) != null ? m1Var.equals(m1Var2) : m1Var2 == null) && ((list = this.f49776k) != null ? list.equals(list2) : list2 == null) && this.f49777l == h0Var.f49777l) {
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
        int hashCode6 = (((this.f49768a.hashCode() ^ 1000003) * 1000003) ^ this.f49769b.hashCode()) * 1000003;
        int i11 = 0;
        String str = this.f49770c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.d;
        int i12 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        Long l4 = this.f49771e;
        if (l4 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l4.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        if (this.f49772f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode7 = (((i13 ^ i10) * 1000003) ^ this.f49773g.hashCode()) * 1000003;
        c2 c2Var = this.h;
        if (c2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2Var.hashCode();
        }
        int i14 = (hashCode7 ^ hashCode3) * 1000003;
        b2 b2Var = this.f49774i;
        if (b2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = b2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        m1 m1Var = this.f49775j;
        if (m1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = m1Var.hashCode();
        }
        int i16 = (i15 ^ hashCode5) * 1000003;
        List list = this.f49776k;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((i16 ^ i11) * 1000003) ^ this.f49777l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f49768a);
        sb2.append(", identifier=");
        sb2.append(this.f49769b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f49770c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.f49771e);
        sb2.append(", crashed=");
        sb2.append(this.f49772f);
        sb2.append(", app=");
        sb2.append(this.f49773g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f49774i);
        sb2.append(", device=");
        sb2.append(this.f49775j);
        sb2.append(", events=");
        sb2.append(this.f49776k);
        sb2.append(", generatorType=");
        return a4.a.n(this.f49777l, "}", sb2);
    }
}
