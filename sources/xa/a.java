package xa;
public final class a {
    public final String f46029a;
    public final String f46030b;

    public a(String str, String str2) {
        this.f46029a = str;
        if (str2 != null) {
            this.f46030b = str2;
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
            if (this.f46029a.equals(aVar.f46029a) && this.f46030b.equals(aVar.f46030b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46029a.hashCode() ^ 1000003) * 1000003) ^ this.f46030b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f46029a);
        sb2.append(", version=");
        return a4.a.s(sb2, this.f46030b, "}");
    }
}
