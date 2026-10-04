package xa;
public final class a {
    public final String f49815a;
    public final String f49816b;

    public a(String str, String str2) {
        this.f49815a = str;
        if (str2 != null) {
            this.f49816b = str2;
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
            if (this.f49815a.equals(aVar.f49815a) && this.f49816b.equals(aVar.f49816b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f49815a.hashCode() ^ 1000003) * 1000003) ^ this.f49816b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f49815a);
        sb2.append(", version=");
        return a4.a.t(sb2, this.f49816b, "}");
    }
}
