package za;
public final class r {
    public final String f48772a;
    public final int f48773b;
    public final int f48774c;
    public final boolean d;

    public r(String str, int i10, int i11, boolean z10) {
        this.f48772a = str;
        this.f48773b = i10;
        this.f48774c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f48772a, rVar.f48772a) && this.f48773b == rVar.f48773b && this.f48774c == rVar.f48774c && this.d == rVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f48772a.hashCode() * 31) + this.f48773b) * 31) + this.f48774c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f48772a + ", pid=" + this.f48773b + ", importance=" + this.f48774c + ", isDefaultProcess=" + this.d + ')';
    }
}
