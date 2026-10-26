package p2;

import a8.yb;
import j$.util.Objects;
public final class e {
    public final String f46509a;
    public final int f46510b;
    public final double f46511c;
    public final String d;

    public e(String str, double d) {
        this.f46509a = str;
        this.f46510b = 2;
        this.f46511c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f46510b == eVar.f46510b && Double.compare(this.f46511c, eVar.f46511c) == 0 && Objects.equals(this.f46509a, eVar.f46509a) && Objects.equals(this.d, eVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f46509a, Integer.valueOf(this.f46510b), Double.valueOf(this.f46511c), this.d);
    }

    public e(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        yb.p(z10);
        this.f46509a = str;
        this.f46510b = i10;
        this.d = str2;
        this.f46511c = 0.0d;
    }
}
