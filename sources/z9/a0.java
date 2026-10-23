package z9;

import v7.d8;
public final class a0 extends e2 {
    public final String f51307b;
    public final String f51308c;
    public final int d;
    public final String e;
    public final String f51309f;
    public final String f51310g;
    public final String h;
    public final String f51311i;
    public final d2 f51312j;
    public final j1 f51313k;
    public final g1 f51314l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f51307b = str;
        this.f51308c = str2;
        this.d = i10;
        this.e = str3;
        this.f51309f = str4;
        this.f51310g = str5;
        this.h = str6;
        this.f51311i = str7;
        this.f51312j = d2Var;
        this.f51313k = j1Var;
        this.f51314l = g1Var;
    }

    public final d8 a() {
        ?? obj = new Object();
        obj.f48002a = this.f51307b;
        obj.f48003b = this.f51308c;
        obj.f48007i = Integer.valueOf(this.d);
        obj.f48004c = this.e;
        obj.d = this.f51309f;
        obj.e = this.f51310g;
        obj.f48009k = this.h;
        obj.f48005f = this.f51311i;
        obj.f48006g = this.f51312j;
        obj.h = this.f51313k;
        obj.f48008j = this.f51314l;
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
            g1 g1Var2 = a0Var.f51314l;
            j1 j1Var2 = a0Var.f51313k;
            d2 d2Var2 = a0Var.f51312j;
            String str3 = a0Var.f51310g;
            String str4 = a0Var.f51309f;
            if (this.f51307b.equals(a0Var.f51307b) && this.f51308c.equals(a0Var.f51308c) && this.d == a0Var.d && this.e.equals(a0Var.e) && ((str = this.f51309f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f51310g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f51311i.equals(a0Var.f51311i) && ((d2Var = this.f51312j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f51313k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f51314l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f51307b.hashCode() ^ 1000003) * 1000003) ^ this.f51308c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f51309f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f51310g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f51311i.hashCode()) * 1000003;
        d2 d2Var = this.f51312j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f51313k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f51314l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f51307b + ", gmpAppId=" + this.f51308c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f51309f + ", appQualitySessionId=" + this.f51310g + ", buildVersion=" + this.h + ", displayVersion=" + this.f51311i + ", session=" + this.f51312j + ", ndkPayload=" + this.f51313k + ", appExitInfo=" + this.f51314l + "}";
    }
}
