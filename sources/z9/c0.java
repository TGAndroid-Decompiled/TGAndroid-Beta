package z9;
public final class c0 extends f1 {
    public final String f51335a;
    public final String f51336b;
    public final String f51337c;

    public c0(String str, String str2, String str3) {
        this.f51335a = str;
        this.f51336b = str2;
        this.f51337c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f51335a.equals(c0Var.f51335a) && this.f51336b.equals(c0Var.f51336b) && this.f51337c.equals(c0Var.f51337c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51335a.hashCode() ^ 1000003) * 1000003) ^ this.f51336b.hashCode()) * 1000003) ^ this.f51337c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f51335a);
        sb2.append(", libraryName=");
        sb2.append(this.f51336b);
        sb2.append(", buildId=");
        return a1.g.s(sb2, this.f51337c, "}");
    }
}
