package y9;

import v7.e8;
public final class a0 extends e2 {
    public final String f51982b;
    public final String f51983c;
    public final int d;
    public final String f51984e;
    public final String f51985f;
    public final String f51986g;
    public final String h;
    public final String f51987i;
    public final d2 f51988j;
    public final j1 f51989k;
    public final g1 f51990l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f51982b = str;
        this.f51983c = str2;
        this.d = i10;
        this.f51984e = str3;
        this.f51985f = str4;
        this.f51986g = str5;
        this.h = str6;
        this.f51987i = str7;
        this.f51988j = d2Var;
        this.f51989k = j1Var;
        this.f51990l = g1Var;
    }

    public final e8 a() {
        ?? obj = new Object();
        obj.f49288a = this.f51982b;
        obj.f49289b = this.f51983c;
        obj.f49294i = Integer.valueOf(this.d);
        obj.f49290c = this.f51984e;
        obj.d = this.f51985f;
        obj.f49291e = this.f51986g;
        obj.f49296k = this.h;
        obj.f49292f = this.f51987i;
        obj.f49293g = this.f51988j;
        obj.h = this.f51989k;
        obj.f49295j = this.f51990l;
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
            g1 g1Var2 = a0Var.f51990l;
            j1 j1Var2 = a0Var.f51989k;
            d2 d2Var2 = a0Var.f51988j;
            String str3 = a0Var.f51986g;
            String str4 = a0Var.f51985f;
            if (this.f51982b.equals(a0Var.f51982b) && this.f51983c.equals(a0Var.f51983c) && this.d == a0Var.d && this.f51984e.equals(a0Var.f51984e) && ((str = this.f51985f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f51986g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f51987i.equals(a0Var.f51987i) && ((d2Var = this.f51988j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f51989k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f51990l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f51982b.hashCode() ^ 1000003) * 1000003) ^ this.f51983c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f51984e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f51985f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f51986g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f51987i.hashCode()) * 1000003;
        d2 d2Var = this.f51988j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f51989k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f51990l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f51982b + ", gmpAppId=" + this.f51983c + ", platform=" + this.d + ", installationUuid=" + this.f51984e + ", firebaseInstallationId=" + this.f51985f + ", appQualitySessionId=" + this.f51986g + ", buildVersion=" + this.h + ", displayVersion=" + this.f51987i + ", session=" + this.f51988j + ", ndkPayload=" + this.f51989k + ", appExitInfo=" + this.f51990l + "}";
    }
}
