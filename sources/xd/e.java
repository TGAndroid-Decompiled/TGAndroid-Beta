package xd;
public final class e extends d {
    public static final e d = new d(1, 0, 1);

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f51791a == eVar.f51791a && this.f51792b == eVar.f51792b) {
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
        return (this.f51791a * 31) + this.f51792b;
    }

    public final boolean isEmpty() {
        if (this.f51791a > this.f51792b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f51791a + ".." + this.f51792b;
    }
}
