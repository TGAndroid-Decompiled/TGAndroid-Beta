package y9;

import java.util.List;
public final class h0 extends d2 {
    public final String f49769a;
    public final String f49770b;
    public final String f49771c;
    public final long d;
    public final Long f49772e;
    public final boolean f49773f;
    public final l1 f49774g;
    public final c2 h;
    public final b2 f49775i;
    public final m1 f49776j;
    public final List f49777k;
    public final int f49778l;

    public h0(String str, String str2, String str3, long j3, Long l4, boolean z10, l1 l1Var, c2 c2Var, b2 b2Var, m1 m1Var, List list, int i10) {
        this.f49769a = str;
        this.f49770b = str2;
        this.f49771c = str3;
        this.d = j3;
        this.f49772e = l4;
        this.f49773f = z10;
        this.f49774g = l1Var;
        this.h = c2Var;
        this.f49775i = b2Var;
        this.f49776j = m1Var;
        this.f49777k = list;
        this.f49778l = i10;
    }

    @Override
    public final g0 a() {
        ?? obj = new Object();
        obj.f49758a = this.f49769a;
        obj.f49759b = this.f49770b;
        obj.f49760c = this.f49771c;
        obj.d = Long.valueOf(this.d);
        obj.f49761e = this.f49772e;
        obj.f49762f = Boolean.valueOf(this.f49773f);
        obj.f49763g = this.f49774g;
        obj.h = this.h;
        obj.f49764i = this.f49775i;
        obj.f49765j = this.f49776j;
        obj.f49766k = this.f49777k;
        obj.f49767l = Integer.valueOf(this.f49778l);
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
            List list2 = h0Var.f49777k;
            m1 m1Var2 = h0Var.f49776j;
            b2 b2Var2 = h0Var.f49775i;
            c2 c2Var2 = h0Var.h;
            Long l10 = h0Var.f49772e;
            String str2 = h0Var.f49771c;
            if (this.f49769a.equals(h0Var.f49769a) && this.f49770b.equals(h0Var.f49770b) && ((str = this.f49771c) != null ? str.equals(str2) : str2 == null) && this.d == h0Var.d && ((l4 = this.f49772e) != null ? l4.equals(l10) : l10 == null) && this.f49773f == h0Var.f49773f && this.f49774g.equals(h0Var.f49774g) && ((c2Var = this.h) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((b2Var = this.f49775i) != null ? b2Var.equals(b2Var2) : b2Var2 == null) && ((m1Var = this.f49776j) != null ? m1Var.equals(m1Var2) : m1Var2 == null) && ((list = this.f49777k) != null ? list.equals(list2) : list2 == null) && this.f49778l == h0Var.f49778l) {
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
        int hashCode6 = (((this.f49769a.hashCode() ^ 1000003) * 1000003) ^ this.f49770b.hashCode()) * 1000003;
        int i11 = 0;
        String str = this.f49771c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.d;
        int i12 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        Long l4 = this.f49772e;
        if (l4 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l4.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        if (this.f49773f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode7 = (((i13 ^ i10) * 1000003) ^ this.f49774g.hashCode()) * 1000003;
        c2 c2Var = this.h;
        if (c2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2Var.hashCode();
        }
        int i14 = (hashCode7 ^ hashCode3) * 1000003;
        b2 b2Var = this.f49775i;
        if (b2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = b2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        m1 m1Var = this.f49776j;
        if (m1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = m1Var.hashCode();
        }
        int i16 = (i15 ^ hashCode5) * 1000003;
        List list = this.f49777k;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((i16 ^ i11) * 1000003) ^ this.f49778l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f49769a);
        sb2.append(", identifier=");
        sb2.append(this.f49770b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f49771c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.f49772e);
        sb2.append(", crashed=");
        sb2.append(this.f49773f);
        sb2.append(", app=");
        sb2.append(this.f49774g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f49775i);
        sb2.append(", device=");
        sb2.append(this.f49776j);
        sb2.append(", events=");
        sb2.append(this.f49777k);
        sb2.append(", generatorType=");
        return a4.a.n(this.f49778l, "}", sb2);
    }
}
