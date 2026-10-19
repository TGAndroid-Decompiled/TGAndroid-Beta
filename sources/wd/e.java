package wd;
public final class e extends d {
    public static final e d = new d(1, 0, 1);

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f48922a == eVar.f48922a && this.f48923b == eVar.f48923b) {
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
        return (this.f48922a * 31) + this.f48923b;
    }

    public final boolean isEmpty() {
        if (this.f48922a > this.f48923b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f48922a + ".." + this.f48923b;
    }
}
