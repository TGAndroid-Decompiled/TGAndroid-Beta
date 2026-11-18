package qi;
public final class n {
    public final String f56195a;
    public final String f56196b;
    public final int f56197c;

    public n(String str, String str2) {
        this.f56195a = str;
        this.f56196b = str2;
        this.f56197c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!this.f56195a.equals(nVar.f56195a) || !this.f56196b.equals(nVar.f56196b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f56197c;
    }
}
