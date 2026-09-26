package y9;
public final class c0 extends f1 {
    public final String f46759a;
    public final String f46760b;
    public final String f46761c;

    public c0(String str, String str2, String str3) {
        this.f46759a = str;
        this.f46760b = str2;
        this.f46761c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f46759a.equals(c0Var.f46759a) && this.f46760b.equals(c0Var.f46760b) && this.f46761c.equals(c0Var.f46761c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46759a.hashCode() ^ 1000003) * 1000003) ^ this.f46760b.hashCode()) * 1000003) ^ this.f46761c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f46759a);
        sb2.append(", libraryName=");
        sb2.append(this.f46760b);
        sb2.append(", buildId=");
        return a4.a.t(sb2, this.f46761c, "}");
    }
}
