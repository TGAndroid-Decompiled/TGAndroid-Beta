package p2;

import j$.util.Objects;
public final class b {
    public final String f53001a;
    public final String f53002b;
    public final int f53003c;
    public final int d;

    public b(int i7, int i10, String str, String str2) {
        this.f53001a = str;
        this.f53002b = str2;
        this.f53003c = i7;
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
        if (this.f53003c == bVar.f53003c && this.d == bVar.d && Objects.equals(this.f53001a, bVar.f53001a) && Objects.equals(this.f53002b, bVar.f53002b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f53001a, this.f53002b, Integer.valueOf(this.f53003c), Integer.valueOf(this.d));
    }
}
