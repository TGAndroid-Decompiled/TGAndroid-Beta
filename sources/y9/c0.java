package y9;
public final class c0 extends f1 {
    public final String f49715a;
    public final String f49716b;
    public final String f49717c;

    public c0(String str, String str2, String str3) {
        this.f49715a = str;
        this.f49716b = str2;
        this.f49717c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f49715a.equals(c0Var.f49715a) && this.f49716b.equals(c0Var.f49716b) && this.f49717c.equals(c0Var.f49717c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f49715a.hashCode() ^ 1000003) * 1000003) ^ this.f49716b.hashCode()) * 1000003) ^ this.f49717c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f49715a);
        sb2.append(", libraryName=");
        sb2.append(this.f49716b);
        sb2.append(", buildId=");
        return a4.a.s(sb2, this.f49717c, "}");
    }
}
