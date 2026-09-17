package za;
public final class a0 {
    public final j0 f51383a;
    public final b f51384b;

    public a0(j0 j0Var, b bVar) {
        this.f51383a = j0Var;
        this.f51384b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a0) {
                a0 a0Var = (a0) obj;
                if (!this.f51383a.equals(a0Var.f51383a) || !this.f51384b.equals(a0Var.f51384b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f51383a.hashCode();
        return this.f51384b.hashCode() + ((hashCode + (k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + k.SESSION_START + ", sessionData=" + this.f51383a + ", applicationInfo=" + this.f51384b + ')';
    }
}
