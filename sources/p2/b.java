package p2;

import j$.util.Objects;
public final class b {
    public final String f55091a;
    public final String f55092b;
    public final int f55093c;
    public final int d;

    public b(int i7, int i10, String str, String str2) {
        this.f55091a = str;
        this.f55092b = str2;
        this.f55093c = i7;
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
        if (this.f55093c == bVar.f55093c && this.d == bVar.d && Objects.equals(this.f55091a, bVar.f55091a) && Objects.equals(this.f55092b, bVar.f55092b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f55091a, this.f55092b, Integer.valueOf(this.f55093c), Integer.valueOf(this.d));
    }
}
