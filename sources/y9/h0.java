package y9;

import java.util.List;
public final class h0 extends d2 {
    public final String f50650a;
    public final String f50651b;
    public final String f50652c;
    public final long d;
    public final Long f50653e;
    public final boolean f50654f;
    public final l1 f50655g;
    public final c2 h;
    public final b2 f50656i;
    public final m1 f50657j;
    public final List f50658k;
    public final int f50659l;

    public h0(String str, String str2, String str3, long j3, Long l4, boolean z10, l1 l1Var, c2 c2Var, b2 b2Var, m1 m1Var, List list, int i10) {
        this.f50650a = str;
        this.f50651b = str2;
        this.f50652c = str3;
        this.d = j3;
        this.f50653e = l4;
        this.f50654f = z10;
        this.f50655g = l1Var;
        this.h = c2Var;
        this.f50656i = b2Var;
        this.f50657j = m1Var;
        this.f50658k = list;
        this.f50659l = i10;
    }

    @Override
    public final g0 a() {
        ?? obj = new Object();
        obj.f50639a = this.f50650a;
        obj.f50640b = this.f50651b;
        obj.f50641c = this.f50652c;
        obj.d = Long.valueOf(this.d);
        obj.f50642e = this.f50653e;
        obj.f50643f = Boolean.valueOf(this.f50654f);
        obj.f50644g = this.f50655g;
        obj.h = this.h;
        obj.f50645i = this.f50656i;
        obj.f50646j = this.f50657j;
        obj.f50647k = this.f50658k;
        obj.f50648l = Integer.valueOf(this.f50659l);
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
            List list2 = h0Var.f50658k;
            m1 m1Var2 = h0Var.f50657j;
            b2 b2Var2 = h0Var.f50656i;
            c2 c2Var2 = h0Var.h;
            Long l10 = h0Var.f50653e;
            String str2 = h0Var.f50652c;
            if (this.f50650a.equals(h0Var.f50650a) && this.f50651b.equals(h0Var.f50651b) && ((str = this.f50652c) != null ? str.equals(str2) : str2 == null) && this.d == h0Var.d && ((l4 = this.f50653e) != null ? l4.equals(l10) : l10 == null) && this.f50654f == h0Var.f50654f && this.f50655g.equals(h0Var.f50655g) && ((c2Var = this.h) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((b2Var = this.f50656i) != null ? b2Var.equals(b2Var2) : b2Var2 == null) && ((m1Var = this.f50657j) != null ? m1Var.equals(m1Var2) : m1Var2 == null) && ((list = this.f50658k) != null ? list.equals(list2) : list2 == null) && this.f50659l == h0Var.f50659l) {
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
        int hashCode6 = (((this.f50650a.hashCode() ^ 1000003) * 1000003) ^ this.f50651b.hashCode()) * 1000003;
        int i11 = 0;
        String str = this.f50652c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.d;
        int i12 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        Long l4 = this.f50653e;
        if (l4 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l4.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        if (this.f50654f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode7 = (((i13 ^ i10) * 1000003) ^ this.f50655g.hashCode()) * 1000003;
        c2 c2Var = this.h;
        if (c2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2Var.hashCode();
        }
        int i14 = (hashCode7 ^ hashCode3) * 1000003;
        b2 b2Var = this.f50656i;
        if (b2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = b2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        m1 m1Var = this.f50657j;
        if (m1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = m1Var.hashCode();
        }
        int i16 = (i15 ^ hashCode5) * 1000003;
        List list = this.f50658k;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((i16 ^ i11) * 1000003) ^ this.f50659l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f50650a);
        sb2.append(", identifier=");
        sb2.append(this.f50651b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f50652c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.f50653e);
        sb2.append(", crashed=");
        sb2.append(this.f50654f);
        sb2.append(", app=");
        sb2.append(this.f50655g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f50656i);
        sb2.append(", device=");
        sb2.append(this.f50657j);
        sb2.append(", events=");
        sb2.append(this.f50658k);
        sb2.append(", generatorType=");
        return a4.a.n(this.f50659l, "}", sb2);
    }
}
