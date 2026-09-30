package y9;

import v7.e8;
public final class a0 extends e2 {
    public final String f46733b;
    public final String f46734c;
    public final int d;
    public final String e;
    public final String f46735f;
    public final String f46736g;
    public final String h;
    public final String f46737i;
    public final d2 f46738j;
    public final j1 f46739k;
    public final g1 f46740l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f46733b = str;
        this.f46734c = str2;
        this.d = i10;
        this.e = str3;
        this.f46735f = str4;
        this.f46736g = str5;
        this.h = str6;
        this.f46737i = str7;
        this.f46738j = d2Var;
        this.f46739k = j1Var;
        this.f46740l = g1Var;
    }

    public final e8 a() {
        ?? obj = new Object();
        obj.f44237a = this.f46733b;
        obj.f44238b = this.f46734c;
        obj.f44242i = Integer.valueOf(this.d);
        obj.f44239c = this.e;
        obj.d = this.f46735f;
        obj.e = this.f46736g;
        obj.f44244k = this.h;
        obj.f44240f = this.f46737i;
        obj.f44241g = this.f46738j;
        obj.h = this.f46739k;
        obj.f44243j = this.f46740l;
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
            g1 g1Var2 = a0Var.f46740l;
            j1 j1Var2 = a0Var.f46739k;
            d2 d2Var2 = a0Var.f46738j;
            String str3 = a0Var.f46736g;
            String str4 = a0Var.f46735f;
            if (this.f46733b.equals(a0Var.f46733b) && this.f46734c.equals(a0Var.f46734c) && this.d == a0Var.d && this.e.equals(a0Var.e) && ((str = this.f46735f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f46736g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f46737i.equals(a0Var.f46737i) && ((d2Var = this.f46738j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f46739k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f46740l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f46733b.hashCode() ^ 1000003) * 1000003) ^ this.f46734c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f46735f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f46736g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f46737i.hashCode()) * 1000003;
        d2 d2Var = this.f46738j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f46739k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f46740l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f46733b + ", gmpAppId=" + this.f46734c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f46735f + ", appQualitySessionId=" + this.f46736g + ", buildVersion=" + this.h + ", displayVersion=" + this.f46737i + ", session=" + this.f46738j + ", ndkPayload=" + this.f46739k + ", appExitInfo=" + this.f46740l + "}";
    }
}
