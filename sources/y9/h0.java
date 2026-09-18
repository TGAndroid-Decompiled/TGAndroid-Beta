package y9;

import java.util.List;
public final class h0 extends d2 {
    public final String f46557a;
    public final String f46558b;
    public final String f46559c;
    public final long d;
    public final Long e;
    public final boolean f46560f;
    public final l1 f46561g;
    public final c2 h;
    public final b2 f46562i;
    public final m1 f46563j;
    public final List f46564k;
    public final int f46565l;

    public h0(String str, String str2, String str3, long j3, Long l4, boolean z10, l1 l1Var, c2 c2Var, b2 b2Var, m1 m1Var, List list, int i10) {
        this.f46557a = str;
        this.f46558b = str2;
        this.f46559c = str3;
        this.d = j3;
        this.e = l4;
        this.f46560f = z10;
        this.f46561g = l1Var;
        this.h = c2Var;
        this.f46562i = b2Var;
        this.f46563j = m1Var;
        this.f46564k = list;
        this.f46565l = i10;
    }

    @Override
    public final g0 a() {
        ?? obj = new Object();
        obj.f46547a = this.f46557a;
        obj.f46548b = this.f46558b;
        obj.f46549c = this.f46559c;
        obj.d = Long.valueOf(this.d);
        obj.e = this.e;
        obj.f46550f = Boolean.valueOf(this.f46560f);
        obj.f46551g = this.f46561g;
        obj.h = this.h;
        obj.f46552i = this.f46562i;
        obj.f46553j = this.f46563j;
        obj.f46554k = this.f46564k;
        obj.f46555l = Integer.valueOf(this.f46565l);
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
            List list2 = h0Var.f46564k;
            m1 m1Var2 = h0Var.f46563j;
            b2 b2Var2 = h0Var.f46562i;
            c2 c2Var2 = h0Var.h;
            Long l10 = h0Var.e;
            String str2 = h0Var.f46559c;
            if (this.f46557a.equals(h0Var.f46557a) && this.f46558b.equals(h0Var.f46558b) && ((str = this.f46559c) != null ? str.equals(str2) : str2 == null) && this.d == h0Var.d && ((l4 = this.e) != null ? l4.equals(l10) : l10 == null) && this.f46560f == h0Var.f46560f && this.f46561g.equals(h0Var.f46561g) && ((c2Var = this.h) != null ? c2Var.equals(c2Var2) : c2Var2 == null) && ((b2Var = this.f46562i) != null ? b2Var.equals(b2Var2) : b2Var2 == null) && ((m1Var = this.f46563j) != null ? m1Var.equals(m1Var2) : m1Var2 == null) && ((list = this.f46564k) != null ? list.equals(list2) : list2 == null) && this.f46565l == h0Var.f46565l) {
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
        int hashCode6 = (((this.f46557a.hashCode() ^ 1000003) * 1000003) ^ this.f46558b.hashCode()) * 1000003;
        int i11 = 0;
        String str = this.f46559c;
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
        if (this.f46560f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode7 = (((i13 ^ i10) * 1000003) ^ this.f46561g.hashCode()) * 1000003;
        c2 c2Var = this.h;
        if (c2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2Var.hashCode();
        }
        int i14 = (hashCode7 ^ hashCode3) * 1000003;
        b2 b2Var = this.f46562i;
        if (b2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = b2Var.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        m1 m1Var = this.f46563j;
        if (m1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = m1Var.hashCode();
        }
        int i16 = (i15 ^ hashCode5) * 1000003;
        List list = this.f46564k;
        if (list != null) {
            i11 = list.hashCode();
        }
        return ((i16 ^ i11) * 1000003) ^ this.f46565l;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{generator=");
        sb2.append(this.f46557a);
        sb2.append(", identifier=");
        sb2.append(this.f46558b);
        sb2.append(", appQualitySessionId=");
        sb2.append(this.f46559c);
        sb2.append(", startedAt=");
        sb2.append(this.d);
        sb2.append(", endedAt=");
        sb2.append(this.e);
        sb2.append(", crashed=");
        sb2.append(this.f46560f);
        sb2.append(", app=");
        sb2.append(this.f46561g);
        sb2.append(", user=");
        sb2.append(this.h);
        sb2.append(", os=");
        sb2.append(this.f46562i);
        sb2.append(", device=");
        sb2.append(this.f46563j);
        sb2.append(", events=");
        sb2.append(this.f46564k);
        sb2.append(", generatorType=");
        return a4.a.n(this.f46565l, "}", sb2);
    }
}
