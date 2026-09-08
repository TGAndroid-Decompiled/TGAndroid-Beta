package y9;

import java.util.List;
public final class h0 extends d2 {
    public final String f49797a;
    public final String f49798b;
    public final String f49799c;
    public final long d;
    public final Long f49800e;
    public final boolean f49801f;
    public final l1 f49802g;
    public final c2 h;
    public final b2 f49803i;
    public final m1 f49804j;
    public final List f49805k;
    public final int f49806l;

    public h0(String str, String str2, String str3, long j3, Long l4, boolean z10, l1 l1Var, c2 c2Var, b2 b2Var, m1 m1Var, List list, int i10) {
        this.f49797a = str;
        this.f49798b = str2;
        this.f49799c = str3;
        this.d = j3;
        this.f49800e = l4;
        this.f49801f = z10;
        this.f49802g = l1Var;
        this.h = c2Var;
        this.f49803i = b2Var;
        this.f49804j = m1Var;
        this.f49805k = list;
        this.f49806l = i10;
    }

    @Override
    public final g0 a() {
        ?? obj = new Object();
        obj.f49786a = this.f49797a;
        obj.f49787b = this.f49798b;
        obj.f49788c = this.f49799c;
        obj.d = Long.valueOf(this.d);
        obj.f49789e = this.f49800e;
        obj.f49790f = Boolean.valueOf(this.f49801f);
        obj.f49791g = this.f49802g;
        obj.h = this.h;
        obj.f49792i = this.f49803i;
        obj.f49793j = this.f49804j;
        obj.f49794k = this.f49805k;
        obj.f49795l = Integer.valueOf(this.f49806l);
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
            List list2 = h0Var.f49805k;
            m1 m1Var2 = h0Var.f49804j;
            b2 b2Var2 = h0Var.f49803i;
            c2 c2Var2 = h0Var.h;
            Long l10 = h0Var.f49800e;
            String str2 = h0Var.f49799c;
            if (this.f49797a.equals(h0Var.f49797a) && this.f49798b.equals(h0Var.f49798b) && ((str = this.f49799c) != null ? str.equals(str2) : str2 == null) && this.d == h0Var.d && ((l4 = this.f49800e) != null ? l4.equals(l10) : l10 == null) && this.f49801f == h0Var.f49801f && this.f49802g.equals(h0Var.f49802g) && ((c2Var = this.h) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((b2Var = this.f49803i) != null ? b2Var.equals(b2Var2) : b2Var2 == null) && ((m1Var = this.f49804j) != null ? m1Var.equals(m1Var2) : m1Var2 == null) && ((list = this.f49805k) != null ? list.equals(list2) : list2 == null) && this.f49806l == h0Var.f49806l) {
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
        int hashCode6 = (((this.f49797a.hashCode() ^ 1000003) * 1000003) ^ this.f49798b.hashCode()) * 1000003;
        int i11 = 0;
        String str = this.f49799c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.d;
        int i12 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        Long l4 = this.f49800e;
        if (l4 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l4.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        if (this.f49801f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode7 = (((i13 ^ i10) * 1000003) ^ this.f49802g.hashCode()) * 1000003;
        c2 c2Var = this.h;
        if (c2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2Var.hashCode();
        }
        int i14 = (hashCode7 ^ hashCode3) * 1000003;
        b2 b2Var = this.f49803i;
        if (b2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = b2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        m1 m1Var = this.f49804j;
        if (m1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = m1Var.hashCode();
        }
        int i16 = (i15 ^ hashCode5) * 1000003;
        List list = this.f49805k;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((i16 ^ i11) * 1000003) ^ this.f49806l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f49797a);
        sb2.append(", identifier=");
        sb2.append(this.f49798b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f49799c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.f49800e);
        sb2.append(", crashed=");
        sb2.append(this.f49801f);
        sb2.append(", app=");
        sb2.append(this.f49802g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f49803i);
        sb2.append(", device=");
        sb2.append(this.f49804j);
        sb2.append(", events=");
        sb2.append(this.f49805k);
        sb2.append(", generatorType=");
        return a4.a.n(this.f49806l, "}", sb2);
    }
}
