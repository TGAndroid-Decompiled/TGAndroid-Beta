package ya;

import a1.g;
public final class a {
    public final String f48726a;
    public final String f48727b;

    public a(String str, String str2) {
        this.f48726a = str;
        if (str2 != null) {
            this.f48727b = str2;
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
            if (this.f48726a.equals(aVar.f48726a) && this.f48727b.equals(aVar.f48727b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f48726a.hashCode() ^ 1000003) * 1000003) ^ this.f48727b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f48726a);
        sb2.append(", version=");
        return g.s(sb2, this.f48727b, "}");
    }
}
