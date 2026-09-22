package xa;
public final class a {
    public final String f46050a;
    public final String f46051b;

    public a(String str, String str2) {
        this.f46050a = str;
        if (str2 != null) {
            this.f46051b = str2;
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
            if (this.f46050a.equals(aVar.f46050a) && this.f46051b.equals(aVar.f46051b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46050a.hashCode() ^ 1000003) * 1000003) ^ this.f46051b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f46050a);
        sb2.append(", version=");
        return a4.a.s(sb2, this.f46051b, "}");
    }
}
