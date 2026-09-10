package y9;
public final class c0 extends f1 {
    public final String f46630a;
    public final String f46631b;
    public final String f46632c;

    public c0(String str, String str2, String str3) {
        this.f46630a = str;
        this.f46631b = str2;
        this.f46632c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f46630a.equals(c0Var.f46630a) && this.f46631b.equals(c0Var.f46631b) && this.f46632c.equals(c0Var.f46632c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46630a.hashCode() ^ 1000003) * 1000003) ^ this.f46631b.hashCode()) * 1000003) ^ this.f46632c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f46630a);
        sb2.append(", libraryName=");
        sb2.append(this.f46631b);
        sb2.append(", buildId=");
        return a4.a.s(sb2, this.f46632c, "}");
    }
}
