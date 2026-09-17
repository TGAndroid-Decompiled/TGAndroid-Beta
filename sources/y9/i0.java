package y9;
public final class i0 extends l1 {
    public final String f49787a;
    public final String f49788b;
    public final String f49789c;
    public final String d;
    public final String f49790e;
    public final String f49791f;

    public i0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f49787a = str;
        this.f49788b = str2;
        this.f49789c = str3;
        this.d = str4;
        this.f49790e = str5;
        this.f49791f = str6;
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
            String str5 = i0Var.f49791f;
            String str6 = i0Var.f49790e;
            String str7 = i0Var.d;
            String str8 = i0Var.f49789c;
            if (this.f49787a.equals(i0Var.f49787a) && this.f49788b.equals(i0Var.f49788b) && ((str = this.f49789c) != null ? str.equals(str8) : str8 == null) && ((str2 = this.d) != null ? str2.equals(str7) : str7 == null) && ((str3 = this.f49790e) != null ? str3.equals(str6) : str6 == null) && ((str4 = this.f49791f) != null ? str4.equals(str5) : str5 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (((this.f49787a.hashCode() ^ 1000003) * 1000003) ^ this.f49788b.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f49789c;
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
        String str3 = this.f49790e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 ^ hashCode3) * 1000003;
        String str4 = this.f49791f;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{identifier=");
        sb2.append(this.f49787a);
        sb2.append(", version=");
        sb2.append(this.f49788b);
        sb2.append(", displayVersion=");
        sb2.append(this.f49789c);
        sb2.append(", organization=null, installationUuid=");
        sb2.append(this.d);
        sb2.append(", developmentPlatform=");
        sb2.append(this.f49790e);
        sb2.append(", developmentPlatformVersion=");
        return a4.a.s(sb2, this.f49791f, "}");
    }
}
