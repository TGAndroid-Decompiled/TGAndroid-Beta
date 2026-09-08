package ud;
public final class e extends d {
    public static final e d = new d(1, 0, 1);

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f47047a == eVar.f47047a && this.f47048b == eVar.f47048b) {
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
        return (this.f47047a * 31) + this.f47048b;
    }

    public final boolean isEmpty() {
        if (this.f47047a > this.f47048b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f47047a + ".." + this.f47048b;
    }
}
