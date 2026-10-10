package y9;

import v7.e8;
public final class a0 extends e2 {
    public final String f51905b;
    public final String f51906c;
    public final int d;
    public final String f51907e;
    public final String f51908f;
    public final String f51909g;
    public final String h;
    public final String f51910i;
    public final d2 f51911j;
    public final j1 f51912k;
    public final g1 f51913l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f51905b = str;
        this.f51906c = str2;
        this.d = i10;
        this.f51907e = str3;
        this.f51908f = str4;
        this.f51909g = str5;
        this.h = str6;
        this.f51910i = str7;
        this.f51911j = d2Var;
        this.f51912k = j1Var;
        this.f51913l = g1Var;
    }

    public final e8 a() {
        ?? obj = new Object();
        obj.f49211a = this.f51905b;
        obj.f49212b = this.f51906c;
        obj.f49217i = Integer.valueOf(this.d);
        obj.f49213c = this.f51907e;
        obj.d = this.f51908f;
        obj.f49214e = this.f51909g;
        obj.f49219k = this.h;
        obj.f49215f = this.f51910i;
        obj.f49216g = this.f51911j;
        obj.h = this.f51912k;
        obj.f49218j = this.f51913l;
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
            g1 g1Var2 = a0Var.f51913l;
            j1 j1Var2 = a0Var.f51912k;
            d2 d2Var2 = a0Var.f51911j;
            String str3 = a0Var.f51909g;
            String str4 = a0Var.f51908f;
            if (this.f51905b.equals(a0Var.f51905b) && this.f51906c.equals(a0Var.f51906c) && this.d == a0Var.d && this.f51907e.equals(a0Var.f51907e) && ((str = this.f51908f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f51909g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f51910i.equals(a0Var.f51910i) && ((d2Var = this.f51911j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f51912k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f51913l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f51905b.hashCode() ^ 1000003) * 1000003) ^ this.f51906c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f51907e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f51908f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f51909g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f51910i.hashCode()) * 1000003;
        d2 d2Var = this.f51911j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f51912k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f51913l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f51905b + ", gmpAppId=" + this.f51906c + ", platform=" + this.d + ", installationUuid=" + this.f51907e + ", firebaseInstallationId=" + this.f51908f + ", appQualitySessionId=" + this.f51909g + ", buildVersion=" + this.h + ", displayVersion=" + this.f51910i + ", session=" + this.f51911j + ", ndkPayload=" + this.f51912k + ", appExitInfo=" + this.f51913l + "}";
    }
}
