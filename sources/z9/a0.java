package z9;

import v7.d8;
public final class a0 extends e2 {
    public final String f51298b;
    public final String f51299c;
    public final int d;
    public final String e;
    public final String f51300f;
    public final String f51301g;
    public final String h;
    public final String f51302i;
    public final d2 f51303j;
    public final j1 f51304k;
    public final g1 f51305l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f51298b = str;
        this.f51299c = str2;
        this.d = i10;
        this.e = str3;
        this.f51300f = str4;
        this.f51301g = str5;
        this.h = str6;
        this.f51302i = str7;
        this.f51303j = d2Var;
        this.f51304k = j1Var;
        this.f51305l = g1Var;
    }

    public final d8 a() {
        ?? obj = new Object();
        obj.f47993a = this.f51298b;
        obj.f47994b = this.f51299c;
        obj.f47998i = Integer.valueOf(this.d);
        obj.f47995c = this.e;
        obj.d = this.f51300f;
        obj.e = this.f51301g;
        obj.f48000k = this.h;
        obj.f47996f = this.f51302i;
        obj.f47997g = this.f51303j;
        obj.h = this.f51304k;
        obj.f47999j = this.f51305l;
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
            g1 g1Var2 = a0Var.f51305l;
            j1 j1Var2 = a0Var.f51304k;
            d2 d2Var2 = a0Var.f51303j;
            String str3 = a0Var.f51301g;
            String str4 = a0Var.f51300f;
            if (this.f51298b.equals(a0Var.f51298b) && this.f51299c.equals(a0Var.f51299c) && this.d == a0Var.d && this.e.equals(a0Var.e) && ((str = this.f51300f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f51301g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f51302i.equals(a0Var.f51302i) && ((d2Var = this.f51303j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f51304k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f51305l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f51298b.hashCode() ^ 1000003) * 1000003) ^ this.f51299c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f51300f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f51301g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f51302i.hashCode()) * 1000003;
        d2 d2Var = this.f51303j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f51304k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f51305l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f51298b + ", gmpAppId=" + this.f51299c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f51300f + ", appQualitySessionId=" + this.f51301g + ", buildVersion=" + this.h + ", displayVersion=" + this.f51302i + ", session=" + this.f51303j + ", ndkPayload=" + this.f51304k + ", appExitInfo=" + this.f51305l + "}";
    }
}
