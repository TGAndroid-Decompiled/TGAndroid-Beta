package z9;
public final class c0 extends f1 {
    public final String f49941a;
    public final String f49942b;
    public final String f49943c;

    public c0(String str, String str2, String str3) {
        this.f49941a = str;
        this.f49942b = str2;
        this.f49943c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f49941a.equals(c0Var.f49941a) && this.f49942b.equals(c0Var.f49942b) && this.f49943c.equals(c0Var.f49943c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f49941a.hashCode() ^ 1000003) * 1000003) ^ this.f49942b.hashCode()) * 1000003) ^ this.f49943c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f49941a);
        sb2.append(", libraryName=");
        sb2.append(this.f49942b);
        sb2.append(", buildId=");
        return a1.g.s(sb2, this.f49943c, "}");
    }
}
