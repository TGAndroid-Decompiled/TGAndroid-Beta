package p2;

import j$.util.Objects;
public final class d {
    public final String f40682a;
    public final int f40683b;
    public final double f40684c;
    public final String d;

    public d(String str, double d) {
        this.f40682a = str;
        this.f40683b = 2;
        this.f40684c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f40683b == dVar.f40683b && Double.compare(this.f40684c, dVar.f40684c) == 0 && Objects.equals(this.f40682a, dVar.f40682a) && Objects.equals(this.d, dVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f40682a, Integer.valueOf(this.f40683b), Double.valueOf(this.f40684c), this.d);
    }

    public d(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        e2.d.g(z10);
        this.f40682a = str;
        this.f40683b = i10;
        this.d = str2;
        this.f40684c = 0.0d;
    }
}
