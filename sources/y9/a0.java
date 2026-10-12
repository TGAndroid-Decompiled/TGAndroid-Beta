package y9;

import v7.e8;
public final class a0 extends e2 {
    public final String f52093b;
    public final String f52094c;
    public final int d;
    public final String f52095e;
    public final String f52096f;
    public final String f52097g;
    public final String h;
    public final String f52098i;
    public final d2 f52099j;
    public final j1 f52100k;
    public final g1 f52101l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f52093b = str;
        this.f52094c = str2;
        this.d = i10;
        this.f52095e = str3;
        this.f52096f = str4;
        this.f52097g = str5;
        this.h = str6;
        this.f52098i = str7;
        this.f52099j = d2Var;
        this.f52100k = j1Var;
        this.f52101l = g1Var;
    }

    public final e8 a() {
        ?? obj = new Object();
        obj.f49403a = this.f52093b;
        obj.f49404b = this.f52094c;
        obj.f49409i = Integer.valueOf(this.d);
        obj.f49405c = this.f52095e;
        obj.d = this.f52096f;
        obj.f49406e = this.f52097g;
        obj.f49411k = this.h;
        obj.f49407f = this.f52098i;
        obj.f49408g = this.f52099j;
        obj.h = this.f52100k;
        obj.f49410j = this.f52101l;
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
            g1 g1Var2 = a0Var.f52101l;
            j1 j1Var2 = a0Var.f52100k;
            d2 d2Var2 = a0Var.f52099j;
            String str3 = a0Var.f52097g;
            String str4 = a0Var.f52096f;
            if (this.f52093b.equals(a0Var.f52093b) && this.f52094c.equals(a0Var.f52094c) && this.d == a0Var.d && this.f52095e.equals(a0Var.f52095e) && ((str = this.f52096f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f52097g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f52098i.equals(a0Var.f52098i) && ((d2Var = this.f52099j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f52100k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f52101l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f52093b.hashCode() ^ 1000003) * 1000003) ^ this.f52094c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f52095e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f52096f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f52097g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f52098i.hashCode()) * 1000003;
        d2 d2Var = this.f52099j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f52100k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f52101l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f52093b + ", gmpAppId=" + this.f52094c + ", platform=" + this.d + ", installationUuid=" + this.f52095e + ", firebaseInstallationId=" + this.f52096f + ", appQualitySessionId=" + this.f52097g + ", buildVersion=" + this.h + ", displayVersion=" + this.f52098i + ", session=" + this.f52099j + ", ndkPayload=" + this.f52100k + ", appExitInfo=" + this.f52101l + "}";
    }
}
