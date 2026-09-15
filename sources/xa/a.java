package xa;
public final class a {
    public final String f45731a;
    public final String f45732b;

    public a(String str, String str2) {
        this.f45731a = str;
        if (str2 != null) {
            this.f45732b = str2;
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
            if (this.f45731a.equals(aVar.f45731a) && this.f45732b.equals(aVar.f45732b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f45731a.hashCode() ^ 1000003) * 1000003) ^ this.f45732b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f45731a);
        sb2.append(", version=");
        return a4.a.s(sb2, this.f45732b, "}");
    }
}
