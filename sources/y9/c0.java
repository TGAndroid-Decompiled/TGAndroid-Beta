package y9;
public final class c0 extends f1 {
    public final String f49744a;
    public final String f49745b;
    public final String f49746c;

    public c0(String str, String str2, String str3) {
        this.f49744a = str;
        this.f49745b = str2;
        this.f49746c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f49744a.equals(c0Var.f49744a) && this.f49745b.equals(c0Var.f49745b) && this.f49746c.equals(c0Var.f49746c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f49744a.hashCode() ^ 1000003) * 1000003) ^ this.f49745b.hashCode()) * 1000003) ^ this.f49746c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f49744a);
        sb2.append(", libraryName=");
        sb2.append(this.f49745b);
        sb2.append(", buildId=");
        return a4.a.s(sb2, this.f49746c, "}");
    }
}
