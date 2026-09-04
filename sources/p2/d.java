package p2;

import j$.util.Objects;
public final class d {
    public final String f43661a;
    public final int f43662b;
    public final double f43663c;
    public final String d;

    public d(String str, double d) {
        this.f43661a = str;
        this.f43662b = 2;
        this.f43663c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f43662b == dVar.f43662b && Double.compare(this.f43663c, dVar.f43663c) == 0 && Objects.equals(this.f43661a, dVar.f43661a) && Objects.equals(this.d, dVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f43661a, Integer.valueOf(this.f43662b), Double.valueOf(this.f43663c), this.d);
    }

    public d(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        e2.d.g(z10);
        this.f43661a = str;
        this.f43662b = i10;
        this.d = str2;
        this.f43663c = 0.0d;
    }
}
