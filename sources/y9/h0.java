package y9;

import java.util.List;
public final class h0 extends d2 {
    public final String f51946a;
    public final String f51947b;
    public final String f51948c;
    public final long d;
    public final Long f51949e;
    public final boolean f51950f;
    public final l1 f51951g;
    public final c2 h;
    public final b2 f51952i;
    public final m1 f51953j;
    public final List f51954k;
    public final int f51955l;

    public h0(String str, String str2, String str3, long j3, Long l4, boolean z10, l1 l1Var, c2 c2Var, b2 b2Var, m1 m1Var, List list, int i10) {
        this.f51946a = str;
        this.f51947b = str2;
        this.f51948c = str3;
        this.d = j3;
        this.f51949e = l4;
        this.f51950f = z10;
        this.f51951g = l1Var;
        this.h = c2Var;
        this.f51952i = b2Var;
        this.f51953j = m1Var;
        this.f51954k = list;
        this.f51955l = i10;
    }

    @Override
    public final g0 a() {
        ?? obj = new Object();
        obj.f51935a = this.f51946a;
        obj.f51936b = this.f51947b;
        obj.f51937c = this.f51948c;
        obj.d = Long.valueOf(this.d);
        obj.f51938e = this.f51949e;
        obj.f51939f = Boolean.valueOf(this.f51950f);
        obj.f51940g = this.f51951g;
        obj.h = this.h;
        obj.f51941i = this.f51952i;
        obj.f51942j = this.f51953j;
        obj.f51943k = this.f51954k;
        obj.f51944l = Integer.valueOf(this.f51955l);
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
            List list2 = h0Var.f51954k;
            m1 m1Var2 = h0Var.f51953j;
            b2 b2Var2 = h0Var.f51952i;
            c2 c2Var2 = h0Var.h;
            Long l10 = h0Var.f51949e;
            String str2 = h0Var.f51948c;
            if (this.f51946a.equals(h0Var.f51946a) && this.f51947b.equals(h0Var.f51947b) && ((str = this.f51948c) != null ? str.equals(str2) : str2 == null) && this.d == h0Var.d && ((l4 = this.f51949e) != null ? l4.equals(l10) : l10 == null) && this.f51950f == h0Var.f51950f && this.f51951g.equals(h0Var.f51951g) && ((c2Var = this.h) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((b2Var = this.f51952i) != null ? b2Var.equals(b2Var2) : b2Var2 == null) && ((m1Var = this.f51953j) != null ? m1Var.equals(m1Var2) : m1Var2 == null) && ((list = this.f51954k) != null ? list.equals(list2) : list2 == null) && this.f51955l == h0Var.f51955l) {
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
        int hashCode6 = (((this.f51946a.hashCode() ^ 1000003) * 1000003) ^ this.f51947b.hashCode()) * 1000003;
        int i11 = 0;
        String str = this.f51948c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.d;
        int i12 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        Long l4 = this.f51949e;
        if (l4 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l4.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        if (this.f51950f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode7 = (((i13 ^ i10) * 1000003) ^ this.f51951g.hashCode()) * 1000003;
        c2 c2Var = this.h;
        if (c2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2Var.hashCode();
        }
        int i14 = (hashCode7 ^ hashCode3) * 1000003;
        b2 b2Var = this.f51952i;
        if (b2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = b2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        m1 m1Var = this.f51953j;
        if (m1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = m1Var.hashCode();
        }
        int i16 = (i15 ^ hashCode5) * 1000003;
        List list = this.f51954k;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((i16 ^ i11) * 1000003) ^ this.f51955l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f51946a);
        sb2.append(", identifier=");
        sb2.append(this.f51947b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f51948c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.f51949e);
        sb2.append(", crashed=");
        sb2.append(this.f51950f);
        sb2.append(", app=");
        sb2.append(this.f51951g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f51952i);
        sb2.append(", device=");
        sb2.append(this.f51953j);
        sb2.append(", events=");
        sb2.append(this.f51954k);
        sb2.append(", generatorType=");
        return a1.g.o(this.f51955l, "}", sb2);
    }
}
