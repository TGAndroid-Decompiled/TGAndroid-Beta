package p2;

import j$.util.Objects;
public final class d {
    public final String f43662a;
    public final int f43663b;
    public final double f43664c;
    public final String d;

    public d(String str, double d) {
        this.f43662a = str;
        this.f43663b = 2;
        this.f43664c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f43663b == dVar.f43663b && Double.compare(this.f43664c, dVar.f43664c) == 0 && Objects.equals(this.f43662a, dVar.f43662a) && Objects.equals(this.d, dVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f43662a, Integer.valueOf(this.f43663b), Double.valueOf(this.f43664c), this.d);
    }

    public d(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        e2.d.g(z10);
        this.f43662a = str;
        this.f43663b = i10;
        this.d = str2;
        this.f43664c = 0.0d;
    }
}
