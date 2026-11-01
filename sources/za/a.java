package za;

import a1.g;
public final class a {
    public final String f55444a;
    public final String f55445b;

    public a(String str, String str2) {
        this.f55444a = str;
        if (str2 != null) {
            this.f55445b = str2;
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
            if (this.f55444a.equals(aVar.f55444a) && this.f55445b.equals(aVar.f55445b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f55444a.hashCode() ^ 1000003) * 1000003) ^ this.f55445b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f55444a);
        sb2.append(", version=");
        return g.r(sb2, this.f55445b, "}");
    }
}
