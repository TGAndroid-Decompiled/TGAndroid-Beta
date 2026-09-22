package y9;
public final class c0 extends f1 {
    public final String f46476a;
    public final String f46477b;
    public final String f46478c;

    public c0(String str, String str2, String str3) {
        this.f46476a = str;
        this.f46477b = str2;
        this.f46478c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f46476a.equals(c0Var.f46476a) && this.f46477b.equals(c0Var.f46477b) && this.f46478c.equals(c0Var.f46478c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46476a.hashCode() ^ 1000003) * 1000003) ^ this.f46477b.hashCode()) * 1000003) ^ this.f46478c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f46476a);
        sb2.append(", libraryName=");
        sb2.append(this.f46477b);
        sb2.append(", buildId=");
        return a4.a.t(sb2, this.f46478c, "}");
    }
}
