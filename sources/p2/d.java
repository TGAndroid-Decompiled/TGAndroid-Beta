package p2;

import j$.util.Objects;
public final class d {
    public final String f44010a;
    public final int f44011b;
    public final double f44012c;
    public final String d;

    public d(String str, double d) {
        this.f44010a = str;
        this.f44011b = 2;
        this.f44012c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f44011b == dVar.f44011b && Double.compare(this.f44012c, dVar.f44012c) == 0 && Objects.equals(this.f44010a, dVar.f44010a) && Objects.equals(this.d, dVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f44010a, Integer.valueOf(this.f44011b), Double.valueOf(this.f44012c), this.d);
    }

    public d(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        e2.d.g(z10);
        this.f44010a = str;
        this.f44011b = i10;
        this.d = str2;
        this.f44012c = 0.0d;
    }
}
