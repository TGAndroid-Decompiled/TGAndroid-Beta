package ud;
public final class e extends d {
    public static final e d = new d(1, 0, 1);

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f44077a == eVar.f44077a && this.f44078b == eVar.f44078b) {
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
        return (this.f44077a * 31) + this.f44078b;
    }

    public final boolean isEmpty() {
        if (this.f44077a > this.f44078b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f44077a + ".." + this.f44078b;
    }
}
