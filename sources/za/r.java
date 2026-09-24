package za;
public final class r {
    public final String f49090a;
    public final int f49091b;
    public final int f49092c;
    public final boolean d;

    public r(String str, int i10, int i11, boolean z10) {
        this.f49090a = str;
        this.f49091b = i10;
        this.f49092c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f49090a, rVar.f49090a) && this.f49091b == rVar.f49091b && this.f49092c == rVar.f49092c && this.d == rVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f49090a.hashCode() * 31) + this.f49091b) * 31) + this.f49092c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f49090a + ", pid=" + this.f49091b + ", importance=" + this.f49092c + ", isDefaultProcess=" + this.d + ')';
    }
}
