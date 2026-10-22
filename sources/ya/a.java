package ya;

import a1.g;
public final class a {
    public final String f50117a;
    public final String f50118b;

    public a(String str, String str2) {
        this.f50117a = str;
        if (str2 != null) {
            this.f50118b = str2;
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
            if (this.f50117a.equals(aVar.f50117a) && this.f50118b.equals(aVar.f50118b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f50117a.hashCode() ^ 1000003) * 1000003) ^ this.f50118b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f50117a);
        sb2.append(", version=");
        return g.s(sb2, this.f50118b, "}");
    }
}
