package y9;

import v7.e8;
public final class a0 extends e2 {
    public final String f51948b;
    public final String f51949c;
    public final int d;
    public final String f51950e;
    public final String f51951f;
    public final String f51952g;
    public final String h;
    public final String f51953i;
    public final d2 f51954j;
    public final j1 f51955k;
    public final g1 f51956l;

    public a0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, d2 d2Var, j1 j1Var, g1 g1Var) {
        this.f51948b = str;
        this.f51949c = str2;
        this.d = i10;
        this.f51950e = str3;
        this.f51951f = str4;
        this.f51952g = str5;
        this.h = str6;
        this.f51953i = str7;
        this.f51954j = d2Var;
        this.f51955k = j1Var;
        this.f51956l = g1Var;
    }

    public final e8 a() {
        ?? obj = new Object();
        obj.f49254a = this.f51948b;
        obj.f49255b = this.f51949c;
        obj.f49260i = Integer.valueOf(this.d);
        obj.f49256c = this.f51950e;
        obj.d = this.f51951f;
        obj.f49257e = this.f51952g;
        obj.f49262k = this.h;
        obj.f49258f = this.f51953i;
        obj.f49259g = this.f51954j;
        obj.h = this.f51955k;
        obj.f49261j = this.f51956l;
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
            g1 g1Var2 = a0Var.f51956l;
            j1 j1Var2 = a0Var.f51955k;
            d2 d2Var2 = a0Var.f51954j;
            String str3 = a0Var.f51952g;
            String str4 = a0Var.f51951f;
            if (this.f51948b.equals(a0Var.f51948b) && this.f51949c.equals(a0Var.f51949c) && this.d == a0Var.d && this.f51950e.equals(a0Var.f51950e) && ((str = this.f51951f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f51952g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(a0Var.h) && this.f51953i.equals(a0Var.f51953i) && ((d2Var = this.f51954j) != null ? d2Var.equals(d2Var2) : d2Var2 == null) && ((j1Var = this.f51955k) != null ? j1Var.equals(j1Var2) : j1Var2 == null) && ((g1Var = this.f51956l) != null ? g1Var.equals(g1Var2) : g1Var2 == null)) {
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
        int hashCode5 = (((((((this.f51948b.hashCode() ^ 1000003) * 1000003) ^ this.f51949c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f51950e.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f51951f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.f51952g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i11 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.f51953i.hashCode()) * 1000003;
        d2 d2Var = this.f51954j;
        if (d2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d2Var.hashCode();
        }
        int i12 = (hashCode6 ^ hashCode3) * 1000003;
        j1 j1Var = this.f51955k;
        if (j1Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = j1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        g1 g1Var = this.f51956l;
        if (g1Var != null) {
            i10 = g1Var.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f51948b + ", gmpAppId=" + this.f51949c + ", platform=" + this.d + ", installationUuid=" + this.f51950e + ", firebaseInstallationId=" + this.f51951f + ", appQualitySessionId=" + this.f51952g + ", buildVersion=" + this.h + ", displayVersion=" + this.f51953i + ", session=" + this.f51954j + ", ndkPayload=" + this.f51955k + ", appExitInfo=" + this.f51956l + "}";
    }
}
