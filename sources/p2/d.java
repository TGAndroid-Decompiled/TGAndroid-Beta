package p2;

import j$.util.Objects;
public final class d {
    public final String f45071a;
    public final int f45072b;
    public final double f45073c;
    public final String d;

    public d(String str, double d) {
        this.f45071a = str;
        this.f45072b = 2;
        this.f45073c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f45072b == dVar.f45072b && Double.compare(this.f45073c, dVar.f45073c) == 0 && Objects.equals(this.f45071a, dVar.f45071a) && Objects.equals(this.d, dVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f45071a, Integer.valueOf(this.f45072b), Double.valueOf(this.f45073c), this.d);
    }

    public d(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        e2.d.g(z10);
        this.f45071a = str;
        this.f45072b = i10;
        this.d = str2;
        this.f45073c = 0.0d;
    }
}
