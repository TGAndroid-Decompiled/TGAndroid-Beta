package y9;
public final class c0 extends f1 {
    public final String f49743a;
    public final String f49744b;
    public final String f49745c;

    public c0(String str, String str2, String str3) {
        this.f49743a = str;
        this.f49744b = str2;
        this.f49745c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f49743a.equals(c0Var.f49743a) && this.f49744b.equals(c0Var.f49744b) && this.f49745c.equals(c0Var.f49745c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f49743a.hashCode() ^ 1000003) * 1000003) ^ this.f49744b.hashCode()) * 1000003) ^ this.f49745c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f49743a);
        sb2.append(", libraryName=");
        sb2.append(this.f49744b);
        sb2.append(", buildId=");
        return a4.a.s(sb2, this.f49745c, "}");
    }
}
