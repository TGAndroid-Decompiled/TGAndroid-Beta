package z9;
public final class c0 extends f1 {
    public final String f51795a;
    public final String f51796b;
    public final String f51797c;

    public c0(String str, String str2, String str3) {
        this.f51795a = str;
        this.f51796b = str2;
        this.f51797c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f51795a.equals(c0Var.f51795a) && this.f51796b.equals(c0Var.f51796b) && this.f51797c.equals(c0Var.f51797c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51795a.hashCode() ^ 1000003) * 1000003) ^ this.f51796b.hashCode()) * 1000003) ^ this.f51797c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f51795a);
        sb2.append(", libraryName=");
        sb2.append(this.f51796b);
        sb2.append(", buildId=");
        return a1.g.s(sb2, this.f51797c, "}");
    }
}
