package xa;
public final class a {
    public final String f46055a;
    public final String f46056b;

    public a(String str, String str2) {
        this.f46055a = str;
        if (str2 != null) {
            this.f46056b = str2;
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
            if (this.f46055a.equals(aVar.f46055a) && this.f46056b.equals(aVar.f46056b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46055a.hashCode() ^ 1000003) * 1000003) ^ this.f46056b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f46055a);
        sb2.append(", version=");
        return a4.a.s(sb2, this.f46056b, "}");
    }
}
