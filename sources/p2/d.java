package p2;

import j$.util.Objects;
public final class d {
    public final String f40685a;
    public final int f40686b;
    public final double f40687c;
    public final String d;

    public d(String str, double d) {
        this.f40685a = str;
        this.f40686b = 2;
        this.f40687c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f40686b == dVar.f40686b && Double.compare(this.f40687c, dVar.f40687c) == 0 && Objects.equals(this.f40685a, dVar.f40685a) && Objects.equals(this.d, dVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f40685a, Integer.valueOf(this.f40686b), Double.valueOf(this.f40687c), this.d);
    }

    public d(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        e2.d.g(z10);
        this.f40685a = str;
        this.f40686b = i10;
        this.d = str2;
        this.f40687c = 0.0d;
    }
}
