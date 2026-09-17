package y9;

import java.util.List;
public final class h0 extends d2 {
    public final String f49798a;
    public final String f49799b;
    public final String f49800c;
    public final long d;
    public final Long f49801e;
    public final boolean f49802f;
    public final l1 f49803g;
    public final c2 h;
    public final b2 f49804i;
    public final m1 f49805j;
    public final List f49806k;
    public final int f49807l;

    public h0(String str, String str2, String str3, long j3, Long l4, boolean z10, l1 l1Var, c2 c2Var, b2 b2Var, m1 m1Var, List list, int i10) {
        this.f49798a = str;
        this.f49799b = str2;
        this.f49800c = str3;
        this.d = j3;
        this.f49801e = l4;
        this.f49802f = z10;
        this.f49803g = l1Var;
        this.h = c2Var;
        this.f49804i = b2Var;
        this.f49805j = m1Var;
        this.f49806k = list;
        this.f49807l = i10;
    }

    @Override
    public final g0 a() {
        ?? obj = new Object();
        obj.f49787a = this.f49798a;
        obj.f49788b = this.f49799b;
        obj.f49789c = this.f49800c;
        obj.d = Long.valueOf(this.d);
        obj.f49790e = this.f49801e;
        obj.f49791f = Boolean.valueOf(this.f49802f);
        obj.f49792g = this.f49803g;
        obj.h = this.h;
        obj.f49793i = this.f49804i;
        obj.f49794j = this.f49805j;
        obj.f49795k = this.f49806k;
        obj.f49796l = Integer.valueOf(this.f49807l);
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
            List list2 = h0Var.f49806k;
            m1 m1Var2 = h0Var.f49805j;
            b2 b2Var2 = h0Var.f49804i;
            c2 c2Var2 = h0Var.h;
            Long l10 = h0Var.f49801e;
            String str2 = h0Var.f49800c;
            if (this.f49798a.equals(h0Var.f49798a) && this.f49799b.equals(h0Var.f49799b) && ((str = this.f49800c) != null ? str.equals(str2) : str2 == null) && this.d == h0Var.d && ((l4 = this.f49801e) != null ? l4.equals(l10) : l10 == null) && this.f49802f == h0Var.f49802f && this.f49803g.equals(h0Var.f49803g) && ((c2Var = this.h) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((b2Var = this.f49804i) != null ? b2Var.equals(b2Var2) : b2Var2 == null) && ((m1Var = this.f49805j) != null ? m1Var.equals(m1Var2) : m1Var2 == null) && ((list = this.f49806k) != null ? list.equals(list2) : list2 == null) && this.f49807l == h0Var.f49807l) {
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
        int hashCode6 = (((this.f49798a.hashCode() ^ 1000003) * 1000003) ^ this.f49799b.hashCode()) * 1000003;
        int i11 = 0;
        String str = this.f49800c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.d;
        int i12 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        Long l4 = this.f49801e;
        if (l4 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l4.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        if (this.f49802f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode7 = (((i13 ^ i10) * 1000003) ^ this.f49803g.hashCode()) * 1000003;
        c2 c2Var = this.h;
        if (c2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2Var.hashCode();
        }
        int i14 = (hashCode7 ^ hashCode3) * 1000003;
        b2 b2Var = this.f49804i;
        if (b2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = b2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        m1 m1Var = this.f49805j;
        if (m1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = m1Var.hashCode();
        }
        int i16 = (i15 ^ hashCode5) * 1000003;
        List list = this.f49806k;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((i16 ^ i11) * 1000003) ^ this.f49807l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f49798a);
        sb2.append(", identifier=");
        sb2.append(this.f49799b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f49800c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.f49801e);
        sb2.append(", crashed=");
        sb2.append(this.f49802f);
        sb2.append(", app=");
        sb2.append(this.f49803g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f49804i);
        sb2.append(", device=");
        sb2.append(this.f49805j);
        sb2.append(", events=");
        sb2.append(this.f49806k);
        sb2.append(", generatorType=");
        return a4.a.n(this.f49807l, "}", sb2);
    }
}
