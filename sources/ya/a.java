package ya;

import a1.g;
public final class a {
    public final String f50108a;
    public final String f50109b;

    public a(String str, String str2) {
        this.f50108a = str;
        if (str2 != null) {
            this.f50109b = str2;
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
            if (this.f50108a.equals(aVar.f50108a) && this.f50109b.equals(aVar.f50109b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f50108a.hashCode() ^ 1000003) * 1000003) ^ this.f50109b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f50108a);
        sb2.append(", version=");
        return g.s(sb2, this.f50109b, "}");
    }
}
