package qi;
public final class b {
    public final String f56213a;
    public final String f56214b;

    public b(String str, String str2) {
        this.f56213a = str;
        this.f56214b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f56213a.equals(bVar.f56213a) || !this.f56214b.equals(bVar.f56214b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f56214b.hashCode() + (this.f56213a.hashCode() * 31);
    }
}
