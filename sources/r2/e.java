package r2;

import b8.zb;
import j$.util.Objects;
public final class e {
    public final String f54094a;
    public final int f54095b;
    public final double f54096c;
    public final String d;

    public e(String str, double d) {
        this.f54094a = str;
        this.f54095b = 2;
        this.f54096c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f54095b == eVar.f54095b && Double.compare(this.f54096c, eVar.f54096c) == 0 && Objects.equals(this.f54094a, eVar.f54094a) && Objects.equals(this.d, eVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f54094a, Integer.valueOf(this.f54095b), Double.valueOf(this.f54096c), this.d);
    }

    public e(int i3, String str, String str2) {
        boolean z10 = true;
        if (i3 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        zb.p(z10);
        this.f54094a = str;
        this.f54095b = i3;
        this.d = str2;
        this.f54096c = 0.0d;
    }
}
