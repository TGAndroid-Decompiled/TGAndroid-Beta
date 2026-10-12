package z9;
public final class c0 extends f1 {
    public final String f49940a;
    public final String f49941b;
    public final String f49942c;

    public c0(String str, String str2, String str3) {
        this.f49940a = str;
        this.f49941b = str2;
        this.f49942c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f49940a.equals(c0Var.f49940a) && this.f49941b.equals(c0Var.f49941b) && this.f49942c.equals(c0Var.f49942c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f49940a.hashCode() ^ 1000003) * 1000003) ^ this.f49941b.hashCode()) * 1000003) ^ this.f49942c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f49940a);
        sb2.append(", libraryName=");
        sb2.append(this.f49941b);
        sb2.append(", buildId=");
        return a1.g.s(sb2, this.f49942c, "}");
    }
}
