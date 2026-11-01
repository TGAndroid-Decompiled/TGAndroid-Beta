package p2;

import j$.util.Objects;
import v7.t6;
public final class e {
    public final String f44568a;
    public final int f44569b;
    public final double f44570c;
    public final String d;

    public e(String str, double d) {
        this.f44568a = str;
        this.f44569b = 2;
        this.f44570c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f44569b == eVar.f44569b && Double.compare(this.f44570c, eVar.f44570c) == 0 && Objects.equals(this.f44568a, eVar.f44568a) && Objects.equals(this.d, eVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f44568a, Integer.valueOf(this.f44569b), Double.valueOf(this.f44570c), this.d);
    }

    public e(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        t6.p(z10);
        this.f44568a = str;
        this.f44569b = i10;
        this.d = str2;
        this.f44570c = 0.0d;
    }
}
