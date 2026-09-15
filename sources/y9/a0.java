package y9;

import v7.d8;
public final class a0 extends e2 {
    public final String f46452b;
    public final String f46453c;
    public final int d;
    public final String e;
    public final String f46454f;
    public final String f46455g;
    public final String h;
    public final String f46456i;
    public final d2 f46457j;
    public final j1 f46458k;
    public final g1 f46459l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f46452b = str;
        this.f46453c = str2;
        this.d = i10;
        this.e = str3;
        this.f46454f = str4;
        this.f46455g = str5;
        this.h = str6;
        this.f46456i = str7;
        this.f46457j = d2Var;
        this.f46458k = j1Var;
        this.f46459l = g1Var;
    }

    public final d8 a() {
        ?? obj = new Object();
        obj.f43945a = this.f46452b;
        obj.f43946b = this.f46453c;
        obj.f43950i = Integer.valueOf(this.d);
        obj.f43947c = this.e;
        obj.d = this.f46454f;
        obj.e = this.f46455g;
        obj.f43952k = this.h;
        obj.f43948f = this.f46456i;
        obj.f43949g = this.f46457j;
        obj.h = this.f46458k;
        obj.f43951j = this.f46459l;
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
            g1 g1Var2 = a0Var.f46459l;
            j1 j1Var2 = a0Var.f46458k;
            d2 d2Var2 = a0Var.f46457j;
            String str3 = a0Var.f46455g;
            String str4 = a0Var.f46454f;
            if (this.f46452b.equals(a0Var.f46452b) && this.f46453c.equals(a0Var.f46453c) && this.d == a0Var.d && this.e.equals(a0Var.e) && ((str = this.f46454f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f46455g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f46456i.equals(a0Var.f46456i) && ((d2Var = this.f46457j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f46458k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f46459l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f46452b.hashCode() ^ 1000003) * 1000003) ^ this.f46453c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f46454f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f46455g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f46456i.hashCode()) * 1000003;
        d2 d2Var = this.f46457j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f46458k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f46459l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f46452b + ", gmpAppId=" + this.f46453c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f46454f + ", appQualitySessionId=" + this.f46455g + ", buildVersion=" + this.h + ", displayVersion=" + this.f46456i + ", session=" + this.f46457j + ", ndkPayload=" + this.f46458k + ", appExitInfo=" + this.f46459l + "}";
    }
}
