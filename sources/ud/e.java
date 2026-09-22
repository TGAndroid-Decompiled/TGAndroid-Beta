package ud;
public final class e extends d {
    public static final e d = new d(1, 0, 1);

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f43680a == eVar.f43680a && this.f43681b == eVar.f43681b) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f43680a * 31) + this.f43681b;
    }

    public final boolean isEmpty() {
        if (this.f43680a > this.f43681b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f43680a + ".." + this.f43681b;
    }
}
