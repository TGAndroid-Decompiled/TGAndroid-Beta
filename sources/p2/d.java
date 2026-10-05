package p2;

import j$.util.Objects;
public final class d {
    public final String f44017a;
    public final int f44018b;
    public final double f44019c;
    public final String d;

    public d(String str, double d) {
        this.f44017a = str;
        this.f44018b = 2;
        this.f44019c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f44018b == dVar.f44018b && Double.compare(this.f44019c, dVar.f44019c) == 0 && Objects.equals(this.f44017a, dVar.f44017a) && Objects.equals(this.d, dVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f44017a, Integer.valueOf(this.f44018b), Double.valueOf(this.f44019c), this.d);
    }

    public d(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        e2.d.g(z10);
        this.f44017a = str;
        this.f44018b = i10;
        this.d = str2;
        this.f44019c = 0.0d;
    }
}
