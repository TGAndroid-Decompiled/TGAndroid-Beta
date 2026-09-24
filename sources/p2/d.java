package p2;

import j$.util.Objects;
public final class d {
    public final String f40670a;
    public final int f40671b;
    public final double f40672c;
    public final String d;

    public d(String str, double d) {
        this.f40670a = str;
        this.f40671b = 2;
        this.f40672c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f40671b == dVar.f40671b && Double.compare(this.f40672c, dVar.f40672c) == 0 && Objects.equals(this.f40670a, dVar.f40670a) && Objects.equals(this.d, dVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f40670a, Integer.valueOf(this.f40671b), Double.valueOf(this.f40672c), this.d);
    }

    public d(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        e2.d.g(z10);
        this.f40670a = str;
        this.f40671b = i10;
        this.d = str2;
        this.f40672c = 0.0d;
    }
}
