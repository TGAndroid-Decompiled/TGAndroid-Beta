package z9;

import java.util.List;
public final class h0 extends d2 {
    public final String f55310a;
    public final String f55311b;
    public final String f55312c;
    public final long d;
    public final Long e;
    public final boolean f55313f;
    public final l1 f55314g;
    public final c2 h;
    public final b2 f55315i;
    public final m1 f55316j;
    public final List f55317k;
    public final int f55318l;

    public h0(String str, String str2, String str3, long j10, Long l4, boolean z10, l1 l1Var, c2 c2Var, b2 b2Var, m1 m1Var, List list, int i10) {
        this.f55310a = str;
        this.f55311b = str2;
        this.f55312c = str3;
        this.d = j10;
        this.e = l4;
        this.f55313f = z10;
        this.f55314g = l1Var;
        this.h = c2Var;
        this.f55315i = b2Var;
        this.f55316j = m1Var;
        this.f55317k = list;
        this.f55318l = i10;
    }

    @Override
    public final g0 a() {
        ?? obj = new Object();
        obj.f55300a = this.f55310a;
        obj.f55301b = this.f55311b;
        obj.f55302c = this.f55312c;
        obj.d = Long.valueOf(this.d);
        obj.e = this.e;
        obj.f55303f = Boolean.valueOf(this.f55313f);
        obj.f55304g = this.f55314g;
        obj.h = this.h;
        obj.f55305i = this.f55315i;
        obj.f55306j = this.f55316j;
        obj.f55307k = this.f55317k;
        obj.f55308l = Integer.valueOf(this.f55318l);
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
            List list2 = h0Var.f55317k;
            m1 m1Var2 = h0Var.f55316j;
            b2 b2Var2 = h0Var.f55315i;
            c2 c2Var2 = h0Var.h;
            Long l10 = h0Var.e;
            String str2 = h0Var.f55312c;
            if (this.f55310a.equals(h0Var.f55310a) && this.f55311b.equals(h0Var.f55311b) && ((str = this.f55312c) != null ? str.equals(str2) : str2 == null) && this.d == h0Var.d && ((l4 = this.e) != null ? l4.equals(l10) : l10 == null) && this.f55313f == h0Var.f55313f && this.f55314g.equals(h0Var.f55314g) && ((c2Var = this.h) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((b2Var = this.f55315i) != null ? b2Var.equals(b2Var2) : b2Var2 == null) && ((m1Var = this.f55316j) != null ? m1Var.equals(m1Var2) : m1Var2 == null) && ((list = this.f55317k) != null ? list.equals(list2) : list2 == null) && this.f55318l == h0Var.f55318l) {
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
        int hashCode6 = (((this.f55310a.hashCode() ^ 1000003) * 1000003) ^ this.f55311b.hashCode()) * 1000003;
        int i11 = 0;
        String str = this.f55312c;
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
        if (this.f55313f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode7 = (((i13 ^ i10) * 1000003) ^ this.f55314g.hashCode()) * 1000003;
        c2 c2Var = this.h;
        if (c2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2Var.hashCode();
        }
        int i14 = (hashCode7 ^ hashCode3) * 1000003;
        b2 b2Var = this.f55315i;
        if (b2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = b2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        m1 m1Var = this.f55316j;
        if (m1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = m1Var.hashCode();
        }
        int i16 = (i15 ^ hashCode5) * 1000003;
        List list = this.f55317k;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((i16 ^ i11) * 1000003) ^ this.f55318l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f55310a);
        sb2.append(", identifier=");
        sb2.append(this.f55311b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f55312c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.e);
        sb2.append(", crashed=");
        sb2.append(this.f55313f);
        sb2.append(", app=");
        sb2.append(this.f55314g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f55315i);
        sb2.append(", device=");
        sb2.append(this.f55316j);
        sb2.append(", events=");
        sb2.append(this.f55317k);
        sb2.append(", generatorType=");
        return a1.g.p(sb2, this.f55318l, "}");
    }
}
