package y9;
public final class c0 extends f1 {
    public final String f49714a;
    public final String f49715b;
    public final String f49716c;

    public c0(String str, String str2, String str3) {
        this.f49714a = str;
        this.f49715b = str2;
        this.f49716c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f49714a.equals(c0Var.f49714a) && this.f49715b.equals(c0Var.f49715b) && this.f49716c.equals(c0Var.f49716c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f49714a.hashCode() ^ 1000003) * 1000003) ^ this.f49715b.hashCode()) * 1000003) ^ this.f49716c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f49714a);
        sb2.append(", libraryName=");
        sb2.append(this.f49715b);
        sb2.append(", buildId=");
        return a4.a.s(sb2, this.f49716c, "}");
    }
}
