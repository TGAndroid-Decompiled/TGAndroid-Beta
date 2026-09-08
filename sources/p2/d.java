package p2;

import j$.util.Objects;
public final class d {
    public final String f43688a;
    public final int f43689b;
    public final double f43690c;
    public final String d;

    public d(String str, double d) {
        this.f43688a = str;
        this.f43689b = 2;
        this.f43690c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f43689b == dVar.f43689b && Double.compare(this.f43690c, dVar.f43690c) == 0 && Objects.equals(this.f43688a, dVar.f43688a) && Objects.equals(this.d, dVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f43688a, Integer.valueOf(this.f43689b), Double.valueOf(this.f43690c), this.d);
    }

    public d(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        e2.d.g(z10);
        this.f43688a = str;
        this.f43689b = i10;
        this.d = str2;
        this.f43690c = 0.0d;
    }
}
