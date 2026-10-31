package z9;

import v7.a8;
public final class a0 extends e2 {
    public final String f55215b;
    public final String f55216c;
    public final int d;
    public final String e;
    public final String f55217f;
    public final String f55218g;
    public final String h;
    public final String f55219i;
    public final d2 f55220j;
    public final j1 f55221k;
    public final g1 f55222l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f55215b = str;
        this.f55216c = str2;
        this.d = i10;
        this.e = str3;
        this.f55217f = str4;
        this.f55218g = str5;
        this.h = str6;
        this.f55219i = str7;
        this.f55220j = d2Var;
        this.f55221k = j1Var;
        this.f55222l = g1Var;
    }

    public final a8 a() {
        ?? obj = new Object();
        obj.f50384a = this.f55215b;
        obj.f50385b = this.f55216c;
        obj.f50389i = Integer.valueOf(this.d);
        obj.f50386c = this.e;
        obj.d = this.f55217f;
        obj.e = this.f55218g;
        obj.f50391k = this.h;
        obj.f50387f = this.f55219i;
        obj.f50388g = this.f55220j;
        obj.h = this.f55221k;
        obj.f50390j = this.f55222l;
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
            g1 g1Var2 = a0Var.f55222l;
            j1 j1Var2 = a0Var.f55221k;
            d2 d2Var2 = a0Var.f55220j;
            String str3 = a0Var.f55218g;
            String str4 = a0Var.f55217f;
            if (this.f55215b.equals(a0Var.f55215b) && this.f55216c.equals(a0Var.f55216c) && this.d == a0Var.d && this.e.equals(a0Var.e) && ((str = this.f55217f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f55218g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f55219i.equals(a0Var.f55219i) && ((d2Var = this.f55220j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f55221k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f55222l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f55215b.hashCode() ^ 1000003) * 1000003) ^ this.f55216c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f55217f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f55218g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f55219i.hashCode()) * 1000003;
        d2 d2Var = this.f55220j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f55221k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f55222l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f55215b + ", gmpAppId=" + this.f55216c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f55217f + ", appQualitySessionId=" + this.f55218g + ", buildVersion=" + this.h + ", displayVersion=" + this.f55219i + ", session=" + this.f55220j + ", ndkPayload=" + this.f55221k + ", appExitInfo=" + this.f55222l + "}";
    }
}
