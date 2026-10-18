package z9;

import v7.d8;
public final class a0 extends e2 {
    public final String f51343b;
    public final String f51344c;
    public final int d;
    public final String e;
    public final String f51345f;
    public final String f51346g;
    public final String h;
    public final String f51347i;
    public final d2 f51348j;
    public final j1 f51349k;
    public final g1 f51350l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f51343b = str;
        this.f51344c = str2;
        this.d = i10;
        this.e = str3;
        this.f51345f = str4;
        this.f51346g = str5;
        this.h = str6;
        this.f51347i = str7;
        this.f51348j = d2Var;
        this.f51349k = j1Var;
        this.f51350l = g1Var;
    }

    public final d8 a() {
        ?? obj = new Object();
        obj.f48038a = this.f51343b;
        obj.f48039b = this.f51344c;
        obj.f48043i = Integer.valueOf(this.d);
        obj.f48040c = this.e;
        obj.d = this.f51345f;
        obj.e = this.f51346g;
        obj.f48045k = this.h;
        obj.f48041f = this.f51347i;
        obj.f48042g = this.f51348j;
        obj.h = this.f51349k;
        obj.f48044j = this.f51350l;
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
            g1 g1Var2 = a0Var.f51350l;
            j1 j1Var2 = a0Var.f51349k;
            d2 d2Var2 = a0Var.f51348j;
            String str3 = a0Var.f51346g;
            String str4 = a0Var.f51345f;
            if (this.f51343b.equals(a0Var.f51343b) && this.f51344c.equals(a0Var.f51344c) && this.d == a0Var.d && this.e.equals(a0Var.e) && ((str = this.f51345f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f51346g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f51347i.equals(a0Var.f51347i) && ((d2Var = this.f51348j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f51349k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f51350l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f51343b.hashCode() ^ 1000003) * 1000003) ^ this.f51344c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f51345f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f51346g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f51347i.hashCode()) * 1000003;
        d2 d2Var = this.f51348j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f51349k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f51350l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f51343b + ", gmpAppId=" + this.f51344c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f51345f + ", appQualitySessionId=" + this.f51346g + ", buildVersion=" + this.h + ", displayVersion=" + this.f51347i + ", session=" + this.f51348j + ", ndkPayload=" + this.f51349k + ", appExitInfo=" + this.f51350l + "}";
    }
}
