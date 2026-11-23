package s2;

import a8.ma;
import j$.util.Objects;
public final class e {
    public final String f56778a;
    public final int f56779b;
    public final double f56780c;
    public final String d;

    public e(String str, double d) {
        this.f56778a = str;
        this.f56779b = 2;
        this.f56780c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f56779b == eVar.f56779b && Double.compare(this.f56780c, eVar.f56780c) == 0 && Objects.equals(this.f56778a, eVar.f56778a) && Objects.equals(this.d, eVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f56778a, Integer.valueOf(this.f56779b), Double.valueOf(this.f56780c), this.d);
    }

    public e(int i7, String str, String str2) {
        boolean z10 = true;
        if (i7 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        ma.p(z10);
        this.f56778a = str;
        this.f56779b = i7;
        this.d = str2;
        this.f56780c = 0.0d;
    }
}
