package qi;
public final class b {
    public final String f56217a;
    public final String f56218b;

    public b(String str, String str2) {
        this.f56217a = str;
        this.f56218b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f56217a.equals(bVar.f56217a) || !this.f56218b.equals(bVar.f56218b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f56218b.hashCode() + (this.f56217a.hashCode() * 31);
    }
}
