package ud;
public final class e extends d {
    public static final e d = new d(1, 0, 1);

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f47618a == eVar.f47618a && this.f47619b == eVar.f47619b) {
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
        return (this.f47618a * 31) + this.f47619b;
    }

    public final boolean isEmpty() {
        if (this.f47618a > this.f47619b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f47618a + ".." + this.f47619b;
    }
}
