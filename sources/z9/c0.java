package z9;
public final class c0 extends f1 {
    public final String f51326a;
    public final String f51327b;
    public final String f51328c;

    public c0(String str, String str2, String str3) {
        this.f51326a = str;
        this.f51327b = str2;
        this.f51328c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f51326a.equals(c0Var.f51326a) && this.f51327b.equals(c0Var.f51327b) && this.f51328c.equals(c0Var.f51328c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51326a.hashCode() ^ 1000003) * 1000003) ^ this.f51327b.hashCode()) * 1000003) ^ this.f51328c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f51326a);
        sb2.append(", libraryName=");
        sb2.append(this.f51327b);
        sb2.append(", buildId=");
        return a1.g.s(sb2, this.f51328c, "}");
    }
}
