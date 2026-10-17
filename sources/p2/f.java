package p2;

import j$.util.Objects;
import v7.u6;
public final class f {
    public final String f43966a;
    public final int f43967b;
    public final double f43968c;
    public final String d;

    public f(String str, double d) {
        this.f43966a = str;
        this.f43967b = 2;
        this.f43968c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.f43967b == fVar.f43967b && Double.compare(this.f43968c, fVar.f43968c) == 0 && Objects.equals(this.f43966a, fVar.f43966a) && Objects.equals(this.d, fVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f43966a, Integer.valueOf(this.f43967b), Double.valueOf(this.f43968c), this.d);
    }

    public f(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        u6.p(z10);
        this.f43966a = str;
        this.f43967b = i10;
        this.d = str2;
        this.f43968c = 0.0d;
    }
}
