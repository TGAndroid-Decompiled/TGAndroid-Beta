package za;
public final class q {
    public final String f54279a;
    public final int f54280b;
    public final int f54281c;
    public final boolean d;

    public q(String str, int i10, int i11, boolean z10) {
        this.f54279a = str;
        this.f54280b = i10;
        this.f54281c = i11;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (kotlin.jvm.internal.i.a(this.f54279a, qVar.f54279a) && this.f54280b == qVar.f54280b && this.f54281c == qVar.f54281c && this.d == qVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f54279a.hashCode() * 31) + this.f54280b) * 31) + this.f54281c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f54279a + ", pid=" + this.f54280b + ", importance=" + this.f54281c + ", isDefaultProcess=" + this.d + ')';
    }
}
