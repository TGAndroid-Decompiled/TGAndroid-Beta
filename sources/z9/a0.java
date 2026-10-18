package z9;

import v7.d8;
public final class a0 extends e2 {
    public final String f51296b;
    public final String f51297c;
    public final int d;
    public final String e;
    public final String f51298f;
    public final String f51299g;
    public final String h;
    public final String f51300i;
    public final d2 f51301j;
    public final j1 f51302k;
    public final g1 f51303l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f51296b = str;
        this.f51297c = str2;
        this.d = i10;
        this.e = str3;
        this.f51298f = str4;
        this.f51299g = str5;
        this.h = str6;
        this.f51300i = str7;
        this.f51301j = d2Var;
        this.f51302k = j1Var;
        this.f51303l = g1Var;
    }

    public final d8 a() {
        ?? obj = new Object();
        obj.f47991a = this.f51296b;
        obj.f47992b = this.f51297c;
        obj.f47996i = Integer.valueOf(this.d);
        obj.f47993c = this.e;
        obj.d = this.f51298f;
        obj.e = this.f51299g;
        obj.f47998k = this.h;
        obj.f47994f = this.f51300i;
        obj.f47995g = this.f51301j;
        obj.h = this.f51302k;
        obj.f47997j = this.f51303l;
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
            g1 g1Var2 = a0Var.f51303l;
            j1 j1Var2 = a0Var.f51302k;
            d2 d2Var2 = a0Var.f51301j;
            String str3 = a0Var.f51299g;
            String str4 = a0Var.f51298f;
            if (this.f51296b.equals(a0Var.f51296b) && this.f51297c.equals(a0Var.f51297c) && this.d == a0Var.d && this.e.equals(a0Var.e) && ((str = this.f51298f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f51299g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f51300i.equals(a0Var.f51300i) && ((d2Var = this.f51301j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f51302k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f51303l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f51296b.hashCode() ^ 1000003) * 1000003) ^ this.f51297c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f51298f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f51299g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f51300i.hashCode()) * 1000003;
        d2 d2Var = this.f51301j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f51302k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f51303l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f51296b + ", gmpAppId=" + this.f51297c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f51298f + ", appQualitySessionId=" + this.f51299g + ", buildVersion=" + this.h + ", displayVersion=" + this.f51300i + ", session=" + this.f51301j + ", ndkPayload=" + this.f51302k + ", appExitInfo=" + this.f51303l + "}";
    }
}
