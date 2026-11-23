package p2;

import j$.util.Objects;
public final class b {
    public final String f55207a;
    public final String f55208b;
    public final int f55209c;
    public final int d;

    public b(int i7, int i10, String str, String str2) {
        this.f55207a = str;
        this.f55208b = str2;
        this.f55209c = i7;
        this.d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f55209c == bVar.f55209c && this.d == bVar.d && Objects.equals(this.f55207a, bVar.f55207a) && Objects.equals(this.f55208b, bVar.f55208b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f55207a, this.f55208b, Integer.valueOf(this.f55209c), Integer.valueOf(this.d));
    }
}
