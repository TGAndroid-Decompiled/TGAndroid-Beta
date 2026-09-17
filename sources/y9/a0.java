package y9;

import v7.d8;
public final class a0 extends e2 {
    public final String f46475b;
    public final String f46476c;
    public final int d;
    public final String e;
    public final String f46477f;
    public final String f46478g;
    public final String h;
    public final String f46479i;
    public final d2 f46480j;
    public final j1 f46481k;
    public final g1 f46482l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f46475b = str;
        this.f46476c = str2;
        this.d = i10;
        this.e = str3;
        this.f46477f = str4;
        this.f46478g = str5;
        this.h = str6;
        this.f46479i = str7;
        this.f46480j = d2Var;
        this.f46481k = j1Var;
        this.f46482l = g1Var;
    }

    public final d8 a() {
        ?? obj = new Object();
        obj.f43968a = this.f46475b;
        obj.f43969b = this.f46476c;
        obj.f43973i = Integer.valueOf(this.d);
        obj.f43970c = this.e;
        obj.d = this.f46477f;
        obj.e = this.f46478g;
        obj.f43975k = this.h;
        obj.f43971f = this.f46479i;
        obj.f43972g = this.f46480j;
        obj.h = this.f46481k;
        obj.f43974j = this.f46482l;
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
            g1 g1Var2 = a0Var.f46482l;
            j1 j1Var2 = a0Var.f46481k;
            d2 d2Var2 = a0Var.f46480j;
            String str3 = a0Var.f46478g;
            String str4 = a0Var.f46477f;
            if (this.f46475b.equals(a0Var.f46475b) && this.f46476c.equals(a0Var.f46476c) && this.d == a0Var.d && this.e.equals(a0Var.e) && ((str = this.f46477f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f46478g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f46479i.equals(a0Var.f46479i) && ((d2Var = this.f46480j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f46481k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f46482l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f46475b.hashCode() ^ 1000003) * 1000003) ^ this.f46476c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f46477f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f46478g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f46479i.hashCode()) * 1000003;
        d2 d2Var = this.f46480j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f46481k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f46482l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f46475b + ", gmpAppId=" + this.f46476c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f46477f + ", appQualitySessionId=" + this.f46478g + ", buildVersion=" + this.h + ", displayVersion=" + this.f46479i + ", session=" + this.f46480j + ", ndkPayload=" + this.f46481k + ", appExitInfo=" + this.f46482l + "}";
    }
}
