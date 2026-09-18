package xa;
public final class a {
    public final String f45759a;
    public final String f45760b;

    public a(String str, String str2) {
        this.f45759a = str;
        if (str2 != null) {
            this.f45760b = str2;
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
            if (this.f45759a.equals(aVar.f45759a) && this.f45760b.equals(aVar.f45760b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f45759a.hashCode() ^ 1000003) * 1000003) ^ this.f45760b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f45759a);
        sb2.append(", version=");
        return a4.a.s(sb2, this.f45760b, "}");
    }
}
