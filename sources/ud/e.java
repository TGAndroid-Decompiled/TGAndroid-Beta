package ud;
public final class e extends d {
    public static final e d = new d(1, 0, 1);

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f43971a == eVar.f43971a && this.f43972b == eVar.f43972b) {
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
        return (this.f43971a * 31) + this.f43972b;
    }

    public final boolean isEmpty() {
        if (this.f43971a > this.f43972b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f43971a + ".." + this.f43972b;
    }
}
