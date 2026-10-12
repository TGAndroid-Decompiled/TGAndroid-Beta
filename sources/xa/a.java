package xa;

import a1.g;
public final class a {
    public final String f51329a;
    public final String f51330b;

    public a(String str, String str2) {
        this.f51329a = str;
        if (str2 != null) {
            this.f51330b = str2;
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
            if (this.f51329a.equals(aVar.f51329a) && this.f51330b.equals(aVar.f51330b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f51329a.hashCode() ^ 1000003) * 1000003) ^ this.f51330b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f51329a);
        sb2.append(", version=");
        return g.t(sb2, this.f51330b, "}");
    }
}
