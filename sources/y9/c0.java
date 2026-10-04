package y9;
public final class c0 extends f1 {
    public final String f50596a;
    public final String f50597b;
    public final String f50598c;

    public c0(String str, String str2, String str3) {
        this.f50596a = str;
        this.f50597b = str2;
        this.f50598c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f50596a.equals(c0Var.f50596a) && this.f50597b.equals(c0Var.f50597b) && this.f50598c.equals(c0Var.f50598c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f50596a.hashCode() ^ 1000003) * 1000003) ^ this.f50597b.hashCode()) * 1000003) ^ this.f50598c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f50596a);
        sb2.append(", libraryName=");
        sb2.append(this.f50597b);
        sb2.append(", buildId=");
        return a4.a.s(sb2, this.f50598c, "}");
    }
}
