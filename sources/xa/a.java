package xa;
public final class a {
    public final String f45071a;
    public final String f45072b;

    public a(String str, String str2) {
        this.f45071a = str;
        if (str2 != null) {
            this.f45072b = str2;
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
            if (this.f45071a.equals(aVar.f45071a) && this.f45072b.equals(aVar.f45072b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f45071a.hashCode() ^ 1000003) * 1000003) ^ this.f45072b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f45071a);
        sb2.append(", version=");
        return a4.a.s(sb2, this.f45072b, "}");
    }
}
