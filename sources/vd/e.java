package vd;
public final class e extends d {
    public static final e d = new d(1, 0, 1);

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f49665a == eVar.f49665a && this.f49666b == eVar.f49666b) {
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
        return (this.f49665a * 31) + this.f49666b;
    }

    public final boolean isEmpty() {
        if (this.f49665a > this.f49666b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f49665a + ".." + this.f49666b;
    }
}
