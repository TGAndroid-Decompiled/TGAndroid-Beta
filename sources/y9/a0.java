package y9;

import v7.e8;
public final class a0 extends e2 {
    public final String f46839b;
    public final String f46840c;
    public final int d;
    public final String e;
    public final String f46841f;
    public final String f46842g;
    public final String h;
    public final String f46843i;
    public final d2 f46844j;
    public final j1 f46845k;
    public final g1 f46846l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f46839b = str;
        this.f46840c = str2;
        this.d = i10;
        this.e = str3;
        this.f46841f = str4;
        this.f46842g = str5;
        this.h = str6;
        this.f46843i = str7;
        this.f46844j = d2Var;
        this.f46845k = j1Var;
        this.f46846l = g1Var;
    }

    public final e8 a() {
        ?? obj = new Object();
        obj.f44343a = this.f46839b;
        obj.f44344b = this.f46840c;
        obj.f44348i = Integer.valueOf(this.d);
        obj.f44345c = this.e;
        obj.d = this.f46841f;
        obj.e = this.f46842g;
        obj.f44350k = this.h;
        obj.f44346f = this.f46843i;
        obj.f44347g = this.f46844j;
        obj.h = this.f46845k;
        obj.f44349j = this.f46846l;
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
            g1 g1Var2 = a0Var.f46846l;
            j1 j1Var2 = a0Var.f46845k;
            d2 d2Var2 = a0Var.f46844j;
            String str3 = a0Var.f46842g;
            String str4 = a0Var.f46841f;
            if (this.f46839b.equals(a0Var.f46839b) && this.f46840c.equals(a0Var.f46840c) && this.d == a0Var.d && this.e.equals(a0Var.e) && ((str = this.f46841f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f46842g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f46843i.equals(a0Var.f46843i) && ((d2Var = this.f46844j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f46845k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f46846l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f46839b.hashCode() ^ 1000003) * 1000003) ^ this.f46840c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f46841f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f46842g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f46843i.hashCode()) * 1000003;
        d2 d2Var = this.f46844j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f46845k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f46846l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f46839b + ", gmpAppId=" + this.f46840c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f46841f + ", appQualitySessionId=" + this.f46842g + ", buildVersion=" + this.h + ", displayVersion=" + this.f46843i + ", session=" + this.f46844j + ", ndkPayload=" + this.f46845k + ", appExitInfo=" + this.f46846l + "}";
    }
}
