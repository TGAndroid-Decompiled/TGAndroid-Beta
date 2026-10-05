package y9;
public final class i0 extends l1 {
    public final String f50683a;
    public final String f50684b;
    public final String f50685c;
    public final String d;
    public final String f50686e;
    public final String f50687f;

    public i0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f50683a = str;
        this.f50684b = str2;
        this.f50685c = str3;
        this.d = str4;
        this.f50686e = str5;
        this.f50687f = str6;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof l1) {
            i0 i0Var = (i0) ((l1) obj);
            String str5 = i0Var.f50687f;
            String str6 = i0Var.f50686e;
            String str7 = i0Var.d;
            String str8 = i0Var.f50685c;
            if (this.f50683a.equals(i0Var.f50683a) && this.f50684b.equals(i0Var.f50684b) && ((str = this.f50685c) != null ? str.equals(str8) : str8 == null) && ((str2 = this.d) != null ? str2.equals(str7) : str7 == null) && ((str3 = this.f50686e) != null ? str3.equals(str6) : str6 == null) && ((str4 = this.f50687f) != null ? str4.equals(str5) : str5 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (((this.f50683a.hashCode() ^ 1000003) * 1000003) ^ this.f50684b.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f50685c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 ^ hashCode) * (-721379959);
        String str2 = this.d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        String str3 = this.f50686e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 ^ hashCode3) * 1000003;
        String str4 = this.f50687f;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{identifier=");
        sb2.append(this.f50683a);
        sb2.append(", version=");
        sb2.append(this.f50684b);
        sb2.append(", displayVersion=");
        sb2.append(this.f50685c);
        sb2.append(", organization=null, installationUuid=");
        sb2.append(this.d);
        sb2.append(", developmentPlatform=");
        sb2.append(this.f50686e);
        sb2.append(", developmentPlatformVersion=");
        return a4.a.t(sb2, this.f50687f, "}");
    }
}
