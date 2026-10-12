package za;
public final class q {
    public final String f54511a;
    public final int f54512b;
    public final int f54513c;
    public final boolean d;

    public q(String str, int i10, int i11, boolean z10) {
        this.f54511a = str;
        this.f54512b = i10;
        this.f54513c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f54511a, qVar.f54511a) && this.f54512b == qVar.f54512b && this.f54513c == qVar.f54513c && this.d == qVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f54511a.hashCode() * 31) + this.f54512b) * 31) + this.f54513c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f54511a + ", pid=" + this.f54512b + ", importance=" + this.f54513c + ", isDefaultProcess=" + this.d + ')';
    }
}
