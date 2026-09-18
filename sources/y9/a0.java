package y9;

import v7.d8;
public final class a0 extends e2 {
    public final String f46480b;
    public final String f46481c;
    public final int d;
    public final String e;
    public final String f46482f;
    public final String f46483g;
    public final String h;
    public final String f46484i;
    public final d2 f46485j;
    public final j1 f46486k;
    public final g1 f46487l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f46480b = str;
        this.f46481c = str2;
        this.d = i10;
        this.e = str3;
        this.f46482f = str4;
        this.f46483g = str5;
        this.h = str6;
        this.f46484i = str7;
        this.f46485j = d2Var;
        this.f46486k = j1Var;
        this.f46487l = g1Var;
    }

    public final d8 a() {
        ?? obj = new Object();
        obj.f43973a = this.f46480b;
        obj.f43974b = this.f46481c;
        obj.f43978i = Integer.valueOf(this.d);
        obj.f43975c = this.e;
        obj.d = this.f46482f;
        obj.e = this.f46483g;
        obj.f43980k = this.h;
        obj.f43976f = this.f46484i;
        obj.f43977g = this.f46485j;
        obj.h = this.f46486k;
        obj.f43979j = this.f46487l;
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
            g1 g1Var2 = a0Var.f46487l;
            j1 j1Var2 = a0Var.f46486k;
            d2 d2Var2 = a0Var.f46485j;
            String str3 = a0Var.f46483g;
            String str4 = a0Var.f46482f;
            if (this.f46480b.equals(a0Var.f46480b) && this.f46481c.equals(a0Var.f46481c) && this.d == a0Var.d && this.e.equals(a0Var.e) && ((str = this.f46482f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f46483g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f46484i.equals(a0Var.f46484i) && ((d2Var = this.f46485j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f46486k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f46487l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f46480b.hashCode() ^ 1000003) * 1000003) ^ this.f46481c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f46482f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f46483g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f46484i.hashCode()) * 1000003;
        d2 d2Var = this.f46485j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f46486k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f46487l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f46480b + ", gmpAppId=" + this.f46481c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f46482f + ", appQualitySessionId=" + this.f46483g + ", buildVersion=" + this.h + ", displayVersion=" + this.f46484i + ", session=" + this.f46485j + ", ndkPayload=" + this.f46486k + ", appExitInfo=" + this.f46487l + "}";
    }
}
