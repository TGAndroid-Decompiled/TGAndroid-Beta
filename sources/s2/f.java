package s2;

import a8.ma;
import j$.util.Objects;
public final class f {
    public final String f56894a;
    public final int f56895b;
    public final double f56896c;
    public final String d;

    public f(String str, double d) {
        this.f56894a = str;
        this.f56895b = 2;
        this.f56896c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.f56895b == fVar.f56895b && Double.compare(this.f56896c, fVar.f56896c) == 0 && Objects.equals(this.f56894a, fVar.f56894a) && Objects.equals(this.d, fVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f56894a, Integer.valueOf(this.f56895b), Double.valueOf(this.f56896c), this.d);
    }

    public f(int i7, String str, String str2) {
        boolean z10 = true;
        if (i7 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        ma.p(z10);
        this.f56894a = str;
        this.f56895b = i7;
        this.d = str2;
        this.f56896c = 0.0d;
    }
}
