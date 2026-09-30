package xa;
public final class a {
    public final String f46011a;
    public final String f46012b;

    public a(String str, String str2) {
        this.f46011a = str;
        if (str2 != null) {
            this.f46012b = str2;
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
            if (this.f46011a.equals(aVar.f46011a) && this.f46012b.equals(aVar.f46012b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46011a.hashCode() ^ 1000003) * 1000003) ^ this.f46012b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f46011a);
        sb2.append(", version=");
        return a4.a.t(sb2, this.f46012b, "}");
    }
}
