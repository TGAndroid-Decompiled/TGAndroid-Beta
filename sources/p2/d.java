package p2;

import j$.util.Objects;
public final class d {
    public final String f40732a;
    public final int f40733b;
    public final double f40734c;
    public final String d;

    public d(String str, double d) {
        this.f40732a = str;
        this.f40733b = 2;
        this.f40734c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f40733b == dVar.f40733b && Double.compare(this.f40734c, dVar.f40734c) == 0 && Objects.equals(this.f40732a, dVar.f40732a) && Objects.equals(this.d, dVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f40732a, Integer.valueOf(this.f40733b), Double.valueOf(this.f40734c), this.d);
    }

    public d(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        e2.d.g(z10);
        this.f40732a = str;
        this.f40733b = i10;
        this.d = str2;
        this.f40734c = 0.0d;
    }
}
