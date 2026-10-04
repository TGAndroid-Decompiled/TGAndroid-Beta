package za;
public final class a0 {
    public final j0 f53055a;
    public final b f53056b;

    public a0(j0 j0Var, b bVar) {
        this.f53055a = j0Var;
        this.f53056b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a0) {
                a0 a0Var = (a0) obj;
                if (!this.f53055a.equals(a0Var.f53055a) || !this.f53056b.equals(a0Var.f53056b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f53055a.hashCode();
        return this.f53056b.hashCode() + ((hashCode + (k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + k.SESSION_START + ", sessionData=" + this.f53055a + ", applicationInfo=" + this.f53056b + ')';
    }
}
