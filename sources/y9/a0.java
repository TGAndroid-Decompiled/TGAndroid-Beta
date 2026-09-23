package y9;

import v7.d8;
public final class a0 extends e2 {
    public final String f46406b;
    public final String f46407c;
    public final int d;
    public final String e;
    public final String f46408f;
    public final String f46409g;
    public final String h;
    public final String f46410i;
    public final d2 f46411j;
    public final j1 f46412k;
    public final g1 f46413l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f46406b = str;
        this.f46407c = str2;
        this.d = i10;
        this.e = str3;
        this.f46408f = str4;
        this.f46409g = str5;
        this.h = str6;
        this.f46410i = str7;
        this.f46411j = d2Var;
        this.f46412k = j1Var;
        this.f46413l = g1Var;
    }

    public final d8 a() {
        ?? obj = new Object();
        obj.f43895a = this.f46406b;
        obj.f43896b = this.f46407c;
        obj.f43900i = Integer.valueOf(this.d);
        obj.f43897c = this.e;
        obj.d = this.f46408f;
        obj.e = this.f46409g;
        obj.f43902k = this.h;
        obj.f43898f = this.f46410i;
        obj.f43899g = this.f46411j;
        obj.h = this.f46412k;
        obj.f43901j = this.f46413l;
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
            g1 g1Var2 = a0Var.f46413l;
            j1 j1Var2 = a0Var.f46412k;
            d2 d2Var2 = a0Var.f46411j;
            String str3 = a0Var.f46409g;
            String str4 = a0Var.f46408f;
            if (this.f46406b.equals(a0Var.f46406b) && this.f46407c.equals(a0Var.f46407c) && this.d == a0Var.d && this.e.equals(a0Var.e) && ((str = this.f46408f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f46409g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f46410i.equals(a0Var.f46410i) && ((d2Var = this.f46411j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f46412k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f46413l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f46406b.hashCode() ^ 1000003) * 1000003) ^ this.f46407c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f46408f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f46409g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f46410i.hashCode()) * 1000003;
        d2 d2Var = this.f46411j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f46412k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f46413l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f46406b + ", gmpAppId=" + this.f46407c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f46408f + ", appQualitySessionId=" + this.f46409g + ", buildVersion=" + this.h + ", displayVersion=" + this.f46410i + ", session=" + this.f46411j + ", ndkPayload=" + this.f46412k + ", appExitInfo=" + this.f46413l + "}";
    }
}
