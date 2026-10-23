package z9;

import v7.d8;
public final class a0 extends e2 {
    public final String f51768b;
    public final String f51769c;
    public final int d;
    public final String e;
    public final String f51770f;
    public final String f51771g;
    public final String h;
    public final String f51772i;
    public final d2 f51773j;
    public final j1 f51774k;
    public final g1 f51775l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f51768b = str;
        this.f51769c = str2;
        this.d = i10;
        this.e = str3;
        this.f51770f = str4;
        this.f51771g = str5;
        this.h = str6;
        this.f51772i = str7;
        this.f51773j = d2Var;
        this.f51774k = j1Var;
        this.f51775l = g1Var;
    }

    public final d8 a() {
        ?? obj = new Object();
        obj.f48440a = this.f51768b;
        obj.f48441b = this.f51769c;
        obj.f48445i = Integer.valueOf(this.d);
        obj.f48442c = this.e;
        obj.d = this.f51770f;
        obj.e = this.f51771g;
        obj.f48447k = this.h;
        obj.f48443f = this.f51772i;
        obj.f48444g = this.f51773j;
        obj.h = this.f51774k;
        obj.f48446j = this.f51775l;
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
            g1 g1Var2 = a0Var.f51775l;
            j1 j1Var2 = a0Var.f51774k;
            d2 d2Var2 = a0Var.f51773j;
            String str3 = a0Var.f51771g;
            String str4 = a0Var.f51770f;
            if (this.f51768b.equals(a0Var.f51768b) && this.f51769c.equals(a0Var.f51769c) && this.d == a0Var.d && this.e.equals(a0Var.e) && ((str = this.f51770f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f51771g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f51772i.equals(a0Var.f51772i) && ((d2Var = this.f51773j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f51774k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f51775l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f51768b.hashCode() ^ 1000003) * 1000003) ^ this.f51769c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f51770f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f51771g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f51772i.hashCode()) * 1000003;
        d2 d2Var = this.f51773j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f51774k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f51775l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f51768b + ", gmpAppId=" + this.f51769c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f51770f + ", appQualitySessionId=" + this.f51771g + ", buildVersion=" + this.h + ", displayVersion=" + this.f51772i + ", session=" + this.f51773j + ", ndkPayload=" + this.f51774k + ", appExitInfo=" + this.f51775l + "}";
    }
}
