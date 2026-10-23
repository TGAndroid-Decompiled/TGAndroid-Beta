package p2;

import j$.util.Objects;
import v7.u6;
public final class f {
    public final String f44367a;
    public final int f44368b;
    public final double f44369c;
    public final String d;

    public f(String str, double d) {
        this.f44367a = str;
        this.f44368b = 2;
        this.f44369c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.f44368b == fVar.f44368b && Double.compare(this.f44369c, fVar.f44369c) == 0 && Objects.equals(this.f44367a, fVar.f44367a) && Objects.equals(this.d, fVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f44367a, Integer.valueOf(this.f44368b), Double.valueOf(this.f44369c), this.d);
    }

    public f(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        u6.p(z10);
        this.f44367a = str;
        this.f44368b = i10;
        this.d = str2;
        this.f44369c = 0.0d;
    }
}
