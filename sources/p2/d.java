package p2;

import j$.util.Objects;
public final class d {
    public final String f39542a;
    public final int f39543b;
    public final double f39544c;
    public final String d;

    public d(String str, double d) {
        this.f39542a = str;
        this.f39543b = 2;
        this.f39544c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f39543b == dVar.f39543b && Double.compare(this.f39544c, dVar.f39544c) == 0 && Objects.equals(this.f39542a, dVar.f39542a) && Objects.equals(this.d, dVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f39542a, Integer.valueOf(this.f39543b), Double.valueOf(this.f39544c), this.d);
    }

    public d(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        e2.d.g(z10);
        this.f39542a = str;
        this.f39543b = i10;
        this.d = str2;
        this.f39544c = 0.0d;
    }
}
