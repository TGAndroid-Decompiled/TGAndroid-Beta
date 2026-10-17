package z9;

import v7.d8;
public final class a0 extends e2 {
    public final String f51318b;
    public final String f51319c;
    public final int d;
    public final String e;
    public final String f51320f;
    public final String f51321g;
    public final String h;
    public final String f51322i;
    public final d2 f51323j;
    public final j1 f51324k;
    public final g1 f51325l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f51318b = str;
        this.f51319c = str2;
        this.d = i10;
        this.e = str3;
        this.f51320f = str4;
        this.f51321g = str5;
        this.h = str6;
        this.f51322i = str7;
        this.f51323j = d2Var;
        this.f51324k = j1Var;
        this.f51325l = g1Var;
    }

    public final d8 a() {
        ?? obj = new Object();
        obj.f48013a = this.f51318b;
        obj.f48014b = this.f51319c;
        obj.f48018i = Integer.valueOf(this.d);
        obj.f48015c = this.e;
        obj.d = this.f51320f;
        obj.e = this.f51321g;
        obj.f48020k = this.h;
        obj.f48016f = this.f51322i;
        obj.f48017g = this.f51323j;
        obj.h = this.f51324k;
        obj.f48019j = this.f51325l;
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
            g1 g1Var2 = a0Var.f51325l;
            j1 j1Var2 = a0Var.f51324k;
            d2 d2Var2 = a0Var.f51323j;
            String str3 = a0Var.f51321g;
            String str4 = a0Var.f51320f;
            if (this.f51318b.equals(a0Var.f51318b) && this.f51319c.equals(a0Var.f51319c) && this.d == a0Var.d && this.e.equals(a0Var.e) && ((str = this.f51320f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f51321g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f51322i.equals(a0Var.f51322i) && ((d2Var = this.f51323j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f51324k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f51325l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f51318b.hashCode() ^ 1000003) * 1000003) ^ this.f51319c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f51320f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f51321g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f51322i.hashCode()) * 1000003;
        d2 d2Var = this.f51323j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f51324k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f51325l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f51318b + ", gmpAppId=" + this.f51319c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f51320f + ", appQualitySessionId=" + this.f51321g + ", buildVersion=" + this.h + ", displayVersion=" + this.f51322i + ", session=" + this.f51323j + ", ndkPayload=" + this.f51324k + ", appExitInfo=" + this.f51325l + "}";
    }
}
