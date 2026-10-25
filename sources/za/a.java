package za;

import a1.g;
public final class a {
    public final String f52835a;
    public final String f52836b;

    public a(String str, String str2) {
        this.f52835a = str;
        if (str2 != null) {
            this.f52836b = str2;
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
            if (this.f52835a.equals(aVar.f52835a) && this.f52836b.equals(aVar.f52836b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f52835a.hashCode() ^ 1000003) * 1000003) ^ this.f52836b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f52835a);
        sb2.append(", version=");
        return g.s(sb2, this.f52836b, "}");
    }
}
