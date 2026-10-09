package y9;

import v7.e8;
public final class a0 extends e2 {
    public final String f51861b;
    public final String f51862c;
    public final int d;
    public final String f51863e;
    public final String f51864f;
    public final String f51865g;
    public final String h;
    public final String f51866i;
    public final d2 f51867j;
    public final j1 f51868k;
    public final g1 f51869l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f51861b = str;
        this.f51862c = str2;
        this.d = i10;
        this.f51863e = str3;
        this.f51864f = str4;
        this.f51865g = str5;
        this.h = str6;
        this.f51866i = str7;
        this.f51867j = d2Var;
        this.f51868k = j1Var;
        this.f51869l = g1Var;
    }

    public final e8 a() {
        ?? obj = new Object();
        obj.f49167a = this.f51861b;
        obj.f49168b = this.f51862c;
        obj.f49173i = Integer.valueOf(this.d);
        obj.f49169c = this.f51863e;
        obj.d = this.f51864f;
        obj.f49170e = this.f51865g;
        obj.f49175k = this.h;
        obj.f49171f = this.f51866i;
        obj.f49172g = this.f51867j;
        obj.h = this.f51868k;
        obj.f49174j = this.f51869l;
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
            g1 g1Var2 = a0Var.f51869l;
            j1 j1Var2 = a0Var.f51868k;
            d2 d2Var2 = a0Var.f51867j;
            String str3 = a0Var.f51865g;
            String str4 = a0Var.f51864f;
            if (this.f51861b.equals(a0Var.f51861b) && this.f51862c.equals(a0Var.f51862c) && this.d == a0Var.d && this.f51863e.equals(a0Var.f51863e) && ((str = this.f51864f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f51865g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f51866i.equals(a0Var.f51866i) && ((d2Var = this.f51867j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f51868k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f51869l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f51861b.hashCode() ^ 1000003) * 1000003) ^ this.f51862c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f51863e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f51864f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f51865g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f51866i.hashCode()) * 1000003;
        d2 d2Var = this.f51867j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f51868k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f51869l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f51861b + ", gmpAppId=" + this.f51862c + ", platform=" + this.d + ", installationUuid=" + this.f51863e + ", firebaseInstallationId=" + this.f51864f + ", appQualitySessionId=" + this.f51865g + ", buildVersion=" + this.h + ", displayVersion=" + this.f51866i + ", session=" + this.f51867j + ", ndkPayload=" + this.f51868k + ", appExitInfo=" + this.f51869l + "}";
    }
}
