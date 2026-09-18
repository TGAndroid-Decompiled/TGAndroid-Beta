package y9;
public final class c0 extends f1 {
    public final String f46508a;
    public final String f46509b;
    public final String f46510c;

    public c0(String str, String str2, String str3) {
        this.f46508a = str;
        this.f46509b = str2;
        this.f46510c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f46508a.equals(c0Var.f46508a) && this.f46509b.equals(c0Var.f46509b) && this.f46510c.equals(c0Var.f46510c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46508a.hashCode() ^ 1000003) * 1000003) ^ this.f46509b.hashCode()) * 1000003) ^ this.f46510c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f46508a);
        sb2.append(", libraryName=");
        sb2.append(this.f46509b);
        sb2.append(", buildId=");
        return a4.a.s(sb2, this.f46510c, "}");
    }
}
