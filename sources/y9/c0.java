package y9;
public final class c0 extends f1 {
    public final String f46804a;
    public final String f46805b;
    public final String f46806c;

    public c0(String str, String str2, String str3) {
        this.f46804a = str;
        this.f46805b = str2;
        this.f46806c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f46804a.equals(c0Var.f46804a) && this.f46805b.equals(c0Var.f46805b) && this.f46806c.equals(c0Var.f46806c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46804a.hashCode() ^ 1000003) * 1000003) ^ this.f46805b.hashCode()) * 1000003) ^ this.f46806c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f46804a);
        sb2.append(", libraryName=");
        sb2.append(this.f46805b);
        sb2.append(", buildId=");
        return a4.a.s(sb2, this.f46806c, "}");
    }
}
