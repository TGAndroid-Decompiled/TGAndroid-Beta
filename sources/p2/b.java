package p2;

import j$.util.Objects;
public final class b {
    public final String f53107a;
    public final String f53108b;
    public final int f53109c;
    public final int d;

    public b(int i7, int i10, String str, String str2) {
        this.f53107a = str;
        this.f53108b = str2;
        this.f53109c = i7;
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
        if (this.f53109c == bVar.f53109c && this.d == bVar.d && Objects.equals(this.f53107a, bVar.f53107a) && Objects.equals(this.f53108b, bVar.f53108b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f53107a, this.f53108b, Integer.valueOf(this.f53109c), Integer.valueOf(this.d));
    }
}
