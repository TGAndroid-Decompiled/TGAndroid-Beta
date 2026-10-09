package y9;

import java.util.List;
public final class h0 extends d2 {
    public final String f51944a;
    public final String f51945b;
    public final String f51946c;
    public final long d;
    public final Long f51947e;
    public final boolean f51948f;
    public final l1 f51949g;
    public final c2 h;
    public final b2 f51950i;
    public final m1 f51951j;
    public final List f51952k;
    public final int f51953l;

    public h0(String str, String str2, String str3, long j3, Long l4, boolean z10, l1 l1Var, c2 c2Var, b2 b2Var, m1 m1Var, List list, int i10) {
        this.f51944a = str;
        this.f51945b = str2;
        this.f51946c = str3;
        this.d = j3;
        this.f51947e = l4;
        this.f51948f = z10;
        this.f51949g = l1Var;
        this.h = c2Var;
        this.f51950i = b2Var;
        this.f51951j = m1Var;
        this.f51952k = list;
        this.f51953l = i10;
    }

    @Override
    public final g0 a() {
        ?? obj = new Object();
        obj.f51933a = this.f51944a;
        obj.f51934b = this.f51945b;
        obj.f51935c = this.f51946c;
        obj.d = Long.valueOf(this.d);
        obj.f51936e = this.f51947e;
        obj.f51937f = Boolean.valueOf(this.f51948f);
        obj.f51938g = this.f51949g;
        obj.h = this.h;
        obj.f51939i = this.f51950i;
        obj.f51940j = this.f51951j;
        obj.f51941k = this.f51952k;
        obj.f51942l = Integer.valueOf(this.f51953l);
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
            List list2 = h0Var.f51952k;
            m1 m1Var2 = h0Var.f51951j;
            b2 b2Var2 = h0Var.f51950i;
            c2 c2Var2 = h0Var.h;
            Long l10 = h0Var.f51947e;
            String str2 = h0Var.f51946c;
            if (this.f51944a.equals(h0Var.f51944a) && this.f51945b.equals(h0Var.f51945b) && ((str = this.f51946c) != null ? str.equals(str2) : str2 == null) && this.d == h0Var.d && ((l4 = this.f51947e) != null ? l4.equals(l10) : l10 == null) && this.f51948f == h0Var.f51948f && this.f51949g.equals(h0Var.f51949g) && ((c2Var = this.h) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((b2Var = this.f51950i) != null ? b2Var.equals(b2Var2) : b2Var2 == null) && ((m1Var = this.f51951j) != null ? m1Var.equals(m1Var2) : m1Var2 == null) && ((list = this.f51952k) != null ? list.equals(list2) : list2 == null) && this.f51953l == h0Var.f51953l) {
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
        int hashCode6 = (((this.f51944a.hashCode() ^ 1000003) * 1000003) ^ this.f51945b.hashCode()) * 1000003;
        int i11 = 0;
        String str = this.f51946c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.d;
        int i12 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        Long l4 = this.f51947e;
        if (l4 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l4.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        if (this.f51948f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode7 = (((i13 ^ i10) * 1000003) ^ this.f51949g.hashCode()) * 1000003;
        c2 c2Var = this.h;
        if (c2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2Var.hashCode();
        }
        int i14 = (hashCode7 ^ hashCode3) * 1000003;
        b2 b2Var = this.f51950i;
        if (b2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = b2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        m1 m1Var = this.f51951j;
        if (m1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = m1Var.hashCode();
        }
        int i16 = (i15 ^ hashCode5) * 1000003;
        List list = this.f51952k;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((i16 ^ i11) * 1000003) ^ this.f51953l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f51944a);
        sb2.append(", identifier=");
        sb2.append(this.f51945b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f51946c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.f51947e);
        sb2.append(", crashed=");
        sb2.append(this.f51948f);
        sb2.append(", app=");
        sb2.append(this.f51949g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f51950i);
        sb2.append(", device=");
        sb2.append(this.f51951j);
        sb2.append(", events=");
        sb2.append(this.f51952k);
        sb2.append(", generatorType=");
        return a1.g.o(this.f51953l, "}", sb2);
    }
}
