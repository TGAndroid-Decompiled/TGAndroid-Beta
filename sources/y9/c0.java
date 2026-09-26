package y9;
public final class c0 extends f1 {
    public final String f46758a;
    public final String f46759b;
    public final String f46760c;

    public c0(String str, String str2, String str3) {
        this.f46758a = str;
        this.f46759b = str2;
        this.f46760c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f46758a.equals(c0Var.f46758a) && this.f46759b.equals(c0Var.f46759b) && this.f46760c.equals(c0Var.f46760c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46758a.hashCode() ^ 1000003) * 1000003) ^ this.f46759b.hashCode()) * 1000003) ^ this.f46760c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f46758a);
        sb2.append(", libraryName=");
        sb2.append(this.f46759b);
        sb2.append(", buildId=");
        return a4.a.t(sb2, this.f46760c, "}");
    }
}
