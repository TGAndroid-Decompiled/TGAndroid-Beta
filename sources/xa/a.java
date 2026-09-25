package xa;
public final class a {
    public final String f46010a;
    public final String f46011b;

    public a(String str, String str2) {
        this.f46010a = str;
        if (str2 != null) {
            this.f46011b = str2;
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
            if (this.f46010a.equals(aVar.f46010a) && this.f46011b.equals(aVar.f46011b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46010a.hashCode() ^ 1000003) * 1000003) ^ this.f46011b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f46010a);
        sb2.append(", version=");
        return a4.a.t(sb2, this.f46011b, "}");
    }
}
