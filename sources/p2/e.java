package p2;

import a8.yb;
import j$.util.Objects;
public final class e {
    public final String f46506a;
    public final int f46507b;
    public final double f46508c;
    public final String d;

    public e(String str, double d) {
        this.f46506a = str;
        this.f46507b = 2;
        this.f46508c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f46507b == eVar.f46507b && Double.compare(this.f46508c, eVar.f46508c) == 0 && Objects.equals(this.f46506a, eVar.f46506a) && Objects.equals(this.d, eVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f46506a, Integer.valueOf(this.f46507b), Double.valueOf(this.f46508c), this.d);
    }

    public e(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        yb.p(z10);
        this.f46506a = str;
        this.f46507b = i10;
        this.d = str2;
        this.f46508c = 0.0d;
    }
}
