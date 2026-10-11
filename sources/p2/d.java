package p2;

import j$.util.Objects;
public final class d {
    public final String f45217a;
    public final int f45218b;
    public final double f45219c;
    public final String d;

    public d(String str, double d) {
        this.f45217a = str;
        this.f45218b = 2;
        this.f45219c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f45218b == dVar.f45218b && Double.compare(this.f45219c, dVar.f45219c) == 0 && Objects.equals(this.f45217a, dVar.f45217a) && Objects.equals(this.d, dVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f45217a, Integer.valueOf(this.f45218b), Double.valueOf(this.f45219c), this.d);
    }

    public d(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        e2.d.g(z10);
        this.f45217a = str;
        this.f45218b = i10;
        this.d = str2;
        this.f45219c = 0.0d;
    }
}
