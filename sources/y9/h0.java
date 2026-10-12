package y9;

import java.util.List;
public final class h0 extends d2 {
    public final String f52178a;
    public final String f52179b;
    public final String f52180c;
    public final long d;
    public final Long f52181e;
    public final boolean f52182f;
    public final l1 f52183g;
    public final c2 h;
    public final b2 f52184i;
    public final m1 f52185j;
    public final List f52186k;
    public final int f52187l;

    public h0(String str, String str2, String str3, long j3, Long l4, boolean z10, l1 l1Var, c2 c2Var, b2 b2Var, m1 m1Var, List list, int i10) {
        this.f52178a = str;
        this.f52179b = str2;
        this.f52180c = str3;
        this.d = j3;
        this.f52181e = l4;
        this.f52182f = z10;
        this.f52183g = l1Var;
        this.h = c2Var;
        this.f52184i = b2Var;
        this.f52185j = m1Var;
        this.f52186k = list;
        this.f52187l = i10;
    }

    @Override
    public final g0 a() {
        ?? obj = new Object();
        obj.f52167a = this.f52178a;
        obj.f52168b = this.f52179b;
        obj.f52169c = this.f52180c;
        obj.d = Long.valueOf(this.d);
        obj.f52170e = this.f52181e;
        obj.f52171f = Boolean.valueOf(this.f52182f);
        obj.f52172g = this.f52183g;
        obj.h = this.h;
        obj.f52173i = this.f52184i;
        obj.f52174j = this.f52185j;
        obj.f52175k = this.f52186k;
        obj.f52176l = Integer.valueOf(this.f52187l);
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
            List list2 = h0Var.f52186k;
            m1 m1Var2 = h0Var.f52185j;
            b2 b2Var2 = h0Var.f52184i;
            c2 c2Var2 = h0Var.h;
            Long l10 = h0Var.f52181e;
            String str2 = h0Var.f52180c;
            if (this.f52178a.equals(h0Var.f52178a) && this.f52179b.equals(h0Var.f52179b) && ((str = this.f52180c) != null ? str.equals(str2) : str2 == null) && this.d == h0Var.d && ((l4 = this.f52181e) != null ? l4.equals(l10) : l10 == null) && this.f52182f == h0Var.f52182f && this.f52183g.equals(h0Var.f52183g) && ((c2Var = this.h) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((b2Var = this.f52184i) != null ? b2Var.equals(b2Var2) : b2Var2 == null) && ((m1Var = this.f52185j) != null ? m1Var.equals(m1Var2) : m1Var2 == null) && ((list = this.f52186k) != null ? list.equals(list2) : list2 == null) && this.f52187l == h0Var.f52187l) {
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
        int hashCode6 = (((this.f52178a.hashCode() ^ 1000003) * 1000003) ^ this.f52179b.hashCode()) * 1000003;
        int i11 = 0;
        String str = this.f52180c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.d;
        int i12 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        Long l4 = this.f52181e;
        if (l4 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l4.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        if (this.f52182f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode7 = (((i13 ^ i10) * 1000003) ^ this.f52183g.hashCode()) * 1000003;
        c2 c2Var = this.h;
        if (c2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2Var.hashCode();
        }
        int i14 = (hashCode7 ^ hashCode3) * 1000003;
        b2 b2Var = this.f52184i;
        if (b2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = b2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        m1 m1Var = this.f52185j;
        if (m1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = m1Var.hashCode();
        }
        int i16 = (i15 ^ hashCode5) * 1000003;
        List list = this.f52186k;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((i16 ^ i11) * 1000003) ^ this.f52187l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f52178a);
        sb2.append(", identifier=");
        sb2.append(this.f52179b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f52180c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.f52181e);
        sb2.append(", crashed=");
        sb2.append(this.f52182f);
        sb2.append(", app=");
        sb2.append(this.f52183g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f52184i);
        sb2.append(", device=");
        sb2.append(this.f52185j);
        sb2.append(", events=");
        sb2.append(this.f52186k);
        sb2.append(", generatorType=");
        return a1.g.o(this.f52187l, "}", sb2);
    }
}
