package p2;

import j$.util.Objects;
public final class b {
    public final String f53094a;
    public final String f53095b;
    public final int f53096c;
    public final int d;

    public b(int i7, int i10, String str, String str2) {
        this.f53094a = str;
        this.f53095b = str2;
        this.f53096c = i7;
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
        if (this.f53096c == bVar.f53096c && this.d == bVar.d && Objects.equals(this.f53094a, bVar.f53094a) && Objects.equals(this.f53095b, bVar.f53095b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f53094a, this.f53095b, Integer.valueOf(this.f53096c), Integer.valueOf(this.d));
    }
}
