package y9;

import v7.c8;
public final class a0 extends e2 {
    public final String f49713b;
    public final String f49714c;
    public final int d;
    public final String f49715e;
    public final String f49716f;
    public final String f49717g;
    public final String h;
    public final String f49718i;
    public final d2 f49719j;
    public final j1 f49720k;
    public final g1 f49721l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f49713b = str;
        this.f49714c = str2;
        this.d = i10;
        this.f49715e = str3;
        this.f49716f = str4;
        this.f49717g = str5;
        this.h = str6;
        this.f49718i = str7;
        this.f49719j = d2Var;
        this.f49720k = j1Var;
        this.f49721l = g1Var;
    }

    public final c8 a() {
        ?? obj = new Object();
        obj.f47435a = this.f49713b;
        obj.f47436b = this.f49714c;
        obj.f47441i = Integer.valueOf(this.d);
        obj.f47437c = this.f49715e;
        obj.d = this.f49716f;
        obj.f47438e = this.f49717g;
        obj.f47443k = this.h;
        obj.f47439f = this.f49718i;
        obj.f47440g = this.f49719j;
        obj.h = this.f49720k;
        obj.f47442j = this.f49721l;
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
            g1 g1Var2 = a0Var.f49721l;
            j1 j1Var2 = a0Var.f49720k;
            d2 d2Var2 = a0Var.f49719j;
            String str3 = a0Var.f49717g;
            String str4 = a0Var.f49716f;
            if (this.f49713b.equals(a0Var.f49713b) && this.f49714c.equals(a0Var.f49714c) && this.d == a0Var.d && this.f49715e.equals(a0Var.f49715e) && ((str = this.f49716f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f49717g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f49718i.equals(a0Var.f49718i) && ((d2Var = this.f49719j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f49720k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f49721l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f49713b.hashCode() ^ 1000003) * 1000003) ^ this.f49714c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f49715e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f49716f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f49717g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f49718i.hashCode()) * 1000003;
        d2 d2Var = this.f49719j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f49720k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f49721l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f49713b + ", gmpAppId=" + this.f49714c + ", platform=" + this.d + ", installationUuid=" + this.f49715e + ", firebaseInstallationId=" + this.f49716f + ", appQualitySessionId=" + this.f49717g + ", buildVersion=" + this.h + ", displayVersion=" + this.f49718i + ", session=" + this.f49719j + ", ndkPayload=" + this.f49720k + ", appExitInfo=" + this.f49721l + "}";
    }
}
