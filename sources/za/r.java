package za;
public final class r {
    public final String f49100a;
    public final int f49101b;
    public final int f49102c;
    public final boolean d;

    public r(String str, int i10, int i11, boolean z10) {
        this.f49100a = str;
        this.f49101b = i10;
        this.f49102c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f49100a, rVar.f49100a) && this.f49101b == rVar.f49101b && this.f49102c == rVar.f49102c && this.d == rVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f49100a.hashCode() * 31) + this.f49101b) * 31) + this.f49102c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f49100a + ", pid=" + this.f49101b + ", importance=" + this.f49102c + ", isDefaultProcess=" + this.d + ')';
    }
}
