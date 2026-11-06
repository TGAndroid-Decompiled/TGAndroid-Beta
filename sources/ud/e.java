package ud;
public final class e extends d {
    public static final e d = new d(1, 0, 1);

    @Override
    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f56402a == eVar.f56402a && this.f56403b == eVar.f56403b) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f56402a * 31) + this.f56403b;
    }

    @Override
    public final boolean isEmpty() {
        if (this.f56402a > this.f56403b) {
            return true;
        }
        return false;
    }

    @Override
    public final String toString() {
        return this.f56402a + ".." + this.f56403b;
    }
}
