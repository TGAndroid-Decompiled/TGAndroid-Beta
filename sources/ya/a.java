package ya;

import a1.g;
public final class a {
    public final String f50130a;
    public final String f50131b;

    public a(String str, String str2) {
        this.f50130a = str;
        if (str2 != null) {
            this.f50131b = str2;
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
            if (this.f50130a.equals(aVar.f50130a) && this.f50131b.equals(aVar.f50131b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f50130a.hashCode() ^ 1000003) * 1000003) ^ this.f50131b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f50130a);
        sb2.append(", version=");
        return g.s(sb2, this.f50131b, "}");
    }
}
