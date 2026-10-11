package y9;
public final class c0 extends f1 {
    public final String f52013a;
    public final String f52014b;
    public final String f52015c;

    public c0(String str, String str2, String str3) {
        this.f52013a = str;
        this.f52014b = str2;
        this.f52015c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f52013a.equals(c0Var.f52013a) && this.f52014b.equals(c0Var.f52014b) && this.f52015c.equals(c0Var.f52015c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f52013a.hashCode() ^ 1000003) * 1000003) ^ this.f52014b.hashCode()) * 1000003) ^ this.f52015c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f52013a);
        sb2.append(", libraryName=");
        sb2.append(this.f52014b);
        sb2.append(", buildId=");
        return a1.g.t(sb2, this.f52015c, "}");
    }
}
