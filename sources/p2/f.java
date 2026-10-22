package p2;

import j$.util.Objects;
import v7.u6;
public final class f {
    public final String f43951a;
    public final int f43952b;
    public final double f43953c;
    public final String d;

    public f(String str, double d) {
        this.f43951a = str;
        this.f43952b = 2;
        this.f43953c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.f43952b == fVar.f43952b && Double.compare(this.f43953c, fVar.f43953c) == 0 && Objects.equals(this.f43951a, fVar.f43951a) && Objects.equals(this.d, fVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f43951a, Integer.valueOf(this.f43952b), Double.valueOf(this.f43953c), this.d);
    }

    public f(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        u6.p(z10);
        this.f43951a = str;
        this.f43952b = i10;
        this.d = str2;
        this.f43953c = 0.0d;
    }
}
