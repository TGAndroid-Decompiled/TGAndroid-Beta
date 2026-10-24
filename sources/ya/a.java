package ya;

import a1.g;
public final class a {
    public final String f50557a;
    public final String f50558b;

    public a(String str, String str2) {
        this.f50557a = str;
        if (str2 != null) {
            this.f50558b = str2;
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
            if (this.f50557a.equals(aVar.f50557a) && this.f50558b.equals(aVar.f50558b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f50557a.hashCode() ^ 1000003) * 1000003) ^ this.f50558b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f50557a);
        sb2.append(", version=");
        return g.s(sb2, this.f50558b, "}");
    }
}
