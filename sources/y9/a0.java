package y9;

import v7.d8;
public final class a0 extends e2 {
    public final String f50565b;
    public final String f50566c;
    public final int d;
    public final String f50567e;
    public final String f50568f;
    public final String f50569g;
    public final String h;
    public final String f50570i;
    public final d2 f50571j;
    public final j1 f50572k;
    public final g1 f50573l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f50565b = str;
        this.f50566c = str2;
        this.d = i10;
        this.f50567e = str3;
        this.f50568f = str4;
        this.f50569g = str5;
        this.h = str6;
        this.f50570i = str7;
        this.f50571j = d2Var;
        this.f50572k = j1Var;
        this.f50573l = g1Var;
    }

    public final d8 a() {
        ?? obj = new Object();
        obj.f47892a = this.f50565b;
        obj.f47893b = this.f50566c;
        obj.f47898i = Integer.valueOf(this.d);
        obj.f47894c = this.f50567e;
        obj.d = this.f50568f;
        obj.f47895e = this.f50569g;
        obj.f47900k = this.h;
        obj.f47896f = this.f50570i;
        obj.f47897g = this.f50571j;
        obj.h = this.f50572k;
        obj.f47899j = this.f50573l;
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
            g1 g1Var2 = a0Var.f50573l;
            j1 j1Var2 = a0Var.f50572k;
            d2 d2Var2 = a0Var.f50571j;
            String str3 = a0Var.f50569g;
            String str4 = a0Var.f50568f;
            if (this.f50565b.equals(a0Var.f50565b) && this.f50566c.equals(a0Var.f50566c) && this.d == a0Var.d && this.f50567e.equals(a0Var.f50567e) && ((str = this.f50568f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f50569g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f50570i.equals(a0Var.f50570i) && ((d2Var = this.f50571j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f50572k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f50573l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f50565b.hashCode() ^ 1000003) * 1000003) ^ this.f50566c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f50567e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f50568f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f50569g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f50570i.hashCode()) * 1000003;
        d2 d2Var = this.f50571j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f50572k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f50573l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f50565b + ", gmpAppId=" + this.f50566c + ", platform=" + this.d + ", installationUuid=" + this.f50567e + ", firebaseInstallationId=" + this.f50568f + ", appQualitySessionId=" + this.f50569g + ", buildVersion=" + this.h + ", displayVersion=" + this.f50570i + ", session=" + this.f50571j + ", ndkPayload=" + this.f50572k + ", appExitInfo=" + this.f50573l + "}";
    }
}
