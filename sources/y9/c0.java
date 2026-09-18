package y9;
public final class c0 extends f1 {
    public final String f46735a;
    public final String f46736b;
    public final String f46737c;

    public c0(String str, String str2, String str3) {
        this.f46735a = str;
        this.f46736b = str2;
        this.f46737c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f46735a.equals(c0Var.f46735a) && this.f46736b.equals(c0Var.f46736b) && this.f46737c.equals(c0Var.f46737c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46735a.hashCode() ^ 1000003) * 1000003) ^ this.f46736b.hashCode()) * 1000003) ^ this.f46737c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f46735a);
        sb2.append(", libraryName=");
        sb2.append(this.f46736b);
        sb2.append(", buildId=");
        return a4.a.s(sb2, this.f46737c, "}");
    }
}
