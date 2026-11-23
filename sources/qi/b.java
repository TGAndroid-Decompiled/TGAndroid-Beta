package qi;
public final class b {
    public final String f56182a;
    public final String f56183b;

    public b(String str, String str2) {
        this.f56182a = str;
        this.f56183b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f56182a.equals(bVar.f56182a) || !this.f56183b.equals(bVar.f56183b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f56183b.hashCode() + (this.f56182a.hashCode() * 31);
    }
}
