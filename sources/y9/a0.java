package y9;

import v7.d8;
public final class a0 extends e2 {
    public final String f50564b;
    public final String f50565c;
    public final int d;
    public final String f50566e;
    public final String f50567f;
    public final String f50568g;
    public final String h;
    public final String f50569i;
    public final d2 f50570j;
    public final j1 f50571k;
    public final g1 f50572l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f50564b = str;
        this.f50565c = str2;
        this.d = i10;
        this.f50566e = str3;
        this.f50567f = str4;
        this.f50568g = str5;
        this.h = str6;
        this.f50569i = str7;
        this.f50570j = d2Var;
        this.f50571k = j1Var;
        this.f50572l = g1Var;
    }

    public final d8 a() {
        ?? obj = new Object();
        obj.f47891a = this.f50564b;
        obj.f47892b = this.f50565c;
        obj.f47897i = Integer.valueOf(this.d);
        obj.f47893c = this.f50566e;
        obj.d = this.f50567f;
        obj.f47894e = this.f50568g;
        obj.f47899k = this.h;
        obj.f47895f = this.f50569i;
        obj.f47896g = this.f50570j;
        obj.h = this.f50571k;
        obj.f47898j = this.f50572l;
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
            g1 g1Var2 = a0Var.f50572l;
            j1 j1Var2 = a0Var.f50571k;
            d2 d2Var2 = a0Var.f50570j;
            String str3 = a0Var.f50568g;
            String str4 = a0Var.f50567f;
            if (this.f50564b.equals(a0Var.f50564b) && this.f50565c.equals(a0Var.f50565c) && this.d == a0Var.d && this.f50566e.equals(a0Var.f50566e) && ((str = this.f50567f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f50568g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f50569i.equals(a0Var.f50569i) && ((d2Var = this.f50570j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f50571k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f50572l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f50564b.hashCode() ^ 1000003) * 1000003) ^ this.f50565c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f50566e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f50567f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f50568g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f50569i.hashCode()) * 1000003;
        d2 d2Var = this.f50570j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f50571k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f50572l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f50564b + ", gmpAppId=" + this.f50565c + ", platform=" + this.d + ", installationUuid=" + this.f50566e + ", firebaseInstallationId=" + this.f50567f + ", appQualitySessionId=" + this.f50568g + ", buildVersion=" + this.h + ", displayVersion=" + this.f50569i + ", session=" + this.f50570j + ", ndkPayload=" + this.f50571k + ", appExitInfo=" + this.f50572l + "}";
    }
}
