package y9;

import java.util.List;
public final class h0 extends d2 {
    public final String f50658a;
    public final String f50659b;
    public final String f50660c;
    public final long d;
    public final Long f50661e;
    public final boolean f50662f;
    public final l1 f50663g;
    public final c2 h;
    public final b2 f50664i;
    public final m1 f50665j;
    public final List f50666k;
    public final int f50667l;

    public h0(String str, String str2, String str3, long j3, Long l4, boolean z10, l1 l1Var, c2 c2Var, b2 b2Var, m1 m1Var, List list, int i10) {
        this.f50658a = str;
        this.f50659b = str2;
        this.f50660c = str3;
        this.d = j3;
        this.f50661e = l4;
        this.f50662f = z10;
        this.f50663g = l1Var;
        this.h = c2Var;
        this.f50664i = b2Var;
        this.f50665j = m1Var;
        this.f50666k = list;
        this.f50667l = i10;
    }

    @Override
    public final g0 a() {
        ?? obj = new Object();
        obj.f50647a = this.f50658a;
        obj.f50648b = this.f50659b;
        obj.f50649c = this.f50660c;
        obj.d = Long.valueOf(this.d);
        obj.f50650e = this.f50661e;
        obj.f50651f = Boolean.valueOf(this.f50662f);
        obj.f50652g = this.f50663g;
        obj.h = this.h;
        obj.f50653i = this.f50664i;
        obj.f50654j = this.f50665j;
        obj.f50655k = this.f50666k;
        obj.f50656l = Integer.valueOf(this.f50667l);
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
            List list2 = h0Var.f50666k;
            m1 m1Var2 = h0Var.f50665j;
            b2 b2Var2 = h0Var.f50664i;
            c2 c2Var2 = h0Var.h;
            Long l10 = h0Var.f50661e;
            String str2 = h0Var.f50660c;
            if (this.f50658a.equals(h0Var.f50658a) && this.f50659b.equals(h0Var.f50659b) && ((str = this.f50660c) != null ? str.equals(str2) : str2 == null) && this.d == h0Var.d && ((l4 = this.f50661e) != null ? l4.equals(l10) : l10 == null) && this.f50662f == h0Var.f50662f && this.f50663g.equals(h0Var.f50663g) && ((c2Var = this.h) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((b2Var = this.f50664i) != null ? b2Var.equals(b2Var2) : b2Var2 == null) && ((m1Var = this.f50665j) != null ? m1Var.equals(m1Var2) : m1Var2 == null) && ((list = this.f50666k) != null ? list.equals(list2) : list2 == null) && this.f50667l == h0Var.f50667l) {
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
        int hashCode6 = (((this.f50658a.hashCode() ^ 1000003) * 1000003) ^ this.f50659b.hashCode()) * 1000003;
        int i11 = 0;
        String str = this.f50660c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.d;
        int i12 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        Long l4 = this.f50661e;
        if (l4 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l4.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        if (this.f50662f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode7 = (((i13 ^ i10) * 1000003) ^ this.f50663g.hashCode()) * 1000003;
        c2 c2Var = this.h;
        if (c2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2Var.hashCode();
        }
        int i14 = (hashCode7 ^ hashCode3) * 1000003;
        b2 b2Var = this.f50664i;
        if (b2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = b2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        m1 m1Var = this.f50665j;
        if (m1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = m1Var.hashCode();
        }
        int i16 = (i15 ^ hashCode5) * 1000003;
        List list = this.f50666k;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((i16 ^ i11) * 1000003) ^ this.f50667l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f50658a);
        sb2.append(", identifier=");
        sb2.append(this.f50659b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f50660c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.f50661e);
        sb2.append(", crashed=");
        sb2.append(this.f50662f);
        sb2.append(", app=");
        sb2.append(this.f50663g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f50664i);
        sb2.append(", device=");
        sb2.append(this.f50665j);
        sb2.append(", events=");
        sb2.append(this.f50666k);
        sb2.append(", generatorType=");
        return a4.a.o(this.f50667l, "}", sb2);
    }
}
