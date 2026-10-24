package p2;

import j$.util.Objects;
import v7.u6;
public final class f {
    public final String f44366a;
    public final int f44367b;
    public final double f44368c;
    public final String d;

    public f(String str, double d) {
        this.f44366a = str;
        this.f44367b = 2;
        this.f44368c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.f44367b == fVar.f44367b && Double.compare(this.f44368c, fVar.f44368c) == 0 && Objects.equals(this.f44366a, fVar.f44366a) && Objects.equals(this.d, fVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f44366a, Integer.valueOf(this.f44367b), Double.valueOf(this.f44368c), this.d);
    }

    public f(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        u6.p(z10);
        this.f44366a = str;
        this.f44367b = i10;
        this.d = str2;
        this.f44368c = 0.0d;
    }
}
