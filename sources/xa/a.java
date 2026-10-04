package xa;
public final class a {
    public final String f49806a;
    public final String f49807b;

    public a(String str, String str2) {
        this.f49806a = str;
        if (str2 != null) {
            this.f49807b = str2;
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
            if (this.f49806a.equals(aVar.f49806a) && this.f49807b.equals(aVar.f49807b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f49806a.hashCode() ^ 1000003) * 1000003) ^ this.f49807b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f49806a);
        sb2.append(", version=");
        return a4.a.s(sb2, this.f49807b, "}");
    }
}
