package p2;

import j$.util.Objects;
public final class d {
    public final String f45181a;
    public final int f45182b;
    public final double f45183c;
    public final String d;

    public d(String str, double d) {
        this.f45181a = str;
        this.f45182b = 2;
        this.f45183c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f45182b == dVar.f45182b && Double.compare(this.f45183c, dVar.f45183c) == 0 && Objects.equals(this.f45181a, dVar.f45181a) && Objects.equals(this.d, dVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f45181a, Integer.valueOf(this.f45182b), Double.valueOf(this.f45183c), this.d);
    }

    public d(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        e2.d.g(z10);
        this.f45181a = str;
        this.f45182b = i10;
        this.d = str2;
        this.f45183c = 0.0d;
    }
}
