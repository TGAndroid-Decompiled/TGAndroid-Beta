package xa;

import a1.g;
public final class a {
    public final String f51337a;
    public final String f51338b;

    public a(String str, String str2) {
        this.f51337a = str;
        if (str2 != null) {
            this.f51338b = str2;
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
            if (this.f51337a.equals(aVar.f51337a) && this.f51338b.equals(aVar.f51338b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f51337a.hashCode() ^ 1000003) * 1000003) ^ this.f51338b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f51337a);
        sb2.append(", version=");
        return g.t(sb2, this.f51338b, "}");
    }
}
