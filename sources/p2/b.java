package p2;

import j$.util.Objects;
public final class b {
    public final String f53095a;
    public final String f53096b;
    public final int f53097c;
    public final int d;

    public b(int i7, int i10, String str, String str2) {
        this.f53095a = str;
        this.f53096b = str2;
        this.f53097c = i7;
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
        if (this.f53097c == bVar.f53097c && this.d == bVar.d && Objects.equals(this.f53095a, bVar.f53095a) && Objects.equals(this.f53096b, bVar.f53096b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f53095a, this.f53096b, Integer.valueOf(this.f53097c), Integer.valueOf(this.d));
    }
}
