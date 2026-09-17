package p2;

import j$.util.Objects;
public final class d {
    public final String f43689a;
    public final int f43690b;
    public final double f43691c;
    public final String d;

    public d(String str, double d) {
        this.f43689a = str;
        this.f43690b = 2;
        this.f43691c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f43690b == dVar.f43690b && Double.compare(this.f43691c, dVar.f43691c) == 0 && Objects.equals(this.f43689a, dVar.f43689a) && Objects.equals(this.d, dVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f43689a, Integer.valueOf(this.f43690b), Double.valueOf(this.f43691c), this.d);
    }

    public d(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        e2.d.g(z10);
        this.f43689a = str;
        this.f43690b = i10;
        this.d = str2;
        this.f43691c = 0.0d;
    }
}
