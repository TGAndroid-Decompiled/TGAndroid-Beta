package y9;
public final class c0 extends f1 {
    public final String f51892a;
    public final String f51893b;
    public final String f51894c;

    public c0(String str, String str2, String str3) {
        this.f51892a = str;
        this.f51893b = str2;
        this.f51894c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f51892a.equals(c0Var.f51892a) && this.f51893b.equals(c0Var.f51893b) && this.f51894c.equals(c0Var.f51894c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f51892a.hashCode() ^ 1000003) * 1000003) ^ this.f51893b.hashCode()) * 1000003) ^ this.f51894c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f51892a);
        sb2.append(", libraryName=");
        sb2.append(this.f51893b);
        sb2.append(", buildId=");
        return a1.g.t(sb2, this.f51894c, "}");
    }
}
