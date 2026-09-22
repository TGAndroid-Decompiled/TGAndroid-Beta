package ud;
public final class e extends d {
    public static final e d = new d(1, 0, 1);

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f44007a == eVar.f44007a && this.f44008b == eVar.f44008b) {
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
        return (this.f44007a * 31) + this.f44008b;
    }

    public final boolean isEmpty() {
        if (this.f44007a > this.f44008b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f44007a + ".." + this.f44008b;
    }
}
