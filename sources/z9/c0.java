package z9;
public final class c0 extends f1 {
    public final String f51371a;
    public final String f51372b;
    public final String f51373c;

    public c0(String str, String str2, String str3) {
        this.f51371a = str;
        this.f51372b = str2;
        this.f51373c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f51371a.equals(c0Var.f51371a) && this.f51372b.equals(c0Var.f51372b) && this.f51373c.equals(c0Var.f51373c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51371a.hashCode() ^ 1000003) * 1000003) ^ this.f51372b.hashCode()) * 1000003) ^ this.f51373c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f51371a);
        sb2.append(", libraryName=");
        sb2.append(this.f51372b);
        sb2.append(", buildId=");
        return a1.g.s(sb2, this.f51373c, "}");
    }
}
