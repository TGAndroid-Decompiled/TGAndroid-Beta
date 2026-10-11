package y9;

import java.util.List;
public final class h0 extends d2 {
    public final String f52067a;
    public final String f52068b;
    public final String f52069c;
    public final long d;
    public final Long f52070e;
    public final boolean f52071f;
    public final l1 f52072g;
    public final c2 h;
    public final b2 f52073i;
    public final m1 f52074j;
    public final List f52075k;
    public final int f52076l;

    public h0(String str, String str2, String str3, long j3, Long l4, boolean z10, l1 l1Var, c2 c2Var, b2 b2Var, m1 m1Var, List list, int i10) {
        this.f52067a = str;
        this.f52068b = str2;
        this.f52069c = str3;
        this.d = j3;
        this.f52070e = l4;
        this.f52071f = z10;
        this.f52072g = l1Var;
        this.h = c2Var;
        this.f52073i = b2Var;
        this.f52074j = m1Var;
        this.f52075k = list;
        this.f52076l = i10;
    }

    @Override
    public final g0 a() {
        ?? obj = new Object();
        obj.f52056a = this.f52067a;
        obj.f52057b = this.f52068b;
        obj.f52058c = this.f52069c;
        obj.d = Long.valueOf(this.d);
        obj.f52059e = this.f52070e;
        obj.f52060f = Boolean.valueOf(this.f52071f);
        obj.f52061g = this.f52072g;
        obj.h = this.h;
        obj.f52062i = this.f52073i;
        obj.f52063j = this.f52074j;
        obj.f52064k = this.f52075k;
        obj.f52065l = Integer.valueOf(this.f52076l);
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
            List list2 = h0Var.f52075k;
            m1 m1Var2 = h0Var.f52074j;
            b2 b2Var2 = h0Var.f52073i;
            c2 c2Var2 = h0Var.h;
            Long l10 = h0Var.f52070e;
            String str2 = h0Var.f52069c;
            if (this.f52067a.equals(h0Var.f52067a) && this.f52068b.equals(h0Var.f52068b) && ((str = this.f52069c) != null ? str.equals(str2) : str2 == null) && this.d == h0Var.d && ((l4 = this.f52070e) != null ? l4.equals(l10) : l10 == null) && this.f52071f == h0Var.f52071f && this.f52072g.equals(h0Var.f52072g) && ((c2Var = this.h) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((b2Var = this.f52073i) != null ? b2Var.equals(b2Var2) : b2Var2 == null) && ((m1Var = this.f52074j) != null ? m1Var.equals(m1Var2) : m1Var2 == null) && ((list = this.f52075k) != null ? list.equals(list2) : list2 == null) && this.f52076l == h0Var.f52076l) {
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
        int hashCode6 = (((this.f52067a.hashCode() ^ 1000003) * 1000003) ^ this.f52068b.hashCode()) * 1000003;
        int i11 = 0;
        String str = this.f52069c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.d;
        int i12 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        Long l4 = this.f52070e;
        if (l4 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l4.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        if (this.f52071f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode7 = (((i13 ^ i10) * 1000003) ^ this.f52072g.hashCode()) * 1000003;
        c2 c2Var = this.h;
        if (c2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2Var.hashCode();
        }
        int i14 = (hashCode7 ^ hashCode3) * 1000003;
        b2 b2Var = this.f52073i;
        if (b2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = b2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        m1 m1Var = this.f52074j;
        if (m1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = m1Var.hashCode();
        }
        int i16 = (i15 ^ hashCode5) * 1000003;
        List list = this.f52075k;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((i16 ^ i11) * 1000003) ^ this.f52076l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f52067a);
        sb2.append(", identifier=");
        sb2.append(this.f52068b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f52069c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.f52070e);
        sb2.append(", crashed=");
        sb2.append(this.f52071f);
        sb2.append(", app=");
        sb2.append(this.f52072g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f52073i);
        sb2.append(", device=");
        sb2.append(this.f52074j);
        sb2.append(", events=");
        sb2.append(this.f52075k);
        sb2.append(", generatorType=");
        return a1.g.o(this.f52076l, "}", sb2);
    }
}
