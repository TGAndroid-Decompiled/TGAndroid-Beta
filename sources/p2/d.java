package p2;

import j$.util.Objects;
public final class d {
    public final String f40783a;
    public final int f40784b;
    public final double f40785c;
    public final String d;

    public d(String str, double d) {
        this.f40783a = str;
        this.f40784b = 2;
        this.f40785c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f40784b == dVar.f40784b && Double.compare(this.f40785c, dVar.f40785c) == 0 && Objects.equals(this.f40783a, dVar.f40783a) && Objects.equals(this.d, dVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f40783a, Integer.valueOf(this.f40784b), Double.valueOf(this.f40785c), this.d);
    }

    public d(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        e2.d.g(z10);
        this.f40783a = str;
        this.f40784b = i10;
        this.d = str2;
        this.f40785c = 0.0d;
    }
}
