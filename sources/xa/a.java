package xa;
public final class a {
    public final String f45727a;
    public final String f45728b;

    public a(String str, String str2) {
        this.f45727a = str;
        if (str2 != null) {
            this.f45728b = str2;
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
            if (this.f45727a.equals(aVar.f45727a) && this.f45728b.equals(aVar.f45728b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f45727a.hashCode() ^ 1000003) * 1000003) ^ this.f45728b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f45727a);
        sb2.append(", version=");
        return a4.a.t(sb2, this.f45728b, "}");
    }
}
