package y9;

import v7.d8;
public final class a0 extends e2 {
    public final String f46448b;
    public final String f46449c;
    public final int d;
    public final String e;
    public final String f46450f;
    public final String f46451g;
    public final String h;
    public final String f46452i;
    public final d2 f46453j;
    public final j1 f46454k;
    public final g1 f46455l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f46448b = str;
        this.f46449c = str2;
        this.d = i10;
        this.e = str3;
        this.f46450f = str4;
        this.f46451g = str5;
        this.h = str6;
        this.f46452i = str7;
        this.f46453j = d2Var;
        this.f46454k = j1Var;
        this.f46455l = g1Var;
    }

    public final d8 a() {
        ?? obj = new Object();
        obj.f43941a = this.f46448b;
        obj.f43942b = this.f46449c;
        obj.f43946i = Integer.valueOf(this.d);
        obj.f43943c = this.e;
        obj.d = this.f46450f;
        obj.e = this.f46451g;
        obj.f43948k = this.h;
        obj.f43944f = this.f46452i;
        obj.f43945g = this.f46453j;
        obj.h = this.f46454k;
        obj.f43947j = this.f46455l;
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
            g1 g1Var2 = a0Var.f46455l;
            j1 j1Var2 = a0Var.f46454k;
            d2 d2Var2 = a0Var.f46453j;
            String str3 = a0Var.f46451g;
            String str4 = a0Var.f46450f;
            if (this.f46448b.equals(a0Var.f46448b) && this.f46449c.equals(a0Var.f46449c) && this.d == a0Var.d && this.e.equals(a0Var.e) && ((str = this.f46450f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f46451g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f46452i.equals(a0Var.f46452i) && ((d2Var = this.f46453j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f46454k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f46455l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f46448b.hashCode() ^ 1000003) * 1000003) ^ this.f46449c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f46450f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f46451g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f46452i.hashCode()) * 1000003;
        d2 d2Var = this.f46453j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f46454k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f46455l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f46448b + ", gmpAppId=" + this.f46449c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f46450f + ", appQualitySessionId=" + this.f46451g + ", buildVersion=" + this.h + ", displayVersion=" + this.f46452i + ", session=" + this.f46453j + ", ndkPayload=" + this.f46454k + ", appExitInfo=" + this.f46455l + "}";
    }
}
