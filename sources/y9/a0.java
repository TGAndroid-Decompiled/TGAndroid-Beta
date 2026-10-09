package y9;

import v7.e8;
public final class a0 extends e2 {
    public final String f51859b;
    public final String f51860c;
    public final int d;
    public final String f51861e;
    public final String f51862f;
    public final String f51863g;
    public final String h;
    public final String f51864i;
    public final d2 f51865j;
    public final j1 f51866k;
    public final g1 f51867l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f51859b = str;
        this.f51860c = str2;
        this.d = i10;
        this.f51861e = str3;
        this.f51862f = str4;
        this.f51863g = str5;
        this.h = str6;
        this.f51864i = str7;
        this.f51865j = d2Var;
        this.f51866k = j1Var;
        this.f51867l = g1Var;
    }

    public final e8 a() {
        ?? obj = new Object();
        obj.f49165a = this.f51859b;
        obj.f49166b = this.f51860c;
        obj.f49171i = Integer.valueOf(this.d);
        obj.f49167c = this.f51861e;
        obj.d = this.f51862f;
        obj.f49168e = this.f51863g;
        obj.f49173k = this.h;
        obj.f49169f = this.f51864i;
        obj.f49170g = this.f51865j;
        obj.h = this.f51866k;
        obj.f49172j = this.f51867l;
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
            g1 g1Var2 = a0Var.f51867l;
            j1 j1Var2 = a0Var.f51866k;
            d2 d2Var2 = a0Var.f51865j;
            String str3 = a0Var.f51863g;
            String str4 = a0Var.f51862f;
            if (this.f51859b.equals(a0Var.f51859b) && this.f51860c.equals(a0Var.f51860c) && this.d == a0Var.d && this.f51861e.equals(a0Var.f51861e) && ((str = this.f51862f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f51863g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f51864i.equals(a0Var.f51864i) && ((d2Var = this.f51865j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f51866k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f51867l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f51859b.hashCode() ^ 1000003) * 1000003) ^ this.f51860c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f51861e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f51862f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f51863g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f51864i.hashCode()) * 1000003;
        d2 d2Var = this.f51865j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f51866k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f51867l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f51859b + ", gmpAppId=" + this.f51860c + ", platform=" + this.d + ", installationUuid=" + this.f51861e + ", firebaseInstallationId=" + this.f51862f + ", appQualitySessionId=" + this.f51863g + ", buildVersion=" + this.h + ", displayVersion=" + this.f51864i + ", session=" + this.f51865j + ", ndkPayload=" + this.f51866k + ", appExitInfo=" + this.f51867l + "}";
    }
}
