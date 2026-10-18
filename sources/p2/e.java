package p2;

import j$.util.Objects;
import v7.u6;
public final class e {
    public final String f43943a;
    public final int f43944b;
    public final double f43945c;
    public final String d;

    public e(String str, double d) {
        this.f43943a = str;
        this.f43944b = 2;
        this.f43945c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f43944b == eVar.f43944b && Double.compare(this.f43945c, eVar.f43945c) == 0 && Objects.equals(this.f43943a, eVar.f43943a) && Objects.equals(this.d, eVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f43943a, Integer.valueOf(this.f43944b), Double.valueOf(this.f43945c), this.d);
    }

    public e(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        u6.p(z10);
        this.f43943a = str;
        this.f43944b = i10;
        this.d = str2;
        this.f43945c = 0.0d;
    }
}
