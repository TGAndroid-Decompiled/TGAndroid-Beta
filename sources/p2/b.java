package p2;

import j$.util.Objects;
public final class b {
    public final String f52977a;
    public final String f52978b;
    public final int f52979c;
    public final int d;

    public b(int i7, int i10, String str, String str2) {
        this.f52977a = str;
        this.f52978b = str2;
        this.f52979c = i7;
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
        if (this.f52979c == bVar.f52979c && this.d == bVar.d && Objects.equals(this.f52977a, bVar.f52977a) && Objects.equals(this.f52978b, bVar.f52978b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f52977a, this.f52978b, Integer.valueOf(this.f52979c), Integer.valueOf(this.d));
    }
}
