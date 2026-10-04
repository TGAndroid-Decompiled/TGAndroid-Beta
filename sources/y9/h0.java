package y9;

import java.util.List;
public final class h0 extends d2 {
    public final String f50649a;
    public final String f50650b;
    public final String f50651c;
    public final long d;
    public final Long f50652e;
    public final boolean f50653f;
    public final l1 f50654g;
    public final c2 h;
    public final b2 f50655i;
    public final m1 f50656j;
    public final List f50657k;
    public final int f50658l;

    public h0(String str, String str2, String str3, long j3, Long l4, boolean z10, l1 l1Var, c2 c2Var, b2 b2Var, m1 m1Var, List list, int i10) {
        this.f50649a = str;
        this.f50650b = str2;
        this.f50651c = str3;
        this.d = j3;
        this.f50652e = l4;
        this.f50653f = z10;
        this.f50654g = l1Var;
        this.h = c2Var;
        this.f50655i = b2Var;
        this.f50656j = m1Var;
        this.f50657k = list;
        this.f50658l = i10;
    }

    @Override
    public final g0 a() {
        ?? obj = new Object();
        obj.f50638a = this.f50649a;
        obj.f50639b = this.f50650b;
        obj.f50640c = this.f50651c;
        obj.d = Long.valueOf(this.d);
        obj.f50641e = this.f50652e;
        obj.f50642f = Boolean.valueOf(this.f50653f);
        obj.f50643g = this.f50654g;
        obj.h = this.h;
        obj.f50644i = this.f50655i;
        obj.f50645j = this.f50656j;
        obj.f50646k = this.f50657k;
        obj.f50647l = Integer.valueOf(this.f50658l);
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
            List list2 = h0Var.f50657k;
            m1 m1Var2 = h0Var.f50656j;
            b2 b2Var2 = h0Var.f50655i;
            c2 c2Var2 = h0Var.h;
            Long l10 = h0Var.f50652e;
            String str2 = h0Var.f50651c;
            if (this.f50649a.equals(h0Var.f50649a) && this.f50650b.equals(h0Var.f50650b) && ((str = this.f50651c) != null ? str.equals(str2) : str2 == null) && this.d == h0Var.d && ((l4 = this.f50652e) != null ? l4.equals(l10) : l10 == null) && this.f50653f == h0Var.f50653f && this.f50654g.equals(h0Var.f50654g) && ((c2Var = this.h) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((b2Var = this.f50655i) != null ? b2Var.equals(b2Var2) : b2Var2 == null) && ((m1Var = this.f50656j) != null ? m1Var.equals(m1Var2) : m1Var2 == null) && ((list = this.f50657k) != null ? list.equals(list2) : list2 == null) && this.f50658l == h0Var.f50658l) {
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
        int hashCode6 = (((this.f50649a.hashCode() ^ 1000003) * 1000003) ^ this.f50650b.hashCode()) * 1000003;
        int i11 = 0;
        String str = this.f50651c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.d;
        int i12 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        Long l4 = this.f50652e;
        if (l4 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l4.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        if (this.f50653f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode7 = (((i13 ^ i10) * 1000003) ^ this.f50654g.hashCode()) * 1000003;
        c2 c2Var = this.h;
        if (c2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2Var.hashCode();
        }
        int i14 = (hashCode7 ^ hashCode3) * 1000003;
        b2 b2Var = this.f50655i;
        if (b2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = b2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        m1 m1Var = this.f50656j;
        if (m1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = m1Var.hashCode();
        }
        int i16 = (i15 ^ hashCode5) * 1000003;
        List list = this.f50657k;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((i16 ^ i11) * 1000003) ^ this.f50658l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f50649a);
        sb2.append(", identifier=");
        sb2.append(this.f50650b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f50651c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.f50652e);
        sb2.append(", crashed=");
        sb2.append(this.f50653f);
        sb2.append(", app=");
        sb2.append(this.f50654g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f50655i);
        sb2.append(", device=");
        sb2.append(this.f50656j);
        sb2.append(", events=");
        sb2.append(this.f50657k);
        sb2.append(", generatorType=");
        return a4.a.n(this.f50658l, "}", sb2);
    }
}
