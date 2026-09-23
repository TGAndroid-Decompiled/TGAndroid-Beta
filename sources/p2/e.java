package p2;

import j$.util.Objects;
public final class e {
    public final String f40368a;
    public final int f40369b;
    public final double f40370c;
    public final String d;

    public e(String str, double d) {
        this.f40368a = str;
        this.f40369b = 2;
        this.f40370c = d;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f40369b == eVar.f40369b && Double.compare(this.f40370c, eVar.f40370c) == 0 && Objects.equals(this.f40368a, eVar.f40368a) && Objects.equals(this.d, eVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f40368a, Integer.valueOf(this.f40369b), Double.valueOf(this.f40370c), this.d);
    }

    public e(int i10, String str, String str2) {
        boolean z10 = true;
        if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z10 = false;
        }
        e2.d.g(z10);
        this.f40368a = str;
        this.f40369b = i10;
        this.d = str2;
        this.f40370c = 0.0d;
    }
}
