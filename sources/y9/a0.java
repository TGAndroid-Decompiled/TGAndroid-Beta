package y9;

import v7.c8;
public final class a0 extends e2 {
    public final String f49712b;
    public final String f49713c;
    public final int d;
    public final String f49714e;
    public final String f49715f;
    public final String f49716g;
    public final String h;
    public final String f49717i;
    public final d2 f49718j;
    public final j1 f49719k;
    public final g1 f49720l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f49712b = str;
        this.f49713c = str2;
        this.d = i10;
        this.f49714e = str3;
        this.f49715f = str4;
        this.f49716g = str5;
        this.h = str6;
        this.f49717i = str7;
        this.f49718j = d2Var;
        this.f49719k = j1Var;
        this.f49720l = g1Var;
    }

    public final c8 a() {
        ?? obj = new Object();
        obj.f47434a = this.f49712b;
        obj.f47435b = this.f49713c;
        obj.f47440i = Integer.valueOf(this.d);
        obj.f47436c = this.f49714e;
        obj.d = this.f49715f;
        obj.f47437e = this.f49716g;
        obj.f47442k = this.h;
        obj.f47438f = this.f49717i;
        obj.f47439g = this.f49718j;
        obj.h = this.f49719k;
        obj.f47441j = this.f49720l;
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
            g1 g1Var2 = a0Var.f49720l;
            j1 j1Var2 = a0Var.f49719k;
            d2 d2Var2 = a0Var.f49718j;
            String str3 = a0Var.f49716g;
            String str4 = a0Var.f49715f;
            if (this.f49712b.equals(a0Var.f49712b) && this.f49713c.equals(a0Var.f49713c) && this.d == a0Var.d && this.f49714e.equals(a0Var.f49714e) && ((str = this.f49715f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f49716g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f49717i.equals(a0Var.f49717i) && ((d2Var = this.f49718j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f49719k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f49720l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f49712b.hashCode() ^ 1000003) * 1000003) ^ this.f49713c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f49714e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f49715f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f49716g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f49717i.hashCode()) * 1000003;
        d2 d2Var = this.f49718j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f49719k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f49720l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f49712b + ", gmpAppId=" + this.f49713c + ", platform=" + this.d + ", installationUuid=" + this.f49714e + ", firebaseInstallationId=" + this.f49715f + ", appQualitySessionId=" + this.f49716g + ", buildVersion=" + this.h + ", displayVersion=" + this.f49717i + ", session=" + this.f49718j + ", ndkPayload=" + this.f49719k + ", appExitInfo=" + this.f49720l + "}";
    }
}
