package z9;

import v7.d8;
public final class a0 extends e2 {
    public final String f49912b;
    public final String f49913c;
    public final int d;
    public final String e;
    public final String f49914f;
    public final String f49915g;
    public final String h;
    public final String f49916i;
    public final d2 f49917j;
    public final j1 f49918k;
    public final g1 f49919l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f49912b = str;
        this.f49913c = str2;
        this.d = i10;
        this.e = str3;
        this.f49914f = str4;
        this.f49915g = str5;
        this.h = str6;
        this.f49916i = str7;
        this.f49917j = d2Var;
        this.f49918k = j1Var;
        this.f49919l = g1Var;
    }

    public final d8 a() {
        ?? obj = new Object();
        obj.f46606a = this.f49912b;
        obj.f46607b = this.f49913c;
        obj.f46611i = Integer.valueOf(this.d);
        obj.f46608c = this.e;
        obj.d = this.f49914f;
        obj.e = this.f49915g;
        obj.f46613k = this.h;
        obj.f46609f = this.f49916i;
        obj.f46610g = this.f49917j;
        obj.h = this.f49918k;
        obj.f46612j = this.f49919l;
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
            g1 g1Var2 = a0Var.f49919l;
            j1 j1Var2 = a0Var.f49918k;
            d2 d2Var2 = a0Var.f49917j;
            String str3 = a0Var.f49915g;
            String str4 = a0Var.f49914f;
            if (this.f49912b.equals(a0Var.f49912b) && this.f49913c.equals(a0Var.f49913c) && this.d == a0Var.d && this.e.equals(a0Var.e) && ((str = this.f49914f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f49915g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f49916i.equals(a0Var.f49916i) && ((d2Var = this.f49917j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f49918k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f49919l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f49912b.hashCode() ^ 1000003) * 1000003) ^ this.f49913c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f49914f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f49915g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f49916i.hashCode()) * 1000003;
        d2 d2Var = this.f49917j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f49918k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f49919l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f49912b + ", gmpAppId=" + this.f49913c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f49914f + ", appQualitySessionId=" + this.f49915g + ", buildVersion=" + this.h + ", displayVersion=" + this.f49916i + ", session=" + this.f49917j + ", ndkPayload=" + this.f49918k + ", appExitInfo=" + this.f49919l + "}";
    }
}
