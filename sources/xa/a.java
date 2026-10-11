package xa;

import a1.g;
public final class a {
    public final String f51222a;
    public final String f51223b;

    public a(String str, String str2) {
        this.f51222a = str;
        if (str2 != null) {
            this.f51223b = str2;
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
            if (this.f51222a.equals(aVar.f51222a) && this.f51223b.equals(aVar.f51223b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f51222a.hashCode() ^ 1000003) * 1000003) ^ this.f51223b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f51222a);
        sb2.append(", version=");
        return g.t(sb2, this.f51223b, "}");
    }
}
