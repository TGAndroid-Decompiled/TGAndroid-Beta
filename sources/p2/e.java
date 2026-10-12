package p2;

import j$.util.Objects;
public final class e {
    public final String f45066a;
    public final int f45067b;
    public final double f45068c;
    public final String d;

    public e(String str, double d) {
        this.f45066a = str;
        this.f45067b = 2;
        this.f45068c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f45067b == eVar.f45067b && Double.compare(this.f45068c, eVar.f45068c) == 0 && Objects.equals(this.f45066a, eVar.f45066a) && Objects.equals(this.d, eVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f45066a, Integer.valueOf(this.f45067b), Double.valueOf(this.f45068c), this.d);
    }

    public e(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        e2.d.g(z10);
        this.f45066a = str;
        this.f45067b = i10;
        this.d = str2;
        this.f45068c = 0.0d;
    }
}
