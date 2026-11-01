package z9;

import v7.a8;
public final class a0 extends e2 {
    public final String f55233b;
    public final String f55234c;
    public final int d;
    public final String e;
    public final String f55235f;
    public final String f55236g;
    public final String h;
    public final String f55237i;
    public final d2 f55238j;
    public final j1 f55239k;
    public final g1 f55240l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f55233b = str;
        this.f55234c = str2;
        this.d = i10;
        this.e = str3;
        this.f55235f = str4;
        this.f55236g = str5;
        this.h = str6;
        this.f55237i = str7;
        this.f55238j = d2Var;
        this.f55239k = j1Var;
        this.f55240l = g1Var;
    }

    public final a8 a() {
        ?? obj = new Object();
        obj.f50398a = this.f55233b;
        obj.f50399b = this.f55234c;
        obj.f50403i = Integer.valueOf(this.d);
        obj.f50400c = this.e;
        obj.d = this.f55235f;
        obj.e = this.f55236g;
        obj.f50405k = this.h;
        obj.f50401f = this.f55237i;
        obj.f50402g = this.f55238j;
        obj.h = this.f55239k;
        obj.f50404j = this.f55240l;
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
            g1 g1Var2 = a0Var.f55240l;
            j1 j1Var2 = a0Var.f55239k;
            d2 d2Var2 = a0Var.f55238j;
            String str3 = a0Var.f55236g;
            String str4 = a0Var.f55235f;
            if (this.f55233b.equals(a0Var.f55233b) && this.f55234c.equals(a0Var.f55234c) && this.d == a0Var.d && this.e.equals(a0Var.e) && ((str = this.f55235f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f55236g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f55237i.equals(a0Var.f55237i) && ((d2Var = this.f55238j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f55239k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f55240l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f55233b.hashCode() ^ 1000003) * 1000003) ^ this.f55234c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f55235f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f55236g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f55237i.hashCode()) * 1000003;
        d2 d2Var = this.f55238j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f55239k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f55240l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f55233b + ", gmpAppId=" + this.f55234c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f55235f + ", appQualitySessionId=" + this.f55236g + ", buildVersion=" + this.h + ", displayVersion=" + this.f55237i + ", session=" + this.f55238j + ", ndkPayload=" + this.f55239k + ", appExitInfo=" + this.f55240l + "}";
    }
}
