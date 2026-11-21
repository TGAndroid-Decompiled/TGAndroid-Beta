package s2;

import a8.la;
import j$.util.Objects;
public final class e {
    public final String f56809a;
    public final int f56810b;
    public final double f56811c;
    public final String d;

    public e(String str, double d) {
        this.f56809a = str;
        this.f56810b = 2;
        this.f56811c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f56810b == eVar.f56810b && Double.compare(this.f56811c, eVar.f56811c) == 0 && Objects.equals(this.f56809a, eVar.f56809a) && Objects.equals(this.d, eVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f56809a, Integer.valueOf(this.f56810b), Double.valueOf(this.f56811c), this.d);
    }

    public e(int i7, String str, String str2) {
        boolean z10 = true;
        if (i7 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        la.p(z10);
        this.f56809a = str;
        this.f56810b = i7;
        this.d = str2;
        this.f56811c = 0.0d;
    }
}
