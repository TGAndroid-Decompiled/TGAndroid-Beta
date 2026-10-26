package xd;
public final class e extends d {
    public static final e d = new d(1, 0, 1);

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f51733a == eVar.f51733a && this.f51734b == eVar.f51734b) {
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
        return (this.f51733a * 31) + this.f51734b;
    }

    public final boolean isEmpty() {
        if (this.f51733a > this.f51734b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f51733a + ".." + this.f51734b;
    }
}
