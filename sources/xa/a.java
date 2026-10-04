package xa;
public final class a {
    public final String f49807a;
    public final String f49808b;

    public a(String str, String str2) {
        this.f49807a = str;
        if (str2 != null) {
            this.f49808b = str2;
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
            if (this.f49807a.equals(aVar.f49807a) && this.f49808b.equals(aVar.f49808b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f49807a.hashCode() ^ 1000003) * 1000003) ^ this.f49808b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f49807a);
        sb2.append(", version=");
        return a4.a.s(sb2, this.f49808b, "}");
    }
}
