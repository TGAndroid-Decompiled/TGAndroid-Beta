package vd;
public final class e extends d {
    public static final e d = new d(1, 0, 1);

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f49544a == eVar.f49544a && this.f49545b == eVar.f49545b) {
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
        return (this.f49544a * 31) + this.f49545b;
    }

    public final boolean isEmpty() {
        if (this.f49544a > this.f49545b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f49544a + ".." + this.f49545b;
    }
}
