package xa;

import a1.g;
public final class a {
    public final String f51144a;
    public final String f51145b;

    public a(String str, String str2) {
        this.f51144a = str;
        if (str2 != null) {
            this.f51145b = str2;
            return;
        }
        throw new NullPointerException("Null version");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f51144a.equals(aVar.f51144a) && this.f51145b.equals(aVar.f51145b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f51144a.hashCode() ^ 1000003) * 1000003) ^ this.f51145b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f51144a);
        sb2.append(", version=");
        return g.t(sb2, this.f51145b, "}");
    }
}
