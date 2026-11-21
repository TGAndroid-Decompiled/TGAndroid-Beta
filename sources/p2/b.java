package p2;

import j$.util.Objects;
public final class b {
    public final String f55122a;
    public final String f55123b;
    public final int f55124c;
    public final int d;

    public b(int i7, int i10, String str, String str2) {
        this.f55122a = str;
        this.f55123b = str2;
        this.f55124c = i7;
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
        if (this.f55124c == bVar.f55124c && this.d == bVar.d && Objects.equals(this.f55122a, bVar.f55122a) && Objects.equals(this.f55123b, bVar.f55123b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f55122a, this.f55123b, Integer.valueOf(this.f55124c), Integer.valueOf(this.d));
    }
}
