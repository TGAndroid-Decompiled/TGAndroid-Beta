package xa;
public final class a {
    public final String f45681a;
    public final String f45682b;

    public a(String str, String str2) {
        this.f45681a = str;
        if (str2 != null) {
            this.f45682b = str2;
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
            if (this.f45681a.equals(aVar.f45681a) && this.f45682b.equals(aVar.f45682b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f45681a.hashCode() ^ 1000003) * 1000003) ^ this.f45682b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f45681a);
        sb2.append(", version=");
        return a4.a.t(sb2, this.f45682b, "}");
    }
}
