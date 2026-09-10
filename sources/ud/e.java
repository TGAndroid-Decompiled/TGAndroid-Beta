package ud;
public final class e extends d {
    public static final e d = new d(1, 0, 1);

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f42655a == eVar.f42655a && this.f42656b == eVar.f42656b) {
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
        return (this.f42655a * 31) + this.f42656b;
    }

    public final boolean isEmpty() {
        if (this.f42655a > this.f42656b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f42655a + ".." + this.f42656b;
    }
}
