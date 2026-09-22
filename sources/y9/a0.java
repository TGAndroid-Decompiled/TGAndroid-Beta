package y9;

import v7.e8;
public final class a0 extends e2 {
    public final String f46775b;
    public final String f46776c;
    public final int d;
    public final String e;
    public final String f46777f;
    public final String f46778g;
    public final String h;
    public final String f46779i;
    public final d2 f46780j;
    public final j1 f46781k;
    public final g1 f46782l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f46775b = str;
        this.f46776c = str2;
        this.d = i10;
        this.e = str3;
        this.f46777f = str4;
        this.f46778g = str5;
        this.h = str6;
        this.f46779i = str7;
        this.f46780j = d2Var;
        this.f46781k = j1Var;
        this.f46782l = g1Var;
    }

    public final e8 a() {
        ?? obj = new Object();
        obj.f44273a = this.f46775b;
        obj.f44274b = this.f46776c;
        obj.f44278i = Integer.valueOf(this.d);
        obj.f44275c = this.e;
        obj.d = this.f46777f;
        obj.e = this.f46778g;
        obj.f44280k = this.h;
        obj.f44276f = this.f46779i;
        obj.f44277g = this.f46780j;
        obj.h = this.f46781k;
        obj.f44279j = this.f46782l;
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
            g1 g1Var2 = a0Var.f46782l;
            j1 j1Var2 = a0Var.f46781k;
            d2 d2Var2 = a0Var.f46780j;
            String str3 = a0Var.f46778g;
            String str4 = a0Var.f46777f;
            if (this.f46775b.equals(a0Var.f46775b) && this.f46776c.equals(a0Var.f46776c) && this.d == a0Var.d && this.e.equals(a0Var.e) && ((str = this.f46777f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f46778g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f46779i.equals(a0Var.f46779i) && ((d2Var = this.f46780j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f46781k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f46782l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f46775b.hashCode() ^ 1000003) * 1000003) ^ this.f46776c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f46777f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f46778g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f46779i.hashCode()) * 1000003;
        d2 d2Var = this.f46780j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f46781k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f46782l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f46775b + ", gmpAppId=" + this.f46776c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f46777f + ", appQualitySessionId=" + this.f46778g + ", buildVersion=" + this.h + ", displayVersion=" + this.f46779i + ", session=" + this.f46780j + ", ndkPayload=" + this.f46781k + ", appExitInfo=" + this.f46782l + "}";
    }
}
