package ud;
public final class e extends d {
    public static final e d = new d(1, 0, 1);

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f44012a == eVar.f44012a && this.f44013b == eVar.f44013b) {
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
        return (this.f44012a * 31) + this.f44013b;
    }

    public final boolean isEmpty() {
        if (this.f44012a > this.f44013b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f44012a + ".." + this.f44013b;
    }
}
