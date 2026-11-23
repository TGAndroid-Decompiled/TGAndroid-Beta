package qi;
public final class n {
    public final String f56318a;
    public final String f56319b;
    public final int f56320c;

    public n(String str, String str2) {
        this.f56318a = str;
        this.f56319b = str2;
        this.f56320c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!this.f56318a.equals(nVar.f56318a) || !this.f56319b.equals(nVar.f56319b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f56320c;
    }
}
