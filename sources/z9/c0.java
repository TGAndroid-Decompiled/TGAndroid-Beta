package z9;
public final class c0 extends f1 {
    public final String f55261a;
    public final String f55262b;
    public final String f55263c;

    public c0(String str, String str2, String str3) {
        this.f55261a = str;
        this.f55262b = str2;
        this.f55263c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f55261a.equals(c0Var.f55261a) && this.f55262b.equals(c0Var.f55262b) && this.f55263c.equals(c0Var.f55263c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f55261a.hashCode() ^ 1000003) * 1000003) ^ this.f55262b.hashCode()) * 1000003) ^ this.f55263c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f55261a);
        sb2.append(", libraryName=");
        sb2.append(this.f55262b);
        sb2.append(", buildId=");
        return a1.g.r(sb2, this.f55263c, "}");
    }
}
