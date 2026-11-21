package qi;
public final class n {
    public final String f56236a;
    public final String f56237b;
    public final int f56238c;

    public n(String str, String str2) {
        this.f56236a = str;
        this.f56237b = str2;
        this.f56238c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!this.f56236a.equals(nVar.f56236a) || !this.f56237b.equals(nVar.f56237b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f56238c;
    }
}
