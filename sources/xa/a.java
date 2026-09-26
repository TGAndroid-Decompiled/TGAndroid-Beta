package xa;
public final class a {
    public final String f46008a;
    public final String f46009b;

    public a(String str, String str2) {
        this.f46008a = str;
        if (str2 != null) {
            this.f46009b = str2;
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
            if (this.f46008a.equals(aVar.f46008a) && this.f46009b.equals(aVar.f46009b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46008a.hashCode() ^ 1000003) * 1000003) ^ this.f46009b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f46008a);
        sb2.append(", version=");
        return a4.a.t(sb2, this.f46009b, "}");
    }
}
