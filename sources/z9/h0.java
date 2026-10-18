package z9;

import java.util.List;
public final class h0 extends d2 {
    public final String f51420a;
    public final String f51421b;
    public final String f51422c;
    public final long d;
    public final Long e;
    public final boolean f51423f;
    public final l1 f51424g;
    public final c2 h;
    public final b2 f51425i;
    public final m1 f51426j;
    public final List f51427k;
    public final int f51428l;

    public h0(String str, String str2, String str3, long j10, Long l4, boolean z10, l1 l1Var, c2 c2Var, b2 b2Var, m1 m1Var, List list, int i10) {
        this.f51420a = str;
        this.f51421b = str2;
        this.f51422c = str3;
        this.d = j10;
        this.e = l4;
        this.f51423f = z10;
        this.f51424g = l1Var;
        this.h = c2Var;
        this.f51425i = b2Var;
        this.f51426j = m1Var;
        this.f51427k = list;
        this.f51428l = i10;
    }

    @Override
    public final g0 a() {
        ?? obj = new Object();
        obj.f51410a = this.f51420a;
        obj.f51411b = this.f51421b;
        obj.f51412c = this.f51422c;
        obj.d = Long.valueOf(this.d);
        obj.e = this.e;
        obj.f51413f = Boolean.valueOf(this.f51423f);
        obj.f51414g = this.f51424g;
        obj.h = this.h;
        obj.f51415i = this.f51425i;
        obj.f51416j = this.f51426j;
        obj.f51417k = this.f51427k;
        obj.f51418l = Integer.valueOf(this.f51428l);
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
            List list2 = h0Var.f51427k;
            m1 m1Var2 = h0Var.f51426j;
            b2 b2Var2 = h0Var.f51425i;
            c2 c2Var2 = h0Var.h;
            Long l10 = h0Var.e;
            String str2 = h0Var.f51422c;
            if (this.f51420a.equals(h0Var.f51420a) && this.f51421b.equals(h0Var.f51421b) && ((str = this.f51422c) != null ? str.equals(str2) : str2 == null) && this.d == h0Var.d && ((l4 = this.e) != null ? l4.equals(l10) : l10 == null) && this.f51423f == h0Var.f51423f && this.f51424g.equals(h0Var.f51424g) && ((c2Var = this.h) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((b2Var = this.f51425i) != null ? b2Var.equals(b2Var2) : b2Var2 == null) && ((m1Var = this.f51426j) != null ? m1Var.equals(m1Var2) : m1Var2 == null) && ((list = this.f51427k) != null ? list.equals(list2) : list2 == null) && this.f51428l == h0Var.f51428l) {
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
        int hashCode6 = (((this.f51420a.hashCode() ^ 1000003) * 1000003) ^ this.f51421b.hashCode()) * 1000003;
        int i11 = 0;
        String str = this.f51422c;
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
        if (this.f51423f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode7 = (((i13 ^ i10) * 1000003) ^ this.f51424g.hashCode()) * 1000003;
        c2 c2Var = this.h;
        if (c2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2Var.hashCode();
        }
        int i14 = (hashCode7 ^ hashCode3) * 1000003;
        b2 b2Var = this.f51425i;
        if (b2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = b2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        m1 m1Var = this.f51426j;
        if (m1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = m1Var.hashCode();
        }
        int i16 = (i15 ^ hashCode5) * 1000003;
        List list = this.f51427k;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((i16 ^ i11) * 1000003) ^ this.f51428l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f51420a);
        sb2.append(", identifier=");
        sb2.append(this.f51421b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f51422c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.e);
        sb2.append(", crashed=");
        sb2.append(this.f51423f);
        sb2.append(", app=");
        sb2.append(this.f51424g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f51425i);
        sb2.append(", device=");
        sb2.append(this.f51426j);
        sb2.append(", events=");
        sb2.append(this.f51427k);
        sb2.append(", generatorType=");
        return a1.g.n(this.f51428l, "}", sb2);
    }
}
