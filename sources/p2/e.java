package p2;

import j$.util.Objects;
import v7.u6;
public final class e {
    public final String f42856a;
    public final int f42857b;
    public final double f42858c;
    public final String d;

    public e(String str, double d) {
        this.f42856a = str;
        this.f42857b = 2;
        this.f42858c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f42857b == eVar.f42857b && Double.compare(this.f42858c, eVar.f42858c) == 0 && Objects.equals(this.f42856a, eVar.f42856a) && Objects.equals(this.d, eVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f42856a, Integer.valueOf(this.f42857b), Double.valueOf(this.f42858c), this.d);
    }

    public e(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        u6.p(z10);
        this.f42856a = str;
        this.f42857b = i10;
        this.d = str2;
        this.f42858c = 0.0d;
    }
}
