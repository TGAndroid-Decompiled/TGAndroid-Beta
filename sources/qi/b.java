package qi;
public final class b {
    public final String f56295a;
    public final String f56296b;

    public b(String str, String str2) {
        this.f56295a = str;
        this.f56296b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f56295a.equals(bVar.f56295a) || !this.f56296b.equals(bVar.f56296b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f56296b.hashCode() + (this.f56295a.hashCode() * 31);
    }
}
