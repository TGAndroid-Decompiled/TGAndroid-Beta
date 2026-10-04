package y9;
public final class c0 extends f1 {
    public final String f50595a;
    public final String f50596b;
    public final String f50597c;

    public c0(String str, String str2, String str3) {
        this.f50595a = str;
        this.f50596b = str2;
        this.f50597c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f50595a.equals(c0Var.f50595a) && this.f50596b.equals(c0Var.f50596b) && this.f50597c.equals(c0Var.f50597c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f50595a.hashCode() ^ 1000003) * 1000003) ^ this.f50596b.hashCode()) * 1000003) ^ this.f50597c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f50595a);
        sb2.append(", libraryName=");
        sb2.append(this.f50596b);
        sb2.append(", buildId=");
        return a4.a.s(sb2, this.f50597c, "}");
    }
}
