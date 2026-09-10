package y9;

import v7.d8;
public final class a0 extends e2 {
    public final String f46602b;
    public final String f46603c;
    public final int d;
    public final String e;
    public final String f46604f;
    public final String f46605g;
    public final String h;
    public final String f46606i;
    public final d2 f46607j;
    public final j1 f46608k;
    public final g1 f46609l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f46602b = str;
        this.f46603c = str2;
        this.d = i10;
        this.e = str3;
        this.f46604f = str4;
        this.f46605g = str5;
        this.h = str6;
        this.f46606i = str7;
        this.f46607j = d2Var;
        this.f46608k = j1Var;
        this.f46609l = g1Var;
    }

    public final d8 a() {
        ?? obj = new Object();
        obj.f42967a = this.f46602b;
        obj.f42968b = this.f46603c;
        obj.f42972i = Integer.valueOf(this.d);
        obj.f42969c = this.e;
        obj.d = this.f46604f;
        obj.e = this.f46605g;
        obj.f42974k = this.h;
        obj.f42970f = this.f46606i;
        obj.f42971g = this.f46607j;
        obj.h = this.f46608k;
        obj.f42973j = this.f46609l;
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
            g1 g1Var2 = a0Var.f46609l;
            j1 j1Var2 = a0Var.f46608k;
            d2 d2Var2 = a0Var.f46607j;
            String str3 = a0Var.f46605g;
            String str4 = a0Var.f46604f;
            if (this.f46602b.equals(a0Var.f46602b) && this.f46603c.equals(a0Var.f46603c) && this.d == a0Var.d && this.e.equals(a0Var.e) && ((str = this.f46604f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f46605g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f46606i.equals(a0Var.f46606i) && ((d2Var = this.f46607j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f46608k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f46609l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f46602b.hashCode() ^ 1000003) * 1000003) ^ this.f46603c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f46604f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f46605g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f46606i.hashCode()) * 1000003;
        d2 d2Var = this.f46607j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f46608k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f46609l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f46602b + ", gmpAppId=" + this.f46603c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f46604f + ", appQualitySessionId=" + this.f46605g + ", buildVersion=" + this.h + ", displayVersion=" + this.f46606i + ", session=" + this.f46607j + ", ndkPayload=" + this.f46608k + ", appExitInfo=" + this.f46609l + "}";
    }
}
