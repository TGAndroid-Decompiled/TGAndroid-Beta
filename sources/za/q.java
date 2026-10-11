package za;
public final class q {
    public final String f54400a;
    public final int f54401b;
    public final int f54402c;
    public final boolean d;

    public q(String str, int i10, int i11, boolean z10) {
        this.f54400a = str;
        this.f54401b = i10;
        this.f54402c = i11;
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
        if (kotlin.jvm.internal.i.a(this.f54400a, qVar.f54400a) && this.f54401b == qVar.f54401b && this.f54402c == qVar.f54402c && this.d == qVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.f54400a.hashCode() * 31) + this.f54401b) * 31) + this.f54402c) * 31;
        boolean z10 = this.d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f54400a + ", pid=" + this.f54401b + ", importance=" + this.f54402c + ", isDefaultProcess=" + this.d + ')';
    }
}
