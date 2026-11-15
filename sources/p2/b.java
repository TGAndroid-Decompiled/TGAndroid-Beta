package p2;

import j$.util.Objects;
public final class b {
    public final String f54512a;
    public final String f54513b;
    public final int f54514c;
    public final int d;

    public b(int i7, int i10, String str, String str2) {
        this.f54512a = str;
        this.f54513b = str2;
        this.f54514c = i7;
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
        if (this.f54514c == bVar.f54514c && this.d == bVar.d && Objects.equals(this.f54512a, bVar.f54512a) && Objects.equals(this.f54513b, bVar.f54513b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f54512a, this.f54513b, Integer.valueOf(this.f54514c), Integer.valueOf(this.d));
    }
}
