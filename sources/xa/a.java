package xa;
public final class a {
    public final String f49354a;
    public final String f49355b;

    public a(String str, String str2) {
        this.f49354a = str;
        if (str2 != null) {
            this.f49355b = str2;
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
            if (this.f49354a.equals(aVar.f49354a) && this.f49355b.equals(aVar.f49355b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f49354a.hashCode() ^ 1000003) * 1000003) ^ this.f49355b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f49354a);
        sb2.append(", version=");
        return a4.a.s(sb2, this.f49355b, "}");
    }
}
