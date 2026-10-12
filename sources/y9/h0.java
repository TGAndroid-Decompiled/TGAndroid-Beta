package y9;

import java.util.List;
public final class h0 extends d2 {
    public final String f52170a;
    public final String f52171b;
    public final String f52172c;
    public final long d;
    public final Long f52173e;
    public final boolean f52174f;
    public final l1 f52175g;
    public final c2 h;
    public final b2 f52176i;
    public final m1 f52177j;
    public final List f52178k;
    public final int f52179l;

    public h0(String str, String str2, String str3, long j3, Long l4, boolean z10, l1 l1Var, c2 c2Var, b2 b2Var, m1 m1Var, List list, int i10) {
        this.f52170a = str;
        this.f52171b = str2;
        this.f52172c = str3;
        this.d = j3;
        this.f52173e = l4;
        this.f52174f = z10;
        this.f52175g = l1Var;
        this.h = c2Var;
        this.f52176i = b2Var;
        this.f52177j = m1Var;
        this.f52178k = list;
        this.f52179l = i10;
    }

    @Override
    public final g0 a() {
        ?? obj = new Object();
        obj.f52159a = this.f52170a;
        obj.f52160b = this.f52171b;
        obj.f52161c = this.f52172c;
        obj.d = Long.valueOf(this.d);
        obj.f52162e = this.f52173e;
        obj.f52163f = Boolean.valueOf(this.f52174f);
        obj.f52164g = this.f52175g;
        obj.h = this.h;
        obj.f52165i = this.f52176i;
        obj.f52166j = this.f52177j;
        obj.f52167k = this.f52178k;
        obj.f52168l = Integer.valueOf(this.f52179l);
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
            List list2 = h0Var.f52178k;
            m1 m1Var2 = h0Var.f52177j;
            b2 b2Var2 = h0Var.f52176i;
            c2 c2Var2 = h0Var.h;
            Long l10 = h0Var.f52173e;
            String str2 = h0Var.f52172c;
            if (this.f52170a.equals(h0Var.f52170a) && this.f52171b.equals(h0Var.f52171b) && ((str = this.f52172c) != null ? str.equals(str2) : str2 == null) && this.d == h0Var.d && ((l4 = this.f52173e) != null ? l4.equals(l10) : l10 == null) && this.f52174f == h0Var.f52174f && this.f52175g.equals(h0Var.f52175g) && ((c2Var = this.h) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((b2Var = this.f52176i) != null ? b2Var.equals(b2Var2) : b2Var2 == null) && ((m1Var = this.f52177j) != null ? m1Var.equals(m1Var2) : m1Var2 == null) && ((list = this.f52178k) != null ? list.equals(list2) : list2 == null) && this.f52179l == h0Var.f52179l) {
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
        int hashCode6 = (((this.f52170a.hashCode() ^ 1000003) * 1000003) ^ this.f52171b.hashCode()) * 1000003;
        int i11 = 0;
        String str = this.f52172c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.d;
        int i12 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        Long l4 = this.f52173e;
        if (l4 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l4.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        if (this.f52174f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode7 = (((i13 ^ i10) * 1000003) ^ this.f52175g.hashCode()) * 1000003;
        c2 c2Var = this.h;
        if (c2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2Var.hashCode();
        }
        int i14 = (hashCode7 ^ hashCode3) * 1000003;
        b2 b2Var = this.f52176i;
        if (b2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = b2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        m1 m1Var = this.f52177j;
        if (m1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = m1Var.hashCode();
        }
        int i16 = (i15 ^ hashCode5) * 1000003;
        List list = this.f52178k;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((i16 ^ i11) * 1000003) ^ this.f52179l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f52170a);
        sb2.append(", identifier=");
        sb2.append(this.f52171b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f52172c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.f52173e);
        sb2.append(", crashed=");
        sb2.append(this.f52174f);
        sb2.append(", app=");
        sb2.append(this.f52175g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f52176i);
        sb2.append(", device=");
        sb2.append(this.f52177j);
        sb2.append(", events=");
        sb2.append(this.f52178k);
        sb2.append(", generatorType=");
        return a1.g.o(this.f52179l, "}", sb2);
    }
}
