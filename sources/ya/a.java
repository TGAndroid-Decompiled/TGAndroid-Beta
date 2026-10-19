package ya;

import a1.g;
public final class a {
    public final String f50107a;
    public final String f50108b;

    public a(String str, String str2) {
        this.f50107a = str;
        if (str2 != null) {
            this.f50108b = str2;
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
            if (this.f50107a.equals(aVar.f50107a) && this.f50108b.equals(aVar.f50108b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f50107a.hashCode() ^ 1000003) * 1000003) ^ this.f50108b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f50107a);
        sb2.append(", version=");
        return g.s(sb2, this.f50108b, "}");
    }
}
