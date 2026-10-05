package xa;
public final class a {
    public final String f49822a;
    public final String f49823b;

    public a(String str, String str2) {
        this.f49822a = str;
        if (str2 != null) {
            this.f49823b = str2;
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
            if (this.f49822a.equals(aVar.f49822a) && this.f49823b.equals(aVar.f49823b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f49822a.hashCode() ^ 1000003) * 1000003) ^ this.f49823b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f49822a);
        sb2.append(", version=");
        return a4.a.t(sb2, this.f49823b, "}");
    }
}
