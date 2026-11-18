package p2;

import j$.util.Objects;
public final class b {
    public final String f55081a;
    public final String f55082b;
    public final int f55083c;
    public final int d;

    public b(int i7, int i10, String str, String str2) {
        this.f55081a = str;
        this.f55082b = str2;
        this.f55083c = i7;
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
        if (this.f55083c == bVar.f55083c && this.d == bVar.d && Objects.equals(this.f55081a, bVar.f55081a) && Objects.equals(this.f55082b, bVar.f55082b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f55081a, this.f55082b, Integer.valueOf(this.f55083c), Integer.valueOf(this.d));
    }
}
