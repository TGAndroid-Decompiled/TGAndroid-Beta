package p2;

import j$.util.Objects;
public final class e {
    public final String f40444a;
    public final int f40445b;
    public final double f40446c;
    public final String d;

    public e(String str, double d) {
        this.f40444a = str;
        this.f40445b = 2;
        this.f40446c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f40445b == eVar.f40445b && Double.compare(this.f40446c, eVar.f40446c) == 0 && Objects.equals(this.f40444a, eVar.f40444a) && Objects.equals(this.d, eVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f40444a, Integer.valueOf(this.f40445b), Double.valueOf(this.f40446c), this.d);
    }

    public e(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        e2.d.g(z10);
        this.f40444a = str;
        this.f40445b = i10;
        this.d = str2;
        this.f40446c = 0.0d;
    }
}
