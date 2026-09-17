package xa;
public final class a {
    public final String f45754a;
    public final String f45755b;

    public a(String str, String str2) {
        this.f45754a = str;
        if (str2 != null) {
            this.f45755b = str2;
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
            if (this.f45754a.equals(aVar.f45754a) && this.f45755b.equals(aVar.f45755b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f45754a.hashCode() ^ 1000003) * 1000003) ^ this.f45755b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f45754a);
        sb2.append(", version=");
        return a4.a.s(sb2, this.f45755b, "}");
    }
}
