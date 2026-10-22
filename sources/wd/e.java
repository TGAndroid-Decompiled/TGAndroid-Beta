package wd;
public final class e extends d {
    public static final e d = new d(1, 0, 1);

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f48932a == eVar.f48932a && this.f48933b == eVar.f48933b) {
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
        return (this.f48932a * 31) + this.f48933b;
    }

    public final boolean isEmpty() {
        if (this.f48932a > this.f48933b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f48932a + ".." + this.f48933b;
    }
}
