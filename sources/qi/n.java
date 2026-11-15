package qi;
public final class n {
    public final String f55621a;
    public final String f55622b;
    public final int f55623c;

    public n(String str, String str2) {
        this.f55621a = str;
        this.f55622b = str2;
        this.f55623c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!this.f55621a.equals(nVar.f55621a) || !this.f55622b.equals(nVar.f55622b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f55623c;
    }
}
