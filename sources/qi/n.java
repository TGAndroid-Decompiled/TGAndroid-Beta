package qi;
public final class n {
    public final String f56205a;
    public final String f56206b;
    public final int f56207c;

    public n(String str, String str2) {
        this.f56205a = str;
        this.f56206b = str2;
        this.f56207c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!this.f56205a.equals(nVar.f56205a) || !this.f56206b.equals(nVar.f56206b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f56207c;
    }
}
