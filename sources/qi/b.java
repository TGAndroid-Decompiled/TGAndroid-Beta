package qi;
public final class b {
    public final String f55598a;
    public final String f55599b;

    public b(String str, String str2) {
        this.f55598a = str;
        this.f55599b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f55598a.equals(bVar.f55598a) || !this.f55599b.equals(bVar.f55599b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f55599b.hashCode() + (this.f55598a.hashCode() * 31);
    }
}
