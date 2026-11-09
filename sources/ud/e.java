package ud;
public final class e extends d {
    public static final e d = new d(1, 0, 1);

    @Override
    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f56531a == eVar.f56531a && this.f56532b == eVar.f56532b) {
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
        return (this.f56531a * 31) + this.f56532b;
    }

    @Override
    public final boolean isEmpty() {
        if (this.f56531a > this.f56532b) {
            return true;
        }
        return false;
    }

    @Override
    public final String toString() {
        return this.f56531a + ".." + this.f56532b;
    }
}
