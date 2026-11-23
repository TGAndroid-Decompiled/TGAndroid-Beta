package s2;

import a8.la;
import j$.util.Objects;
public final class e {
    public final String f56813a;
    public final int f56814b;
    public final double f56815c;
    public final String d;

    public e(String str, double d) {
        this.f56813a = str;
        this.f56814b = 2;
        this.f56815c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f56814b == eVar.f56814b && Double.compare(this.f56815c, eVar.f56815c) == 0 && Objects.equals(this.f56813a, eVar.f56813a) && Objects.equals(this.d, eVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f56813a, Integer.valueOf(this.f56814b), Double.valueOf(this.f56815c), this.d);
    }

    public e(int i7, String str, String str2) {
        boolean z10 = true;
        if (i7 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        la.p(z10);
        this.f56813a = str;
        this.f56814b = i7;
        this.d = str2;
        this.f56815c = 0.0d;
    }
}
