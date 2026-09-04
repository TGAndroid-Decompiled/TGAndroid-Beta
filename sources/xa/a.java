package xa;
public final class a {
    public final String f49325a;
    public final String f49326b;

    public a(String str, String str2) {
        this.f49325a = str;
        if (str2 != null) {
            this.f49326b = str2;
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
            if (this.f49325a.equals(aVar.f49325a) && this.f49326b.equals(aVar.f49326b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f49325a.hashCode() ^ 1000003) * 1000003) ^ this.f49326b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f49325a);
        sb2.append(", version=");
        return a4.a.s(sb2, this.f49326b, "}");
    }
}
