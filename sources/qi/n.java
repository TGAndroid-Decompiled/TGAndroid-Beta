package qi;
public final class n {
    public final String f56240a;
    public final String f56241b;
    public final int f56242c;

    public n(String str, String str2) {
        this.f56240a = str;
        this.f56241b = str2;
        this.f56242c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!this.f56240a.equals(nVar.f56240a) || !this.f56241b.equals(nVar.f56241b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f56242c;
    }
}
