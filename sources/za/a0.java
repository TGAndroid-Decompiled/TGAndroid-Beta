package za;
public final class a0 {
    public final j0 f51414a;
    public final b f51415b;

    public a0(j0 j0Var, b bVar) {
        this.f51414a = j0Var;
        this.f51415b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a0) {
                a0 a0Var = (a0) obj;
                if (!this.f51414a.equals(a0Var.f51414a) || !this.f51415b.equals(a0Var.f51415b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f51414a.hashCode();
        return this.f51415b.hashCode() + ((hashCode + (k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + k.SESSION_START + ", sessionData=" + this.f51414a + ", applicationInfo=" + this.f51415b + ')';
    }
}
