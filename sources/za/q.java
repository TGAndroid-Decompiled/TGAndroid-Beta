package za;
public final class q {
    public final String f54323a;
    public final int f54324b;
    public final int f54325c;
    public final boolean d;

    public q(String str, int i10, int i11, boolean z10) {
        this.f54323a = str;
        this.f54324b = i10;
        this.f54325c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f54323a, qVar.f54323a) && this.f54324b == qVar.f54324b && this.f54325c == qVar.f54325c && this.d == qVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f54323a.hashCode() * 31) + this.f54324b) * 31) + this.f54325c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f54323a + ", pid=" + this.f54324b + ", importance=" + this.f54325c + ", isDefaultProcess=" + this.d + ')';
    }
}
