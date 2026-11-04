package rd;
public final class e extends d {
    public static final e d = new d(1, 0, 1);

    @Override
    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f54497a == eVar.f54497a && this.f54498b == eVar.f54498b) {
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
        return (this.f54497a * 31) + this.f54498b;
    }

    @Override
    public final boolean isEmpty() {
        if (this.f54497a > this.f54498b) {
            return true;
        }
        return false;
    }

    @Override
    public final String toString() {
        return this.f54497a + ".." + this.f54498b;
    }
}
