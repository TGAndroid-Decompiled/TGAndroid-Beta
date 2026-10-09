package za;
public final class q {
    public final String f54277a;
    public final int f54278b;
    public final int f54279c;
    public final boolean d;

    public q(String str, int i10, int i11, boolean z10) {
        this.f54277a = str;
        this.f54278b = i10;
        this.f54279c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f54277a, qVar.f54277a) && this.f54278b == qVar.f54278b && this.f54279c == qVar.f54279c && this.d == qVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f54277a.hashCode() * 31) + this.f54278b) * 31) + this.f54279c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f54277a + ", pid=" + this.f54278b + ", importance=" + this.f54279c + ", isDefaultProcess=" + this.d + ')';
    }
}
