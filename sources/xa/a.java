package xa;
public final class a {
    public final String f46117a;
    public final String f46118b;

    public a(String str, String str2) {
        this.f46117a = str;
        if (str2 != null) {
            this.f46118b = str2;
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
            if (this.f46117a.equals(aVar.f46117a) && this.f46118b.equals(aVar.f46118b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46117a.hashCode() ^ 1000003) * 1000003) ^ this.f46118b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f46117a);
        sb2.append(", version=");
        return a4.a.t(sb2, this.f46118b, "}");
    }
}
