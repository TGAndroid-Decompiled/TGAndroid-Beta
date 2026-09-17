package y9;

import v7.c8;
public final class a0 extends e2 {
    public final String f49684b;
    public final String f49685c;
    public final int d;
    public final String f49686e;
    public final String f49687f;
    public final String f49688g;
    public final String h;
    public final String f49689i;
    public final d2 f49690j;
    public final j1 f49691k;
    public final g1 f49692l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f49684b = str;
        this.f49685c = str2;
        this.d = i10;
        this.f49686e = str3;
        this.f49687f = str4;
        this.f49688g = str5;
        this.h = str6;
        this.f49689i = str7;
        this.f49690j = d2Var;
        this.f49691k = j1Var;
        this.f49692l = g1Var;
    }

    public final c8 a() {
        ?? obj = new Object();
        obj.f47407a = this.f49684b;
        obj.f47408b = this.f49685c;
        obj.f47413i = Integer.valueOf(this.d);
        obj.f47409c = this.f49686e;
        obj.d = this.f49687f;
        obj.f47410e = this.f49688g;
        obj.f47415k = this.h;
        obj.f47411f = this.f49689i;
        obj.f47412g = this.f49690j;
        obj.h = this.f49691k;
        obj.f47414j = this.f49692l;
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
            g1 g1Var2 = a0Var.f49692l;
            j1 j1Var2 = a0Var.f49691k;
            d2 d2Var2 = a0Var.f49690j;
            String str3 = a0Var.f49688g;
            String str4 = a0Var.f49687f;
            if (this.f49684b.equals(a0Var.f49684b) && this.f49685c.equals(a0Var.f49685c) && this.d == a0Var.d && this.f49686e.equals(a0Var.f49686e) && ((str = this.f49687f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f49688g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f49689i.equals(a0Var.f49689i) && ((d2Var = this.f49690j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f49691k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f49692l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f49684b.hashCode() ^ 1000003) * 1000003) ^ this.f49685c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f49686e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f49687f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f49688g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f49689i.hashCode()) * 1000003;
        d2 d2Var = this.f49690j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f49691k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f49692l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f49684b + ", gmpAppId=" + this.f49685c + ", platform=" + this.d + ", installationUuid=" + this.f49686e + ", firebaseInstallationId=" + this.f49687f + ", appQualitySessionId=" + this.f49688g + ", buildVersion=" + this.h + ", displayVersion=" + this.f49689i + ", session=" + this.f49690j + ", ndkPayload=" + this.f49691k + ", appExitInfo=" + this.f49692l + "}";
    }
}
