package z9;

import java.util.List;
public final class h0 extends d2 {
    public final String f51384a;
    public final String f51385b;
    public final String f51386c;
    public final long d;
    public final Long e;
    public final boolean f51387f;
    public final l1 f51388g;
    public final c2 h;
    public final b2 f51389i;
    public final m1 f51390j;
    public final List f51391k;
    public final int f51392l;

    public h0(String str, String str2, String str3, long j10, Long l4, boolean z10, l1 l1Var, c2 c2Var, b2 b2Var, m1 m1Var, List list, int i10) {
        this.f51384a = str;
        this.f51385b = str2;
        this.f51386c = str3;
        this.d = j10;
        this.e = l4;
        this.f51387f = z10;
        this.f51388g = l1Var;
        this.h = c2Var;
        this.f51389i = b2Var;
        this.f51390j = m1Var;
        this.f51391k = list;
        this.f51392l = i10;
    }

    @Override
    public final g0 a() {
        ?? obj = new Object();
        obj.f51374a = this.f51384a;
        obj.f51375b = this.f51385b;
        obj.f51376c = this.f51386c;
        obj.d = Long.valueOf(this.d);
        obj.e = this.e;
        obj.f51377f = Boolean.valueOf(this.f51387f);
        obj.f51378g = this.f51388g;
        obj.h = this.h;
        obj.f51379i = this.f51389i;
        obj.f51380j = this.f51390j;
        obj.f51381k = this.f51391k;
        obj.f51382l = Integer.valueOf(this.f51392l);
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
            List list2 = h0Var.f51391k;
            m1 m1Var2 = h0Var.f51390j;
            b2 b2Var2 = h0Var.f51389i;
            c2 c2Var2 = h0Var.h;
            Long l10 = h0Var.e;
            String str2 = h0Var.f51386c;
            if (this.f51384a.equals(h0Var.f51384a) && this.f51385b.equals(h0Var.f51385b) && ((str = this.f51386c) != null ? str.equals(str2) : str2 == null) && this.d == h0Var.d && ((l4 = this.e) != null ? l4.equals(l10) : l10 == null) && this.f51387f == h0Var.f51387f && this.f51388g.equals(h0Var.f51388g) && ((c2Var = this.h) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((b2Var = this.f51389i) != null ? b2Var.equals(b2Var2) : b2Var2 == null) && ((m1Var = this.f51390j) != null ? m1Var.equals(m1Var2) : m1Var2 == null) && ((list = this.f51391k) != null ? list.equals(list2) : list2 == null) && this.f51392l == h0Var.f51392l) {
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
        int hashCode6 = (((this.f51384a.hashCode() ^ 1000003) * 1000003) ^ this.f51385b.hashCode()) * 1000003;
        int i11 = 0;
        String str = this.f51386c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.d;
        int i12 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l4 = this.e;
        if (l4 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l4.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        if (this.f51387f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode7 = (((i13 ^ i10) * 1000003) ^ this.f51388g.hashCode()) * 1000003;
        c2 c2Var = this.h;
        if (c2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2Var.hashCode();
        }
        int i14 = (hashCode7 ^ hashCode3) * 1000003;
        b2 b2Var = this.f51389i;
        if (b2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = b2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        m1 m1Var = this.f51390j;
        if (m1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = m1Var.hashCode();
        }
        int i16 = (i15 ^ hashCode5) * 1000003;
        List list = this.f51391k;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((i16 ^ i11) * 1000003) ^ this.f51392l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f51384a);
        sb2.append(", identifier=");
        sb2.append(this.f51385b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f51386c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.e);
        sb2.append(", crashed=");
        sb2.append(this.f51387f);
        sb2.append(", app=");
        sb2.append(this.f51388g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f51389i);
        sb2.append(", device=");
        sb2.append(this.f51390j);
        sb2.append(", events=");
        sb2.append(this.f51391k);
        sb2.append(", generatorType=");
        return a1.g.n(this.f51392l, "}", sb2);
    }
}
