package y9;

import java.util.List;
public final class h0 extends d2 {
    public final String f46679a;
    public final String f46680b;
    public final String f46681c;
    public final long d;
    public final Long e;
    public final boolean f46682f;
    public final l1 f46683g;
    public final c2 h;
    public final b2 f46684i;
    public final m1 f46685j;
    public final List f46686k;
    public final int f46687l;

    public h0(String str, String str2, String str3, long j3, Long l4, boolean z10, l1 l1Var, c2 c2Var, b2 b2Var, m1 m1Var, List list, int i10) {
        this.f46679a = str;
        this.f46680b = str2;
        this.f46681c = str3;
        this.d = j3;
        this.e = l4;
        this.f46682f = z10;
        this.f46683g = l1Var;
        this.h = c2Var;
        this.f46684i = b2Var;
        this.f46685j = m1Var;
        this.f46686k = list;
        this.f46687l = i10;
    }

    @Override
    public final g0 a() {
        ?? obj = new Object();
        obj.f46669a = this.f46679a;
        obj.f46670b = this.f46680b;
        obj.f46671c = this.f46681c;
        obj.d = Long.valueOf(this.d);
        obj.e = this.e;
        obj.f46672f = Boolean.valueOf(this.f46682f);
        obj.f46673g = this.f46683g;
        obj.h = this.h;
        obj.f46674i = this.f46684i;
        obj.f46675j = this.f46685j;
        obj.f46676k = this.f46686k;
        obj.f46677l = Integer.valueOf(this.f46687l);
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
            List list2 = h0Var.f46686k;
            m1 m1Var2 = h0Var.f46685j;
            b2 b2Var2 = h0Var.f46684i;
            c2 c2Var2 = h0Var.h;
            Long l10 = h0Var.e;
            String str2 = h0Var.f46681c;
            if (this.f46679a.equals(h0Var.f46679a) && this.f46680b.equals(h0Var.f46680b) && ((str = this.f46681c) != null ? str.equals(str2) : str2 == null) && this.d == h0Var.d && ((l4 = this.e) != null ? l4.equals(l10) : l10 == null) && this.f46682f == h0Var.f46682f && this.f46683g.equals(h0Var.f46683g) && ((c2Var = this.h) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((b2Var = this.f46684i) != null ? b2Var.equals(b2Var2) : b2Var2 == null) && ((m1Var = this.f46685j) != null ? m1Var.equals(m1Var2) : m1Var2 == null) && ((list = this.f46686k) != null ? list.equals(list2) : list2 == null) && this.f46687l == h0Var.f46687l) {
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
        int hashCode6 = (((this.f46679a.hashCode() ^ 1000003) * 1000003) ^ this.f46680b.hashCode()) * 1000003;
        int i11 = 0;
        String str = this.f46681c;
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
        if (this.f46682f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode7 = (((i13 ^ i10) * 1000003) ^ this.f46683g.hashCode()) * 1000003;
        c2 c2Var = this.h;
        if (c2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2Var.hashCode();
        }
        int i14 = (hashCode7 ^ hashCode3) * 1000003;
        b2 b2Var = this.f46684i;
        if (b2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = b2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        m1 m1Var = this.f46685j;
        if (m1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = m1Var.hashCode();
        }
        int i16 = (i15 ^ hashCode5) * 1000003;
        List list = this.f46686k;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((i16 ^ i11) * 1000003) ^ this.f46687l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f46679a);
        sb2.append(", identifier=");
        sb2.append(this.f46680b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f46681c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.e);
        sb2.append(", crashed=");
        sb2.append(this.f46682f);
        sb2.append(", app=");
        sb2.append(this.f46683g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f46684i);
        sb2.append(", device=");
        sb2.append(this.f46685j);
        sb2.append(", events=");
        sb2.append(this.f46686k);
        sb2.append(", generatorType=");
        return a4.a.n(this.f46687l, "}", sb2);
    }
}
