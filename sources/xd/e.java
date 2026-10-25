package xd;
public final class e extends d {
    public static final e d = new d(1, 0, 1);

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f51730a == eVar.f51730a && this.f51731b == eVar.f51731b) {
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
        return (this.f51730a * 31) + this.f51731b;
    }

    public final boolean isEmpty() {
        if (this.f51730a > this.f51731b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f51730a + ".." + this.f51731b;
    }
}
