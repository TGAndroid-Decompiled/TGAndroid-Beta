package za;
public final class a0 {
    public final j0 f53054a;
    public final b f53055b;

    public a0(j0 j0Var, b bVar) {
        this.f53054a = j0Var;
        this.f53055b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a0) {
                a0 a0Var = (a0) obj;
                if (!this.f53054a.equals(a0Var.f53054a) || !this.f53055b.equals(a0Var.f53055b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f53054a.hashCode();
        return this.f53055b.hashCode() + ((hashCode + (k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + k.SESSION_START + ", sessionData=" + this.f53054a + ", applicationInfo=" + this.f53055b + ')';
    }
}
