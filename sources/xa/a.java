package xa;
public final class a {
    public final String f45982a;
    public final String f45983b;

    public a(String str, String str2) {
        this.f45982a = str;
        if (str2 != null) {
            this.f45983b = str2;
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
            if (this.f45982a.equals(aVar.f45982a) && this.f45983b.equals(aVar.f45983b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f45982a.hashCode() ^ 1000003) * 1000003) ^ this.f45983b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f45982a);
        sb2.append(", version=");
        return a4.a.s(sb2, this.f45983b, "}");
    }
}
