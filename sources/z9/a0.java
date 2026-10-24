package z9;

import v7.d8;
public final class a0 extends e2 {
    public final String f51767b;
    public final String f51768c;
    public final int d;
    public final String e;
    public final String f51769f;
    public final String f51770g;
    public final String h;
    public final String f51771i;
    public final d2 f51772j;
    public final j1 f51773k;
    public final g1 f51774l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f51767b = str;
        this.f51768c = str2;
        this.d = i10;
        this.e = str3;
        this.f51769f = str4;
        this.f51770g = str5;
        this.h = str6;
        this.f51771i = str7;
        this.f51772j = d2Var;
        this.f51773k = j1Var;
        this.f51774l = g1Var;
    }

    public final d8 a() {
        ?? obj = new Object();
        obj.f48439a = this.f51767b;
        obj.f48440b = this.f51768c;
        obj.f48444i = Integer.valueOf(this.d);
        obj.f48441c = this.e;
        obj.d = this.f51769f;
        obj.e = this.f51770g;
        obj.f48446k = this.h;
        obj.f48442f = this.f51771i;
        obj.f48443g = this.f51772j;
        obj.h = this.f51773k;
        obj.f48445j = this.f51774l;
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
            g1 g1Var2 = a0Var.f51774l;
            j1 j1Var2 = a0Var.f51773k;
            d2 d2Var2 = a0Var.f51772j;
            String str3 = a0Var.f51770g;
            String str4 = a0Var.f51769f;
            if (this.f51767b.equals(a0Var.f51767b) && this.f51768c.equals(a0Var.f51768c) && this.d == a0Var.d && this.e.equals(a0Var.e) && ((str = this.f51769f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f51770g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f51771i.equals(a0Var.f51771i) && ((d2Var = this.f51772j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f51773k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f51774l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f51767b.hashCode() ^ 1000003) * 1000003) ^ this.f51768c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f51769f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f51770g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f51771i.hashCode()) * 1000003;
        d2 d2Var = this.f51772j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f51773k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f51774l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f51767b + ", gmpAppId=" + this.f51768c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f51769f + ", appQualitySessionId=" + this.f51770g + ", buildVersion=" + this.h + ", displayVersion=" + this.f51771i + ", session=" + this.f51772j + ", ndkPayload=" + this.f51773k + ", appExitInfo=" + this.f51774l + "}";
    }
}
