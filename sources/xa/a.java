package xa;
public final class a {
    public final String f49355a;
    public final String f49356b;

    public a(String str, String str2) {
        this.f49355a = str;
        if (str2 != null) {
            this.f49356b = str2;
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
            if (this.f49355a.equals(aVar.f49355a) && this.f49356b.equals(aVar.f49356b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f49355a.hashCode() ^ 1000003) * 1000003) ^ this.f49356b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f49355a);
        sb2.append(", version=");
        return a4.a.s(sb2, this.f49356b, "}");
    }
}
