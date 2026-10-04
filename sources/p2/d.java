package p2;

import j$.util.Objects;
public final class d {
    public final String f44002a;
    public final int f44003b;
    public final double f44004c;
    public final String d;

    public d(String str, double d) {
        this.f44002a = str;
        this.f44003b = 2;
        this.f44004c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f44003b == dVar.f44003b && Double.compare(this.f44004c, dVar.f44004c) == 0 && Objects.equals(this.f44002a, dVar.f44002a) && Objects.equals(this.d, dVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f44002a, Integer.valueOf(this.f44003b), Double.valueOf(this.f44004c), this.d);
    }

    public d(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        e2.d.g(z10);
        this.f44002a = str;
        this.f44003b = i10;
        this.d = str2;
        this.f44004c = 0.0d;
    }
}
