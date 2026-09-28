package y9;

import v7.e8;
public final class a0 extends e2 {
    public final String f46732b;
    public final String f46733c;
    public final int d;
    public final String e;
    public final String f46734f;
    public final String f46735g;
    public final String h;
    public final String f46736i;
    public final d2 f46737j;
    public final j1 f46738k;
    public final g1 f46739l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f46732b = str;
        this.f46733c = str2;
        this.d = i10;
        this.e = str3;
        this.f46734f = str4;
        this.f46735g = str5;
        this.h = str6;
        this.f46736i = str7;
        this.f46737j = d2Var;
        this.f46738k = j1Var;
        this.f46739l = g1Var;
    }

    public final e8 a() {
        ?? obj = new Object();
        obj.f44236a = this.f46732b;
        obj.f44237b = this.f46733c;
        obj.f44241i = Integer.valueOf(this.d);
        obj.f44238c = this.e;
        obj.d = this.f46734f;
        obj.e = this.f46735g;
        obj.f44243k = this.h;
        obj.f44239f = this.f46736i;
        obj.f44240g = this.f46737j;
        obj.h = this.f46738k;
        obj.f44242j = this.f46739l;
        return obj;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        d2 d2Var;
        j1 j1Var;
        g1 g1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e2) {
            a0 a0Var = (a0) ((e2) obj);
            g1 g1Var2 = a0Var.f46739l;
            j1 j1Var2 = a0Var.f46738k;
            d2 d2Var2 = a0Var.f46737j;
            String str3 = a0Var.f46735g;
            String str4 = a0Var.f46734f;
            if (this.f46732b.equals(a0Var.f46732b) && this.f46733c.equals(a0Var.f46733c) && this.d == a0Var.d && this.e.equals(a0Var.e) && ((str = this.f46734f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f46735g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f46736i.equals(a0Var.f46736i) && ((d2Var = this.f46737j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f46738k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f46739l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (((((((this.f46732b.hashCode() ^ 1000003) * 1000003) ^ this.f46733c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f46734f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f46735g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f46736i.hashCode()) * 1000003;
        d2 d2Var = this.f46737j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f46738k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f46739l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f46732b + ", gmpAppId=" + this.f46733c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f46734f + ", appQualitySessionId=" + this.f46735g + ", buildVersion=" + this.h + ", displayVersion=" + this.f46736i + ", session=" + this.f46737j + ", ndkPayload=" + this.f46738k + ", appExitInfo=" + this.f46739l + "}";
    }
}
