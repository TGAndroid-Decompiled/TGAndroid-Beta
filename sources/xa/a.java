package xa;
public final class a {
    public final String f49326a;
    public final String f49327b;

    public a(String str, String str2) {
        this.f49326a = str;
        if (str2 != null) {
            this.f49327b = str2;
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
            if (this.f49326a.equals(aVar.f49326a) && this.f49327b.equals(aVar.f49327b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f49326a.hashCode() ^ 1000003) * 1000003) ^ this.f49327b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f49326a);
        sb2.append(", version=");
        return a4.a.s(sb2, this.f49327b, "}");
    }
}
