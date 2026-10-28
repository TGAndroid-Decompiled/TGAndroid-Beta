package p2;

import a8.yb;
import j$.util.Objects;
public final class e {
    public final String f46544a;
    public final int f46545b;
    public final double f46546c;
    public final String d;

    public e(String str, double d) {
        this.f46544a = str;
        this.f46545b = 2;
        this.f46546c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f46545b == eVar.f46545b && Double.compare(this.f46546c, eVar.f46546c) == 0 && Objects.equals(this.f46544a, eVar.f46544a) && Objects.equals(this.d, eVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f46544a, Integer.valueOf(this.f46545b), Double.valueOf(this.f46546c), this.d);
    }

    public e(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        yb.p(z10);
        this.f46544a = str;
        this.f46545b = i10;
        this.d = str2;
        this.f46546c = 0.0d;
    }
}
