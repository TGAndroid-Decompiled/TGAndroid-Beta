package y9;

import java.util.List;
public final class h0 extends d2 {
    public final String f52033a;
    public final String f52034b;
    public final String f52035c;
    public final long d;
    public final Long f52036e;
    public final boolean f52037f;
    public final l1 f52038g;
    public final c2 h;
    public final b2 f52039i;
    public final m1 f52040j;
    public final List f52041k;
    public final int f52042l;

    public h0(String str, String str2, String str3, long j3, Long l4, boolean z10, l1 l1Var, c2 c2Var, b2 b2Var, m1 m1Var, List list, int i10) {
        this.f52033a = str;
        this.f52034b = str2;
        this.f52035c = str3;
        this.d = j3;
        this.f52036e = l4;
        this.f52037f = z10;
        this.f52038g = l1Var;
        this.h = c2Var;
        this.f52039i = b2Var;
        this.f52040j = m1Var;
        this.f52041k = list;
        this.f52042l = i10;
    }

    @Override
    public final g0 a() {
        ?? obj = new Object();
        obj.f52022a = this.f52033a;
        obj.f52023b = this.f52034b;
        obj.f52024c = this.f52035c;
        obj.d = Long.valueOf(this.d);
        obj.f52025e = this.f52036e;
        obj.f52026f = Boolean.valueOf(this.f52037f);
        obj.f52027g = this.f52038g;
        obj.h = this.h;
        obj.f52028i = this.f52039i;
        obj.f52029j = this.f52040j;
        obj.f52030k = this.f52041k;
        obj.f52031l = Integer.valueOf(this.f52042l);
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
            List list2 = h0Var.f52041k;
            m1 m1Var2 = h0Var.f52040j;
            b2 b2Var2 = h0Var.f52039i;
            c2 c2Var2 = h0Var.h;
            Long l10 = h0Var.f52036e;
            String str2 = h0Var.f52035c;
            if (this.f52033a.equals(h0Var.f52033a) && this.f52034b.equals(h0Var.f52034b) && ((str = this.f52035c) != null ? str.equals(str2) : str2 == null) && this.d == h0Var.d && ((l4 = this.f52036e) != null ? l4.equals(l10) : l10 == null) && this.f52037f == h0Var.f52037f && this.f52038g.equals(h0Var.f52038g) && ((c2Var = this.h) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((b2Var = this.f52039i) != null ? b2Var.equals(b2Var2) : b2Var2 == null) && ((m1Var = this.f52040j) != null ? m1Var.equals(m1Var2) : m1Var2 == null) && ((list = this.f52041k) != null ? list.equals(list2) : list2 == null) && this.f52042l == h0Var.f52042l) {
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
        int hashCode6 = (((this.f52033a.hashCode() ^ 1000003) * 1000003) ^ this.f52034b.hashCode()) * 1000003;
        int i11 = 0;
        String str = this.f52035c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.d;
        int i12 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        Long l4 = this.f52036e;
        if (l4 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l4.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        if (this.f52037f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode7 = (((i13 ^ i10) * 1000003) ^ this.f52038g.hashCode()) * 1000003;
        c2 c2Var = this.h;
        if (c2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2Var.hashCode();
        }
        int i14 = (hashCode7 ^ hashCode3) * 1000003;
        b2 b2Var = this.f52039i;
        if (b2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = b2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        m1 m1Var = this.f52040j;
        if (m1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = m1Var.hashCode();
        }
        int i16 = (i15 ^ hashCode5) * 1000003;
        List list = this.f52041k;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((i16 ^ i11) * 1000003) ^ this.f52042l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f52033a);
        sb2.append(", identifier=");
        sb2.append(this.f52034b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f52035c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.f52036e);
        sb2.append(", crashed=");
        sb2.append(this.f52037f);
        sb2.append(", app=");
        sb2.append(this.f52038g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f52039i);
        sb2.append(", device=");
        sb2.append(this.f52040j);
        sb2.append(", events=");
        sb2.append(this.f52041k);
        sb2.append(", generatorType=");
        return a1.g.o(this.f52042l, "}", sb2);
    }
}
