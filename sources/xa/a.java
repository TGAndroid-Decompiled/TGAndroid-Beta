package xa;
public final class a {
    public final String f46009a;
    public final String f46010b;

    public a(String str, String str2) {
        this.f46009a = str;
        if (str2 != null) {
            this.f46010b = str2;
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
            if (this.f46009a.equals(aVar.f46009a) && this.f46010b.equals(aVar.f46010b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46009a.hashCode() ^ 1000003) * 1000003) ^ this.f46010b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f46009a);
        sb2.append(", version=");
        return a4.a.t(sb2, this.f46010b, "}");
    }
}
