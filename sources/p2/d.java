package p2;

import j$.util.Objects;
public final class d {
    public final String f45183a;
    public final int f45184b;
    public final double f45185c;
    public final String d;

    public d(String str, double d) {
        this.f45183a = str;
        this.f45184b = 2;
        this.f45185c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f45184b == dVar.f45184b && Double.compare(this.f45185c, dVar.f45185c) == 0 && Objects.equals(this.f45183a, dVar.f45183a) && Objects.equals(this.d, dVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f45183a, Integer.valueOf(this.f45184b), Double.valueOf(this.f45185c), this.d);
    }

    public d(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        e2.d.g(z10);
        this.f45183a = str;
        this.f45184b = i10;
        this.d = str2;
        this.f45185c = 0.0d;
    }
}
