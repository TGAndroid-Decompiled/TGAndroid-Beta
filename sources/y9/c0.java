package y9;
public final class c0 extends f1 {
    public final String f46748a;
    public final String f46749b;
    public final String f46750c;

    public c0(String str, String str2, String str3) {
        this.f46748a = str;
        this.f46749b = str2;
        this.f46750c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f46748a.equals(c0Var.f46748a) && this.f46749b.equals(c0Var.f46749b) && this.f46750c.equals(c0Var.f46750c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46748a.hashCode() ^ 1000003) * 1000003) ^ this.f46749b.hashCode()) * 1000003) ^ this.f46750c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f46748a);
        sb2.append(", libraryName=");
        sb2.append(this.f46749b);
        sb2.append(", buildId=");
        return a4.a.t(sb2, this.f46750c, "}");
    }
}
