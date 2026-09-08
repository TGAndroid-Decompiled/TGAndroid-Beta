package za;
public final class a0 {
    public final j0 f51413a;
    public final b f51414b;

    public a0(j0 j0Var, b bVar) {
        this.f51413a = j0Var;
        this.f51414b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a0) {
                a0 a0Var = (a0) obj;
                if (!this.f51413a.equals(a0Var.f51413a) || !this.f51414b.equals(a0Var.f51414b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f51413a.hashCode();
        return this.f51414b.hashCode() + ((hashCode + (k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + k.SESSION_START + ", sessionData=" + this.f51413a + ", applicationInfo=" + this.f51414b + ')';
    }
}
