package z9;

import java.util.List;
public final class h0 extends d2 {
    public final String f49989a;
    public final String f49990b;
    public final String f49991c;
    public final long d;
    public final Long e;
    public final boolean f49992f;
    public final l1 f49993g;
    public final c2 h;
    public final b2 f49994i;
    public final m1 f49995j;
    public final List f49996k;
    public final int f49997l;

    public h0(String str, String str2, String str3, long j10, Long l4, boolean z10, l1 l1Var, c2 c2Var, b2 b2Var, m1 m1Var, List list, int i10) {
        this.f49989a = str;
        this.f49990b = str2;
        this.f49991c = str3;
        this.d = j10;
        this.e = l4;
        this.f49992f = z10;
        this.f49993g = l1Var;
        this.h = c2Var;
        this.f49994i = b2Var;
        this.f49995j = m1Var;
        this.f49996k = list;
        this.f49997l = i10;
    }

    @Override
    public final g0 a() {
        ?? obj = new Object();
        obj.f49979a = this.f49989a;
        obj.f49980b = this.f49990b;
        obj.f49981c = this.f49991c;
        obj.d = Long.valueOf(this.d);
        obj.e = this.e;
        obj.f49982f = Boolean.valueOf(this.f49992f);
        obj.f49983g = this.f49993g;
        obj.h = this.h;
        obj.f49984i = this.f49994i;
        obj.f49985j = this.f49995j;
        obj.f49986k = this.f49996k;
        obj.f49987l = Integer.valueOf(this.f49997l);
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
            List list2 = h0Var.f49996k;
            m1 m1Var2 = h0Var.f49995j;
            b2 b2Var2 = h0Var.f49994i;
            c2 c2Var2 = h0Var.h;
            Long l10 = h0Var.e;
            String str2 = h0Var.f49991c;
            if (this.f49989a.equals(h0Var.f49989a) && this.f49990b.equals(h0Var.f49990b) && ((str = this.f49991c) != null ? str.equals(str2) : str2 == null) && this.d == h0Var.d && ((l4 = this.e) != null ? l4.equals(l10) : l10 == null) && this.f49992f == h0Var.f49992f && this.f49993g.equals(h0Var.f49993g) && ((c2Var = this.h) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((b2Var = this.f49994i) != null ? b2Var.equals(b2Var2) : b2Var2 == null) && ((m1Var = this.f49995j) != null ? m1Var.equals(m1Var2) : m1Var2 == null) && ((list = this.f49996k) != null ? list.equals(list2) : list2 == null) && this.f49997l == h0Var.f49997l) {
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
        int hashCode6 = (((this.f49989a.hashCode() ^ 1000003) * 1000003) ^ this.f49990b.hashCode()) * 1000003;
        int i11 = 0;
        String str = this.f49991c;
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
        if (this.f49992f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode7 = (((i13 ^ i10) * 1000003) ^ this.f49993g.hashCode()) * 1000003;
        c2 c2Var = this.h;
        if (c2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2Var.hashCode();
        }
        int i14 = (hashCode7 ^ hashCode3) * 1000003;
        b2 b2Var = this.f49994i;
        if (b2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = b2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        m1 m1Var = this.f49995j;
        if (m1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = m1Var.hashCode();
        }
        int i16 = (i15 ^ hashCode5) * 1000003;
        List list = this.f49996k;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((i16 ^ i11) * 1000003) ^ this.f49997l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f49989a);
        sb2.append(", identifier=");
        sb2.append(this.f49990b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f49991c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.e);
        sb2.append(", crashed=");
        sb2.append(this.f49992f);
        sb2.append(", app=");
        sb2.append(this.f49993g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f49994i);
        sb2.append(", device=");
        sb2.append(this.f49995j);
        sb2.append(", events=");
        sb2.append(this.f49996k);
        sb2.append(", generatorType=");
        return a1.g.n(this.f49997l, "}", sb2);
    }
}
