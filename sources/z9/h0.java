package z9;

import java.util.List;
public final class h0 extends d2 {
    public final String f51844a;
    public final String f51845b;
    public final String f51846c;
    public final long d;
    public final Long e;
    public final boolean f51847f;
    public final l1 f51848g;
    public final c2 h;
    public final b2 f51849i;
    public final m1 f51850j;
    public final List f51851k;
    public final int f51852l;

    public h0(String str, String str2, String str3, long j10, Long l4, boolean z10, l1 l1Var, c2 c2Var, b2 b2Var, m1 m1Var, List list, int i10) {
        this.f51844a = str;
        this.f51845b = str2;
        this.f51846c = str3;
        this.d = j10;
        this.e = l4;
        this.f51847f = z10;
        this.f51848g = l1Var;
        this.h = c2Var;
        this.f51849i = b2Var;
        this.f51850j = m1Var;
        this.f51851k = list;
        this.f51852l = i10;
    }

    @Override
    public final g0 a() {
        ?? obj = new Object();
        obj.f51834a = this.f51844a;
        obj.f51835b = this.f51845b;
        obj.f51836c = this.f51846c;
        obj.d = Long.valueOf(this.d);
        obj.e = this.e;
        obj.f51837f = Boolean.valueOf(this.f51847f);
        obj.f51838g = this.f51848g;
        obj.h = this.h;
        obj.f51839i = this.f51849i;
        obj.f51840j = this.f51850j;
        obj.f51841k = this.f51851k;
        obj.f51842l = Integer.valueOf(this.f51852l);
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
            List list2 = h0Var.f51851k;
            m1 m1Var2 = h0Var.f51850j;
            b2 b2Var2 = h0Var.f51849i;
            c2 c2Var2 = h0Var.h;
            Long l10 = h0Var.e;
            String str2 = h0Var.f51846c;
            if (this.f51844a.equals(h0Var.f51844a) && this.f51845b.equals(h0Var.f51845b) && ((str = this.f51846c) != null ? str.equals(str2) : str2 == null) && this.d == h0Var.d && ((l4 = this.e) != null ? l4.equals(l10) : l10 == null) && this.f51847f == h0Var.f51847f && this.f51848g.equals(h0Var.f51848g) && ((c2Var = this.h) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((b2Var = this.f51849i) != null ? b2Var.equals(b2Var2) : b2Var2 == null) && ((m1Var = this.f51850j) != null ? m1Var.equals(m1Var2) : m1Var2 == null) && ((list = this.f51851k) != null ? list.equals(list2) : list2 == null) && this.f51852l == h0Var.f51852l) {
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
        int hashCode6 = (((this.f51844a.hashCode() ^ 1000003) * 1000003) ^ this.f51845b.hashCode()) * 1000003;
        int i11 = 0;
        String str = this.f51846c;
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
        if (this.f51847f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode7 = (((i13 ^ i10) * 1000003) ^ this.f51848g.hashCode()) * 1000003;
        c2 c2Var = this.h;
        if (c2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2Var.hashCode();
        }
        int i14 = (hashCode7 ^ hashCode3) * 1000003;
        b2 b2Var = this.f51849i;
        if (b2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = b2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        m1 m1Var = this.f51850j;
        if (m1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = m1Var.hashCode();
        }
        int i16 = (i15 ^ hashCode5) * 1000003;
        List list = this.f51851k;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((i16 ^ i11) * 1000003) ^ this.f51852l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f51844a);
        sb2.append(", identifier=");
        sb2.append(this.f51845b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f51846c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.e);
        sb2.append(", crashed=");
        sb2.append(this.f51847f);
        sb2.append(", app=");
        sb2.append(this.f51848g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f51849i);
        sb2.append(", device=");
        sb2.append(this.f51850j);
        sb2.append(", events=");
        sb2.append(this.f51851k);
        sb2.append(", generatorType=");
        return a1.g.n(this.f51852l, "}", sb2);
    }
}
