package p2;

import j$.util.Objects;
public final class b {
    public final String f55126a;
    public final String f55127b;
    public final int f55128c;
    public final int d;

    public b(int i7, int i10, String str, String str2) {
        this.f55126a = str;
        this.f55127b = str2;
        this.f55128c = i7;
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
        if (this.f55128c == bVar.f55128c && this.d == bVar.d && Objects.equals(this.f55126a, bVar.f55126a) && Objects.equals(this.f55127b, bVar.f55127b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f55126a, this.f55127b, Integer.valueOf(this.f55128c), Integer.valueOf(this.d));
    }
}
