package xa;

import a1.g;
public final class a {
    public final String f51188a;
    public final String f51189b;

    public a(String str, String str2) {
        this.f51188a = str;
        if (str2 != null) {
            this.f51189b = str2;
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
            if (this.f51188a.equals(aVar.f51188a) && this.f51189b.equals(aVar.f51189b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f51188a.hashCode() ^ 1000003) * 1000003) ^ this.f51189b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f51188a);
        sb2.append(", version=");
        return g.t(sb2, this.f51189b, "}");
    }
}
