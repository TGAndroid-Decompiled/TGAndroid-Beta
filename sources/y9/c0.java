package y9;
public final class c0 extends f1 {
    public final String f46503a;
    public final String f46504b;
    public final String f46505c;

    public c0(String str, String str2, String str3) {
        this.f46503a = str;
        this.f46504b = str2;
        this.f46505c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f46503a.equals(c0Var.f46503a) && this.f46504b.equals(c0Var.f46504b) && this.f46505c.equals(c0Var.f46505c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46503a.hashCode() ^ 1000003) * 1000003) ^ this.f46504b.hashCode()) * 1000003) ^ this.f46505c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f46503a);
        sb2.append(", libraryName=");
        sb2.append(this.f46504b);
        sb2.append(", buildId=");
        return a4.a.s(sb2, this.f46505c, "}");
    }
}
