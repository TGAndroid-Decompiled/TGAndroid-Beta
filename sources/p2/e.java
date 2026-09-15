package p2;

import j$.util.Objects;
public final class e {
    public final String f40417a;
    public final int f40418b;
    public final double f40419c;
    public final String d;

    public e(String str, double d) {
        this.f40417a = str;
        this.f40418b = 2;
        this.f40419c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f40418b == eVar.f40418b && Double.compare(this.f40419c, eVar.f40419c) == 0 && Objects.equals(this.f40417a, eVar.f40417a) && Objects.equals(this.d, eVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f40417a, Integer.valueOf(this.f40418b), Double.valueOf(this.f40419c), this.d);
    }

    public e(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        e2.d.g(z10);
        this.f40417a = str;
        this.f40418b = i10;
        this.d = str2;
        this.f40419c = 0.0d;
    }
}
