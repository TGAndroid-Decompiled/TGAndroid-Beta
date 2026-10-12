package wd;
public final class e extends d {
    public static final e d = new d(1, 0, 1);

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f47537a == eVar.f47537a && this.f47538b == eVar.f47538b) {
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
        return (this.f47537a * 31) + this.f47538b;
    }

    public final boolean isEmpty() {
        if (this.f47537a > this.f47538b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f47537a + ".." + this.f47538b;
    }
}
