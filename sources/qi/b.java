package qi;
public final class b {
    public final String f56172a;
    public final String f56173b;

    public b(String str, String str2) {
        this.f56172a = str;
        this.f56173b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f56172a.equals(bVar.f56172a) || !this.f56173b.equals(bVar.f56173b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f56173b.hashCode() + (this.f56172a.hashCode() * 31);
    }
}
