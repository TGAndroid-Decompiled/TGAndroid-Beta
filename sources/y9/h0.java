package y9;

import java.util.List;
public final class h0 extends d2 {
    public final String f46916a;
    public final String f46917b;
    public final String f46918c;
    public final long d;
    public final Long e;
    public final boolean f46919f;
    public final l1 f46920g;
    public final c2 h;
    public final b2 f46921i;
    public final m1 f46922j;
    public final List f46923k;
    public final int f46924l;

    public h0(String str, String str2, String str3, long j3, Long l4, boolean z10, l1 l1Var, c2 c2Var, b2 b2Var, m1 m1Var, List list, int i10) {
        this.f46916a = str;
        this.f46917b = str2;
        this.f46918c = str3;
        this.d = j3;
        this.e = l4;
        this.f46919f = z10;
        this.f46920g = l1Var;
        this.h = c2Var;
        this.f46921i = b2Var;
        this.f46922j = m1Var;
        this.f46923k = list;
        this.f46924l = i10;
    }

    @Override
    public final g0 a() {
        ?? obj = new Object();
        obj.f46906a = this.f46916a;
        obj.f46907b = this.f46917b;
        obj.f46908c = this.f46918c;
        obj.d = Long.valueOf(this.d);
        obj.e = this.e;
        obj.f46909f = Boolean.valueOf(this.f46919f);
        obj.f46910g = this.f46920g;
        obj.h = this.h;
        obj.f46911i = this.f46921i;
        obj.f46912j = this.f46922j;
        obj.f46913k = this.f46923k;
        obj.f46914l = Integer.valueOf(this.f46924l);
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
            List list2 = h0Var.f46923k;
            m1 m1Var2 = h0Var.f46922j;
            b2 b2Var2 = h0Var.f46921i;
            c2 c2Var2 = h0Var.h;
            Long l10 = h0Var.e;
            String str2 = h0Var.f46918c;
            if (this.f46916a.equals(h0Var.f46916a) && this.f46917b.equals(h0Var.f46917b) && ((str = this.f46918c) != null ? str.equals(str2) : str2 == null) && this.d == h0Var.d && ((l4 = this.e) != null ? l4.equals(l10) : l10 == null) && this.f46919f == h0Var.f46919f && this.f46920g.equals(h0Var.f46920g) && ((c2Var = this.h) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((b2Var = this.f46921i) != null ? b2Var.equals(b2Var2) : b2Var2 == null) && ((m1Var = this.f46922j) != null ? m1Var.equals(m1Var2) : m1Var2 == null) && ((list = this.f46923k) != null ? list.equals(list2) : list2 == null) && this.f46924l == h0Var.f46924l) {
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
        int hashCode6 = (((this.f46916a.hashCode() ^ 1000003) * 1000003) ^ this.f46917b.hashCode()) * 1000003;
        int i11 = 0;
        String str = this.f46918c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.d;
        int i12 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        Long l4 = this.e;
        if (l4 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l4.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        if (this.f46919f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode7 = (((i13 ^ i10) * 1000003) ^ this.f46920g.hashCode()) * 1000003;
        c2 c2Var = this.h;
        if (c2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2Var.hashCode();
        }
        int i14 = (hashCode7 ^ hashCode3) * 1000003;
        b2 b2Var = this.f46921i;
        if (b2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = b2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        m1 m1Var = this.f46922j;
        if (m1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = m1Var.hashCode();
        }
        int i16 = (i15 ^ hashCode5) * 1000003;
        List list = this.f46923k;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((i16 ^ i11) * 1000003) ^ this.f46924l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f46916a);
        sb2.append(", identifier=");
        sb2.append(this.f46917b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f46918c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.e);
        sb2.append(", crashed=");
        sb2.append(this.f46919f);
        sb2.append(", app=");
        sb2.append(this.f46920g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f46921i);
        sb2.append(", device=");
        sb2.append(this.f46922j);
        sb2.append(", events=");
        sb2.append(this.f46923k);
        sb2.append(", generatorType=");
        return a4.a.o(this.f46924l, "}", sb2);
    }
}
