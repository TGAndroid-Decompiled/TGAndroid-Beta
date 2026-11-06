package p2;

import j$.util.Objects;
public final class b {
    public final String f53003a;
    public final String f53004b;
    public final int f53005c;
    public final int d;

    public b(int i7, int i10, String str, String str2) {
        this.f53003a = str;
        this.f53004b = str2;
        this.f53005c = i7;
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
        if (this.f53005c == bVar.f53005c && this.d == bVar.d && Objects.equals(this.f53003a, bVar.f53003a) && Objects.equals(this.f53004b, bVar.f53004b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f53003a, this.f53004b, Integer.valueOf(this.f53005c), Integer.valueOf(this.d));
    }
}
