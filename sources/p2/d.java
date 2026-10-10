package p2;

import j$.util.Objects;
public final class d {
    public final String f45227a;
    public final int f45228b;
    public final double f45229c;
    public final String d;

    public d(String str, double d) {
        this.f45227a = str;
        this.f45228b = 2;
        this.f45229c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f45228b == dVar.f45228b && Double.compare(this.f45229c, dVar.f45229c) == 0 && Objects.equals(this.f45227a, dVar.f45227a) && Objects.equals(this.d, dVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f45227a, Integer.valueOf(this.f45228b), Double.valueOf(this.f45229c), this.d);
    }

    public d(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        e2.d.g(z10);
        this.f45227a = str;
        this.f45228b = i10;
        this.d = str2;
        this.f45229c = 0.0d;
    }
}
