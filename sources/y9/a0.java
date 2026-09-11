package y9;

import v7.c8;
public final class a0 extends e2 {
    public final String f49683b;
    public final String f49684c;
    public final int d;
    public final String f49685e;
    public final String f49686f;
    public final String f49687g;
    public final String h;
    public final String f49688i;
    public final d2 f49689j;
    public final j1 f49690k;
    public final g1 f49691l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f49683b = str;
        this.f49684c = str2;
        this.d = i10;
        this.f49685e = str3;
        this.f49686f = str4;
        this.f49687g = str5;
        this.h = str6;
        this.f49688i = str7;
        this.f49689j = d2Var;
        this.f49690k = j1Var;
        this.f49691l = g1Var;
    }

    public final c8 a() {
        ?? obj = new Object();
        obj.f47406a = this.f49683b;
        obj.f47407b = this.f49684c;
        obj.f47412i = Integer.valueOf(this.d);
        obj.f47408c = this.f49685e;
        obj.d = this.f49686f;
        obj.f47409e = this.f49687g;
        obj.f47414k = this.h;
        obj.f47410f = this.f49688i;
        obj.f47411g = this.f49689j;
        obj.h = this.f49690k;
        obj.f47413j = this.f49691l;
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
            g1 g1Var2 = a0Var.f49691l;
            j1 j1Var2 = a0Var.f49690k;
            d2 d2Var2 = a0Var.f49689j;
            String str3 = a0Var.f49687g;
            String str4 = a0Var.f49686f;
            if (this.f49683b.equals(a0Var.f49683b) && this.f49684c.equals(a0Var.f49684c) && this.d == a0Var.d && this.f49685e.equals(a0Var.f49685e) && ((str = this.f49686f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f49687g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f49688i.equals(a0Var.f49688i) && ((d2Var = this.f49689j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f49690k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f49691l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f49683b.hashCode() ^ 1000003) * 1000003) ^ this.f49684c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f49685e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f49686f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f49687g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f49688i.hashCode()) * 1000003;
        d2 d2Var = this.f49689j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f49690k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f49691l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f49683b + ", gmpAppId=" + this.f49684c + ", platform=" + this.d + ", installationUuid=" + this.f49685e + ", firebaseInstallationId=" + this.f49686f + ", appQualitySessionId=" + this.f49687g + ", buildVersion=" + this.h + ", displayVersion=" + this.f49688i + ", session=" + this.f49689j + ", ndkPayload=" + this.f49690k + ", appExitInfo=" + this.f49691l + "}";
    }
}
