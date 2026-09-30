package p2;

import j$.util.Objects;
public final class d {
    public final String f40686a;
    public final int f40687b;
    public final double f40688c;
    public final String d;

    public d(String str, double d) {
        this.f40686a = str;
        this.f40687b = 2;
        this.f40688c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f40687b == dVar.f40687b && Double.compare(this.f40688c, dVar.f40688c) == 0 && Objects.equals(this.f40686a, dVar.f40686a) && Objects.equals(this.d, dVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f40686a, Integer.valueOf(this.f40687b), Double.valueOf(this.f40688c), this.d);
    }

    public d(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        e2.d.g(z10);
        this.f40686a = str;
        this.f40687b = i10;
        this.d = str2;
        this.f40688c = 0.0d;
    }
}
