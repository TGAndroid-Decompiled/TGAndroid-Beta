package y9;

import v7.e8;
public final class a0 extends e2 {
    public final String f46720b;
    public final String f46721c;
    public final int d;
    public final String e;
    public final String f46722f;
    public final String f46723g;
    public final String h;
    public final String f46724i;
    public final d2 f46725j;
    public final j1 f46726k;
    public final g1 f46727l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f46720b = str;
        this.f46721c = str2;
        this.d = i10;
        this.e = str3;
        this.f46722f = str4;
        this.f46723g = str5;
        this.h = str6;
        this.f46724i = str7;
        this.f46725j = d2Var;
        this.f46726k = j1Var;
        this.f46727l = g1Var;
    }

    public final e8 a() {
        ?? obj = new Object();
        obj.f44221a = this.f46720b;
        obj.f44222b = this.f46721c;
        obj.f44226i = Integer.valueOf(this.d);
        obj.f44223c = this.e;
        obj.d = this.f46722f;
        obj.e = this.f46723g;
        obj.f44228k = this.h;
        obj.f44224f = this.f46724i;
        obj.f44225g = this.f46725j;
        obj.h = this.f46726k;
        obj.f44227j = this.f46727l;
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
            g1 g1Var2 = a0Var.f46727l;
            j1 j1Var2 = a0Var.f46726k;
            d2 d2Var2 = a0Var.f46725j;
            String str3 = a0Var.f46723g;
            String str4 = a0Var.f46722f;
            if (this.f46720b.equals(a0Var.f46720b) && this.f46721c.equals(a0Var.f46721c) && this.d == a0Var.d && this.e.equals(a0Var.e) && ((str = this.f46722f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f46723g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f46724i.equals(a0Var.f46724i) && ((d2Var = this.f46725j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f46726k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f46727l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f46720b.hashCode() ^ 1000003) * 1000003) ^ this.f46721c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f46722f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f46723g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f46724i.hashCode()) * 1000003;
        d2 d2Var = this.f46725j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f46726k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f46727l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f46720b + ", gmpAppId=" + this.f46721c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f46722f + ", appQualitySessionId=" + this.f46723g + ", buildVersion=" + this.h + ", displayVersion=" + this.f46724i + ", session=" + this.f46725j + ", ndkPayload=" + this.f46726k + ", appExitInfo=" + this.f46727l + "}";
    }
}
