package s2;

import a8.ia;
import j$.util.Objects;
public final class e {
    public final String f54629a;
    public final int f54630b;
    public final double f54631c;
    public final String d;

    public e(String str, double d) {
        this.f54629a = str;
        this.f54630b = 2;
        this.f54631c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f54630b == eVar.f54630b && Double.compare(this.f54631c, eVar.f54631c) == 0 && Objects.equals(this.f54629a, eVar.f54629a) && Objects.equals(this.d, eVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f54629a, Integer.valueOf(this.f54630b), Double.valueOf(this.f54631c), this.d);
    }

    public e(int i7, String str, String str2) {
        boolean z9 = true;
        if (i7 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z9 = false;
        }
        ia.p(z9);
        this.f54629a = str;
        this.f54630b = i7;
        this.d = str2;
        this.f54631c = 0.0d;
    }
}
