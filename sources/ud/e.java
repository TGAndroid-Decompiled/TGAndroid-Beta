package ud;
public final class e extends d {
    public static final e d = new d(1, 0, 1);

    @Override
    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f56530a == eVar.f56530a && this.f56531b == eVar.f56531b) {
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
        return (this.f56530a * 31) + this.f56531b;
    }

    @Override
    public final boolean isEmpty() {
        if (this.f56530a > this.f56531b) {
            return true;
        }
        return false;
    }

    @Override
    public final String toString() {
        return this.f56530a + ".." + this.f56531b;
    }
}
