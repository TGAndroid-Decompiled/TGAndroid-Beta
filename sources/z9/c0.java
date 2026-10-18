package z9;
public final class c0 extends f1 {
    public final String f51324a;
    public final String f51325b;
    public final String f51326c;

    public c0(String str, String str2, String str3) {
        this.f51324a = str;
        this.f51325b = str2;
        this.f51326c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f51324a.equals(c0Var.f51324a) && this.f51325b.equals(c0Var.f51325b) && this.f51326c.equals(c0Var.f51326c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51324a.hashCode() ^ 1000003) * 1000003) ^ this.f51325b.hashCode()) * 1000003) ^ this.f51326c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f51324a);
        sb2.append(", libraryName=");
        sb2.append(this.f51325b);
        sb2.append(", buildId=");
        return a1.g.s(sb2, this.f51326c, "}");
    }
}
