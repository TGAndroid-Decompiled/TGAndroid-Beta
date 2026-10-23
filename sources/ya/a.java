package ya;

import a1.g;
public final class a {
    public final String f50558a;
    public final String f50559b;

    public a(String str, String str2) {
        this.f50558a = str;
        if (str2 != null) {
            this.f50559b = str2;
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
            if (this.f50558a.equals(aVar.f50558a) && this.f50559b.equals(aVar.f50559b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f50558a.hashCode() ^ 1000003) * 1000003) ^ this.f50559b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f50558a);
        sb2.append(", version=");
        return g.s(sb2, this.f50559b, "}");
    }
}
