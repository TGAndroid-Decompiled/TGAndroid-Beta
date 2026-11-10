package p2;

import j$.util.Objects;
public final class b {
    public final String f53106a;
    public final String f53107b;
    public final int f53108c;
    public final int d;

    public b(int i7, int i10, String str, String str2) {
        this.f53106a = str;
        this.f53107b = str2;
        this.f53108c = i7;
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
        if (this.f53108c == bVar.f53108c && this.d == bVar.d && Objects.equals(this.f53106a, bVar.f53106a) && Objects.equals(this.f53107b, bVar.f53107b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f53106a, this.f53107b, Integer.valueOf(this.f53108c), Integer.valueOf(this.d));
    }
}
