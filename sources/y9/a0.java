package y9;

import v7.e8;
public final class a0 extends e2 {
    public final String f46776b;
    public final String f46777c;
    public final int d;
    public final String e;
    public final String f46778f;
    public final String f46779g;
    public final String h;
    public final String f46780i;
    public final d2 f46781j;
    public final j1 f46782k;
    public final g1 f46783l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f46776b = str;
        this.f46777c = str2;
        this.d = i10;
        this.e = str3;
        this.f46778f = str4;
        this.f46779g = str5;
        this.h = str6;
        this.f46780i = str7;
        this.f46781j = d2Var;
        this.f46782k = j1Var;
        this.f46783l = g1Var;
    }

    public final e8 a() {
        ?? obj = new Object();
        obj.f44281a = this.f46776b;
        obj.f44282b = this.f46777c;
        obj.f44286i = Integer.valueOf(this.d);
        obj.f44283c = this.e;
        obj.d = this.f46778f;
        obj.e = this.f46779g;
        obj.f44288k = this.h;
        obj.f44284f = this.f46780i;
        obj.f44285g = this.f46781j;
        obj.h = this.f46782k;
        obj.f44287j = this.f46783l;
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
            g1 g1Var2 = a0Var.f46783l;
            j1 j1Var2 = a0Var.f46782k;
            d2 d2Var2 = a0Var.f46781j;
            String str3 = a0Var.f46779g;
            String str4 = a0Var.f46778f;
            if (this.f46776b.equals(a0Var.f46776b) && this.f46777c.equals(a0Var.f46777c) && this.d == a0Var.d && this.e.equals(a0Var.e) && ((str = this.f46778f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f46779g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f46780i.equals(a0Var.f46780i) && ((d2Var = this.f46781j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f46782k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f46783l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f46776b.hashCode() ^ 1000003) * 1000003) ^ this.f46777c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f46778f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f46779g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f46780i.hashCode()) * 1000003;
        d2 d2Var = this.f46781j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f46782k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f46783l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f46776b + ", gmpAppId=" + this.f46777c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f46778f + ", appQualitySessionId=" + this.f46779g + ", buildVersion=" + this.h + ", displayVersion=" + this.f46780i + ", session=" + this.f46781j + ", ndkPayload=" + this.f46782k + ", appExitInfo=" + this.f46783l + "}";
    }
}
