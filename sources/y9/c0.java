package y9;
public final class c0 extends f1 {
    public final String f50611a;
    public final String f50612b;
    public final String f50613c;

    public c0(String str, String str2, String str3) {
        this.f50611a = str;
        this.f50612b = str2;
        this.f50613c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f50611a.equals(c0Var.f50611a) && this.f50612b.equals(c0Var.f50612b) && this.f50613c.equals(c0Var.f50613c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f50611a.hashCode() ^ 1000003) * 1000003) ^ this.f50612b.hashCode()) * 1000003) ^ this.f50613c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f50611a);
        sb2.append(", libraryName=");
        sb2.append(this.f50612b);
        sb2.append(", buildId=");
        return a4.a.t(sb2, this.f50613c, "}");
    }
}
