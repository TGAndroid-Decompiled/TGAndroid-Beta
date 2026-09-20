package p2;

import j$.util.Objects;
public final class d {
    public final String f40711a;
    public final int f40712b;
    public final double f40713c;
    public final String d;

    public d(String str, double d) {
        this.f40711a = str;
        this.f40712b = 2;
        this.f40713c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f40712b == dVar.f40712b && Double.compare(this.f40713c, dVar.f40713c) == 0 && Objects.equals(this.f40711a, dVar.f40711a) && Objects.equals(this.d, dVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f40711a, Integer.valueOf(this.f40712b), Double.valueOf(this.f40713c), this.d);
    }

    public d(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        e2.d.g(z10);
        this.f40711a = str;
        this.f40712b = i10;
        this.d = str2;
        this.f40713c = 0.0d;
    }
}
