package y9;

import v7.d8;
public final class a0 extends e2 {
    public final String f50580b;
    public final String f50581c;
    public final int d;
    public final String f50582e;
    public final String f50583f;
    public final String f50584g;
    public final String h;
    public final String f50585i;
    public final d2 f50586j;
    public final j1 f50587k;
    public final g1 f50588l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f50580b = str;
        this.f50581c = str2;
        this.d = i10;
        this.f50582e = str3;
        this.f50583f = str4;
        this.f50584g = str5;
        this.h = str6;
        this.f50585i = str7;
        this.f50586j = d2Var;
        this.f50587k = j1Var;
        this.f50588l = g1Var;
    }

    public final d8 a() {
        ?? obj = new Object();
        obj.f47907a = this.f50580b;
        obj.f47908b = this.f50581c;
        obj.f47913i = Integer.valueOf(this.d);
        obj.f47909c = this.f50582e;
        obj.d = this.f50583f;
        obj.f47910e = this.f50584g;
        obj.f47915k = this.h;
        obj.f47911f = this.f50585i;
        obj.f47912g = this.f50586j;
        obj.h = this.f50587k;
        obj.f47914j = this.f50588l;
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
            g1 g1Var2 = a0Var.f50588l;
            j1 j1Var2 = a0Var.f50587k;
            d2 d2Var2 = a0Var.f50586j;
            String str3 = a0Var.f50584g;
            String str4 = a0Var.f50583f;
            if (this.f50580b.equals(a0Var.f50580b) && this.f50581c.equals(a0Var.f50581c) && this.d == a0Var.d && this.f50582e.equals(a0Var.f50582e) && ((str = this.f50583f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f50584g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f50585i.equals(a0Var.f50585i) && ((d2Var = this.f50586j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f50587k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f50588l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f50580b.hashCode() ^ 1000003) * 1000003) ^ this.f50581c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f50582e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f50583f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f50584g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f50585i.hashCode()) * 1000003;
        d2 d2Var = this.f50586j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f50587k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f50588l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f50580b + ", gmpAppId=" + this.f50581c + ", platform=" + this.d + ", installationUuid=" + this.f50582e + ", firebaseInstallationId=" + this.f50583f + ", appQualitySessionId=" + this.f50584g + ", buildVersion=" + this.h + ", displayVersion=" + this.f50585i + ", session=" + this.f50586j + ", ndkPayload=" + this.f50587k + ", appExitInfo=" + this.f50588l + "}";
    }
}
