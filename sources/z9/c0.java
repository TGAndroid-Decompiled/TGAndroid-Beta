package z9;
public final class c0 extends f1 {
    public final String f55243a;
    public final String f55244b;
    public final String f55245c;

    public c0(String str, String str2, String str3) {
        this.f55243a = str;
        this.f55244b = str2;
        this.f55245c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f55243a.equals(c0Var.f55243a) && this.f55244b.equals(c0Var.f55244b) && this.f55245c.equals(c0Var.f55245c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f55243a.hashCode() ^ 1000003) * 1000003) ^ this.f55244b.hashCode()) * 1000003) ^ this.f55245c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f55243a);
        sb2.append(", libraryName=");
        sb2.append(this.f55244b);
        sb2.append(", buildId=");
        return a1.g.r(sb2, this.f55245c, "}");
    }
}
