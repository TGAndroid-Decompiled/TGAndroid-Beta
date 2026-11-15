package s2;

import a8.ja;
import j$.util.Objects;
public final class e {
    public final String f56194a;
    public final int f56195b;
    public final double f56196c;
    public final String d;

    public e(String str, double d) {
        this.f56194a = str;
        this.f56195b = 2;
        this.f56196c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f56195b == eVar.f56195b && Double.compare(this.f56196c, eVar.f56196c) == 0 && Objects.equals(this.f56194a, eVar.f56194a) && Objects.equals(this.d, eVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f56194a, Integer.valueOf(this.f56195b), Double.valueOf(this.f56196c), this.d);
    }

    public e(int i7, String str, String str2) {
        boolean z10 = true;
        if (i7 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        ja.p(z10);
        this.f56194a = str;
        this.f56195b = i7;
        this.d = str2;
        this.f56196c = 0.0d;
    }
}
