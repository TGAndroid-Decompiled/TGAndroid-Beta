package za;
public final class q {
    public final String f54503a;
    public final int f54504b;
    public final int f54505c;
    public final boolean d;

    public q(String str, int i10, int i11, boolean z10) {
        this.f54503a = str;
        this.f54504b = i10;
        this.f54505c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f54503a, qVar.f54503a) && this.f54504b == qVar.f54504b && this.f54505c == qVar.f54505c && this.d == qVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f54503a.hashCode() * 31) + this.f54504b) * 31) + this.f54505c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f54503a + ", pid=" + this.f54504b + ", importance=" + this.f54505c + ", isDefaultProcess=" + this.d + ')';
    }
}
