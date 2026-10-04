package p2;

import j$.util.Objects;
public final class d {
    public final String f44003a;
    public final int f44004b;
    public final double f44005c;
    public final String d;

    public d(String str, double d) {
        this.f44003a = str;
        this.f44004b = 2;
        this.f44005c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f44004b == dVar.f44004b && Double.compare(this.f44005c, dVar.f44005c) == 0 && Objects.equals(this.f44003a, dVar.f44003a) && Objects.equals(this.d, dVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f44003a, Integer.valueOf(this.f44004b), Double.valueOf(this.f44005c), this.d);
    }

    public d(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        e2.d.g(z10);
        this.f44003a = str;
        this.f44004b = i10;
        this.d = str2;
        this.f44005c = 0.0d;
    }
}
