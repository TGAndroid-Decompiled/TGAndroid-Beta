package xa;
public final class a {
    public final String f45995a;
    public final String f45996b;

    public a(String str, String str2) {
        this.f45995a = str;
        if (str2 != null) {
            this.f45996b = str2;
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
            if (this.f45995a.equals(aVar.f45995a) && this.f45996b.equals(aVar.f45996b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f45995a.hashCode() ^ 1000003) * 1000003) ^ this.f45996b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f45995a);
        sb2.append(", version=");
        return a4.a.t(sb2, this.f45996b, "}");
    }
}
