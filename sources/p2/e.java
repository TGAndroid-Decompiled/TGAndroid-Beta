package p2;

import j$.util.Objects;
public final class e {
    public final String f40413a;
    public final int f40414b;
    public final double f40415c;
    public final String d;

    public e(String str, double d) {
        this.f40413a = str;
        this.f40414b = 2;
        this.f40415c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f40414b == eVar.f40414b && Double.compare(this.f40415c, eVar.f40415c) == 0 && Objects.equals(this.f40413a, eVar.f40413a) && Objects.equals(this.d, eVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f40413a, Integer.valueOf(this.f40414b), Double.valueOf(this.f40415c), this.d);
    }

    public e(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        e2.d.g(z10);
        this.f40413a = str;
        this.f40414b = i10;
        this.d = str2;
        this.f40415c = 0.0d;
    }
}
