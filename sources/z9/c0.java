package z9;
public final class c0 extends f1 {
    public final String f51331a;
    public final String f51332b;
    public final String f51333c;

    public c0(String str, String str2, String str3) {
        this.f51331a = str;
        this.f51332b = str2;
        this.f51333c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f51331a.equals(c0Var.f51331a) && this.f51332b.equals(c0Var.f51332b) && this.f51333c.equals(c0Var.f51333c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51331a.hashCode() ^ 1000003) * 1000003) ^ this.f51332b.hashCode()) * 1000003) ^ this.f51333c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f51331a);
        sb2.append(", libraryName=");
        sb2.append(this.f51332b);
        sb2.append(", buildId=");
        return a1.g.s(sb2, this.f51333c, "}");
    }
}
