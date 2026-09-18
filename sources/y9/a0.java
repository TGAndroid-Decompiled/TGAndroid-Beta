package y9;

import v7.d8;
public final class a0 extends e2 {
    public final String f46707b;
    public final String f46708c;
    public final int d;
    public final String e;
    public final String f46709f;
    public final String f46710g;
    public final String h;
    public final String f46711i;
    public final d2 f46712j;
    public final j1 f46713k;
    public final g1 f46714l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f46707b = str;
        this.f46708c = str2;
        this.d = i10;
        this.e = str3;
        this.f46709f = str4;
        this.f46710g = str5;
        this.h = str6;
        this.f46711i = str7;
        this.f46712j = d2Var;
        this.f46713k = j1Var;
        this.f46714l = g1Var;
    }

    public final d8 a() {
        ?? obj = new Object();
        obj.f44199a = this.f46707b;
        obj.f44200b = this.f46708c;
        obj.f44204i = Integer.valueOf(this.d);
        obj.f44201c = this.e;
        obj.d = this.f46709f;
        obj.e = this.f46710g;
        obj.f44206k = this.h;
        obj.f44202f = this.f46711i;
        obj.f44203g = this.f46712j;
        obj.h = this.f46713k;
        obj.f44205j = this.f46714l;
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
            g1 g1Var2 = a0Var.f46714l;
            j1 j1Var2 = a0Var.f46713k;
            d2 d2Var2 = a0Var.f46712j;
            String str3 = a0Var.f46710g;
            String str4 = a0Var.f46709f;
            if (this.f46707b.equals(a0Var.f46707b) && this.f46708c.equals(a0Var.f46708c) && this.d == a0Var.d && this.e.equals(a0Var.e) && ((str = this.f46709f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f46710g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f46711i.equals(a0Var.f46711i) && ((d2Var = this.f46712j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f46713k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f46714l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f46707b.hashCode() ^ 1000003) * 1000003) ^ this.f46708c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f46709f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f46710g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f46711i.hashCode()) * 1000003;
        d2 d2Var = this.f46712j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f46713k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f46714l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f46707b + ", gmpAppId=" + this.f46708c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f46709f + ", appQualitySessionId=" + this.f46710g + ", buildVersion=" + this.h + ", displayVersion=" + this.f46711i + ", session=" + this.f46712j + ", ndkPayload=" + this.f46713k + ", appExitInfo=" + this.f46714l + "}";
    }
}
