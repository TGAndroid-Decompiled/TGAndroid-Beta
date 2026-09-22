package y9;
public final class c0 extends f1 {
    public final String f46803a;
    public final String f46804b;
    public final String f46805c;

    public c0(String str, String str2, String str3) {
        this.f46803a = str;
        this.f46804b = str2;
        this.f46805c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f46803a.equals(c0Var.f46803a) && this.f46804b.equals(c0Var.f46804b) && this.f46805c.equals(c0Var.f46805c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46803a.hashCode() ^ 1000003) * 1000003) ^ this.f46804b.hashCode()) * 1000003) ^ this.f46805c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f46803a);
        sb2.append(", libraryName=");
        sb2.append(this.f46804b);
        sb2.append(", buildId=");
        return a4.a.s(sb2, this.f46805c, "}");
    }
}
