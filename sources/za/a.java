package za;

import a1.g;
public final class a {
    public final String f55426a;
    public final String f55427b;

    public a(String str, String str2) {
        this.f55426a = str;
        if (str2 != null) {
            this.f55427b = str2;
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
            if (this.f55426a.equals(aVar.f55426a) && this.f55427b.equals(aVar.f55427b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f55426a.hashCode() ^ 1000003) * 1000003) ^ this.f55427b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f55426a);
        sb2.append(", version=");
        return g.r(sb2, this.f55427b, "}");
    }
}
