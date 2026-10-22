package z9;

import v7.d8;
public final class a0 extends e2 {
    public final String f51306b;
    public final String f51307c;
    public final int d;
    public final String e;
    public final String f51308f;
    public final String f51309g;
    public final String h;
    public final String f51310i;
    public final d2 f51311j;
    public final j1 f51312k;
    public final g1 f51313l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f51306b = str;
        this.f51307c = str2;
        this.d = i10;
        this.e = str3;
        this.f51308f = str4;
        this.f51309g = str5;
        this.h = str6;
        this.f51310i = str7;
        this.f51311j = d2Var;
        this.f51312k = j1Var;
        this.f51313l = g1Var;
    }

    public final d8 a() {
        ?? obj = new Object();
        obj.f48001a = this.f51306b;
        obj.f48002b = this.f51307c;
        obj.f48006i = Integer.valueOf(this.d);
        obj.f48003c = this.e;
        obj.d = this.f51308f;
        obj.e = this.f51309g;
        obj.f48008k = this.h;
        obj.f48004f = this.f51310i;
        obj.f48005g = this.f51311j;
        obj.h = this.f51312k;
        obj.f48007j = this.f51313l;
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
            g1 g1Var2 = a0Var.f51313l;
            j1 j1Var2 = a0Var.f51312k;
            d2 d2Var2 = a0Var.f51311j;
            String str3 = a0Var.f51309g;
            String str4 = a0Var.f51308f;
            if (this.f51306b.equals(a0Var.f51306b) && this.f51307c.equals(a0Var.f51307c) && this.d == a0Var.d && this.e.equals(a0Var.e) && ((str = this.f51308f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f51309g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f51310i.equals(a0Var.f51310i) && ((d2Var = this.f51311j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f51312k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f51313l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f51306b.hashCode() ^ 1000003) * 1000003) ^ this.f51307c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f51308f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f51309g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f51310i.hashCode()) * 1000003;
        d2 d2Var = this.f51311j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f51312k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f51313l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f51306b + ", gmpAppId=" + this.f51307c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f51308f + ", appQualitySessionId=" + this.f51309g + ", buildVersion=" + this.h + ", displayVersion=" + this.f51310i + ", session=" + this.f51311j + ", ndkPayload=" + this.f51312k + ", appExitInfo=" + this.f51313l + "}";
    }
}
