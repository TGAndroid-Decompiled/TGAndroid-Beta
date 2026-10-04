package y9;

import v7.d8;
public final class a0 extends e2 {
    public final String f50573b;
    public final String f50574c;
    public final int d;
    public final String f50575e;
    public final String f50576f;
    public final String f50577g;
    public final String h;
    public final String f50578i;
    public final d2 f50579j;
    public final j1 f50580k;
    public final g1 f50581l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f50573b = str;
        this.f50574c = str2;
        this.d = i10;
        this.f50575e = str3;
        this.f50576f = str4;
        this.f50577g = str5;
        this.h = str6;
        this.f50578i = str7;
        this.f50579j = d2Var;
        this.f50580k = j1Var;
        this.f50581l = g1Var;
    }

    public final d8 a() {
        ?? obj = new Object();
        obj.f47900a = this.f50573b;
        obj.f47901b = this.f50574c;
        obj.f47906i = Integer.valueOf(this.d);
        obj.f47902c = this.f50575e;
        obj.d = this.f50576f;
        obj.f47903e = this.f50577g;
        obj.f47908k = this.h;
        obj.f47904f = this.f50578i;
        obj.f47905g = this.f50579j;
        obj.h = this.f50580k;
        obj.f47907j = this.f50581l;
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
            g1 g1Var2 = a0Var.f50581l;
            j1 j1Var2 = a0Var.f50580k;
            d2 d2Var2 = a0Var.f50579j;
            String str3 = a0Var.f50577g;
            String str4 = a0Var.f50576f;
            if (this.f50573b.equals(a0Var.f50573b) && this.f50574c.equals(a0Var.f50574c) && this.d == a0Var.d && this.f50575e.equals(a0Var.f50575e) && ((str = this.f50576f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f50577g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f50578i.equals(a0Var.f50578i) && ((d2Var = this.f50579j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f50580k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f50581l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f50573b.hashCode() ^ 1000003) * 1000003) ^ this.f50574c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f50575e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f50576f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f50577g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f50578i.hashCode()) * 1000003;
        d2 d2Var = this.f50579j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f50580k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f50581l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f50573b + ", gmpAppId=" + this.f50574c + ", platform=" + this.d + ", installationUuid=" + this.f50575e + ", firebaseInstallationId=" + this.f50576f + ", appQualitySessionId=" + this.f50577g + ", buildVersion=" + this.h + ", displayVersion=" + this.f50578i + ", session=" + this.f50579j + ", ndkPayload=" + this.f50580k + ", appExitInfo=" + this.f50581l + "}";
    }
}
