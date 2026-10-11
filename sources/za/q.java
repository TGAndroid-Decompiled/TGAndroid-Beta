package za;
public final class q {
    public final String f54366a;
    public final int f54367b;
    public final int f54368c;
    public final boolean d;

    public q(String str, int i10, int i11, boolean z10) {
        this.f54366a = str;
        this.f54367b = i10;
        this.f54368c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f54366a, qVar.f54366a) && this.f54367b == qVar.f54367b && this.f54368c == qVar.f54368c && this.d == qVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f54366a.hashCode() * 31) + this.f54367b) * 31) + this.f54368c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f54366a + ", pid=" + this.f54367b + ", importance=" + this.f54368c + ", isDefaultProcess=" + this.d + ')';
    }
}
