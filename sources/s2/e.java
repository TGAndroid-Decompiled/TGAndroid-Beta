package s2;

import a8.ia;
import j$.util.Objects;
public final class e {
    public final String f54628a;
    public final int f54629b;
    public final double f54630c;
    public final String d;

    public e(String str, double d) {
        this.f54628a = str;
        this.f54629b = 2;
        this.f54630c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f54629b == eVar.f54629b && Double.compare(this.f54630c, eVar.f54630c) == 0 && Objects.equals(this.f54628a, eVar.f54628a) && Objects.equals(this.d, eVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f54628a, Integer.valueOf(this.f54629b), Double.valueOf(this.f54630c), this.d);
    }

    public e(int i7, String str, String str2) {
        boolean z9 = true;
        if (i7 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z9 = false;
        }
        ia.p(z9);
        this.f54628a = str;
        this.f54629b = i7;
        this.d = str2;
        this.f54630c = 0.0d;
    }
}
