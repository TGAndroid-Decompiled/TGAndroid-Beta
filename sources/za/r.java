package za;
public final class r {
    public final String f49209a;
    public final int f49210b;
    public final int f49211c;
    public final boolean d;

    public r(String str, int i10, int i11, boolean z10) {
        this.f49209a = str;
        this.f49210b = i10;
        this.f49211c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (kotlin.jvm.internal.i.a(this.f49209a, rVar.f49209a) && this.f49210b == rVar.f49210b && this.f49211c == rVar.f49211c && this.d == rVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f49209a.hashCode() * 31) + this.f49210b) * 31) + this.f49211c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f49209a + ", pid=" + this.f49210b + ", importance=" + this.f49211c + ", isDefaultProcess=" + this.d + ')';
    }
}
