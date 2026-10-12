package y9;

import v7.e8;
public final class a0 extends e2 {
    public final String f52085b;
    public final String f52086c;
    public final int d;
    public final String f52087e;
    public final String f52088f;
    public final String f52089g;
    public final String h;
    public final String f52090i;
    public final d2 f52091j;
    public final j1 f52092k;
    public final g1 f52093l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f52085b = str;
        this.f52086c = str2;
        this.d = i10;
        this.f52087e = str3;
        this.f52088f = str4;
        this.f52089g = str5;
        this.h = str6;
        this.f52090i = str7;
        this.f52091j = d2Var;
        this.f52092k = j1Var;
        this.f52093l = g1Var;
    }

    public final e8 a() {
        ?? obj = new Object();
        obj.f49395a = this.f52085b;
        obj.f49396b = this.f52086c;
        obj.f49401i = Integer.valueOf(this.d);
        obj.f49397c = this.f52087e;
        obj.d = this.f52088f;
        obj.f49398e = this.f52089g;
        obj.f49403k = this.h;
        obj.f49399f = this.f52090i;
        obj.f49400g = this.f52091j;
        obj.h = this.f52092k;
        obj.f49402j = this.f52093l;
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
            g1 g1Var2 = a0Var.f52093l;
            j1 j1Var2 = a0Var.f52092k;
            d2 d2Var2 = a0Var.f52091j;
            String str3 = a0Var.f52089g;
            String str4 = a0Var.f52088f;
            if (this.f52085b.equals(a0Var.f52085b) && this.f52086c.equals(a0Var.f52086c) && this.d == a0Var.d && this.f52087e.equals(a0Var.f52087e) && ((str = this.f52088f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f52089g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f52090i.equals(a0Var.f52090i) && ((d2Var = this.f52091j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f52092k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f52093l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f52085b.hashCode() ^ 1000003) * 1000003) ^ this.f52086c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f52087e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f52088f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f52089g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f52090i.hashCode()) * 1000003;
        d2 d2Var = this.f52091j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f52092k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f52093l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f52085b + ", gmpAppId=" + this.f52086c + ", platform=" + this.d + ", installationUuid=" + this.f52087e + ", firebaseInstallationId=" + this.f52088f + ", appQualitySessionId=" + this.f52089g + ", buildVersion=" + this.h + ", displayVersion=" + this.f52090i + ", session=" + this.f52091j + ", ndkPayload=" + this.f52092k + ", appExitInfo=" + this.f52093l + "}";
    }
}
