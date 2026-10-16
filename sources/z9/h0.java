package z9;

import java.util.List;
public final class h0 extends d2 {
    public final String f49990a;
    public final String f49991b;
    public final String f49992c;
    public final long d;
    public final Long e;
    public final boolean f49993f;
    public final l1 f49994g;
    public final c2 h;
    public final b2 f49995i;
    public final m1 f49996j;
    public final List f49997k;
    public final int f49998l;

    public h0(String str, String str2, String str3, long j10, Long l4, boolean z10, l1 l1Var, c2 c2Var, b2 b2Var, m1 m1Var, List list, int i10) {
        this.f49990a = str;
        this.f49991b = str2;
        this.f49992c = str3;
        this.d = j10;
        this.e = l4;
        this.f49993f = z10;
        this.f49994g = l1Var;
        this.h = c2Var;
        this.f49995i = b2Var;
        this.f49996j = m1Var;
        this.f49997k = list;
        this.f49998l = i10;
    }

    @Override
    public final g0 a() {
        ?? obj = new Object();
        obj.f49980a = this.f49990a;
        obj.f49981b = this.f49991b;
        obj.f49982c = this.f49992c;
        obj.d = Long.valueOf(this.d);
        obj.e = this.e;
        obj.f49983f = Boolean.valueOf(this.f49993f);
        obj.f49984g = this.f49994g;
        obj.h = this.h;
        obj.f49985i = this.f49995i;
        obj.f49986j = this.f49996j;
        obj.f49987k = this.f49997k;
        obj.f49988l = Integer.valueOf(this.f49998l);
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
            List list2 = h0Var.f49997k;
            m1 m1Var2 = h0Var.f49996j;
            b2 b2Var2 = h0Var.f49995i;
            c2 c2Var2 = h0Var.h;
            Long l10 = h0Var.e;
            String str2 = h0Var.f49992c;
            if (this.f49990a.equals(h0Var.f49990a) && this.f49991b.equals(h0Var.f49991b) && ((str = this.f49992c) != null ? str.equals(str2) : str2 == null) && this.d == h0Var.d && ((l4 = this.e) != null ? l4.equals(l10) : l10 == null) && this.f49993f == h0Var.f49993f && this.f49994g.equals(h0Var.f49994g) && ((c2Var = this.h) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((b2Var = this.f49995i) != null ? b2Var.equals(b2Var2) : b2Var2 == null) && ((m1Var = this.f49996j) != null ? m1Var.equals(m1Var2) : m1Var2 == null) && ((list = this.f49997k) != null ? list.equals(list2) : list2 == null) && this.f49998l == h0Var.f49998l) {
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
        int hashCode6 = (((this.f49990a.hashCode() ^ 1000003) * 1000003) ^ this.f49991b.hashCode()) * 1000003;
        int i11 = 0;
        String str = this.f49992c;
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
        if (this.f49993f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode7 = (((i13 ^ i10) * 1000003) ^ this.f49994g.hashCode()) * 1000003;
        c2 c2Var = this.h;
        if (c2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2Var.hashCode();
        }
        int i14 = (hashCode7 ^ hashCode3) * 1000003;
        b2 b2Var = this.f49995i;
        if (b2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = b2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        m1 m1Var = this.f49996j;
        if (m1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = m1Var.hashCode();
        }
        int i16 = (i15 ^ hashCode5) * 1000003;
        List list = this.f49997k;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((i16 ^ i11) * 1000003) ^ this.f49998l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f49990a);
        sb2.append(", identifier=");
        sb2.append(this.f49991b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f49992c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.e);
        sb2.append(", crashed=");
        sb2.append(this.f49993f);
        sb2.append(", app=");
        sb2.append(this.f49994g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f49995i);
        sb2.append(", device=");
        sb2.append(this.f49996j);
        sb2.append(", events=");
        sb2.append(this.f49997k);
        sb2.append(", generatorType=");
        return a1.g.n(this.f49998l, "}", sb2);
    }
}
