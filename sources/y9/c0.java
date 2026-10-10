package y9;
public final class c0 extends f1 {
    public final String f51936a;
    public final String f51937b;
    public final String f51938c;

    public c0(String str, String str2, String str3) {
        this.f51936a = str;
        this.f51937b = str2;
        this.f51938c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f51936a.equals(c0Var.f51936a) && this.f51937b.equals(c0Var.f51937b) && this.f51938c.equals(c0Var.f51938c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51936a.hashCode() ^ 1000003) * 1000003) ^ this.f51937b.hashCode()) * 1000003) ^ this.f51938c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f51936a);
        sb2.append(", libraryName=");
        sb2.append(this.f51937b);
        sb2.append(", buildId=");
        return a1.g.t(sb2, this.f51938c, "}");
    }
}
