package y9;

import v7.e8;
public final class a0 extends e2 {
    public final String f46754b;
    public final String f46755c;
    public final int d;
    public final String e;
    public final String f46756f;
    public final String f46757g;
    public final String h;
    public final String f46758i;
    public final d2 f46759j;
    public final j1 f46760k;
    public final g1 f46761l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f46754b = str;
        this.f46755c = str2;
        this.d = i10;
        this.e = str3;
        this.f46756f = str4;
        this.f46757g = str5;
        this.h = str6;
        this.f46758i = str7;
        this.f46759j = d2Var;
        this.f46760k = j1Var;
        this.f46761l = g1Var;
    }

    public final e8 a() {
        ?? obj = new Object();
        obj.f44251a = this.f46754b;
        obj.f44252b = this.f46755c;
        obj.f44256i = Integer.valueOf(this.d);
        obj.f44253c = this.e;
        obj.d = this.f46756f;
        obj.e = this.f46757g;
        obj.f44258k = this.h;
        obj.f44254f = this.f46758i;
        obj.f44255g = this.f46759j;
        obj.h = this.f46760k;
        obj.f44257j = this.f46761l;
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
            g1 g1Var2 = a0Var.f46761l;
            j1 j1Var2 = a0Var.f46760k;
            d2 d2Var2 = a0Var.f46759j;
            String str3 = a0Var.f46757g;
            String str4 = a0Var.f46756f;
            if (this.f46754b.equals(a0Var.f46754b) && this.f46755c.equals(a0Var.f46755c) && this.d == a0Var.d && this.e.equals(a0Var.e) && ((str = this.f46756f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f46757g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f46758i.equals(a0Var.f46758i) && ((d2Var = this.f46759j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f46760k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f46761l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f46754b.hashCode() ^ 1000003) * 1000003) ^ this.f46755c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f46756f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f46757g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f46758i.hashCode()) * 1000003;
        d2 d2Var = this.f46759j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f46760k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f46761l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f46754b + ", gmpAppId=" + this.f46755c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f46756f + ", appQualitySessionId=" + this.f46757g + ", buildVersion=" + this.h + ", displayVersion=" + this.f46758i + ", session=" + this.f46759j + ", ndkPayload=" + this.f46760k + ", appExitInfo=" + this.f46761l + "}";
    }
}
