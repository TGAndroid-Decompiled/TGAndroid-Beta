package z9;
public final class c0 extends f1 {
    public final String f51796a;
    public final String f51797b;
    public final String f51798c;

    public c0(String str, String str2, String str3) {
        this.f51796a = str;
        this.f51797b = str2;
        this.f51798c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f51796a.equals(c0Var.f51796a) && this.f51797b.equals(c0Var.f51797b) && this.f51798c.equals(c0Var.f51798c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51796a.hashCode() ^ 1000003) * 1000003) ^ this.f51797b.hashCode()) * 1000003) ^ this.f51798c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f51796a);
        sb2.append(", libraryName=");
        sb2.append(this.f51797b);
        sb2.append(", buildId=");
        return a1.g.s(sb2, this.f51798c, "}");
    }
}
