package xa;

import a1.g;
public final class a {
    public final String f51098a;
    public final String f51099b;

    public a(String str, String str2) {
        this.f51098a = str;
        if (str2 != null) {
            this.f51099b = str2;
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
            if (this.f51098a.equals(aVar.f51098a) && this.f51099b.equals(aVar.f51099b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f51098a.hashCode() ^ 1000003) * 1000003) ^ this.f51099b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f51098a);
        sb2.append(", version=");
        return g.t(sb2, this.f51099b, "}");
    }
}
