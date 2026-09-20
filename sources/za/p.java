package za;
public final class p {
    public final String f49121a;
    public final int f49122b;
    public final int f49123c;
    public final boolean d;

    public p(String str, int i10, int i11, boolean z10) {
        this.f49121a = str;
        this.f49122b = i10;
        this.f49123c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (kotlin.jvm.internal.i.a(this.f49121a, pVar.f49121a) && this.f49122b == pVar.f49122b && this.f49123c == pVar.f49123c && this.d == pVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f49121a.hashCode() * 31) + this.f49122b) * 31) + this.f49123c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f49121a + ", pid=" + this.f49122b + ", importance=" + this.f49123c + ", isDefaultProcess=" + this.d + ')';
    }
}
