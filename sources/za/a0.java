package za;
public final class a0 {
    public final j0 f51382a;
    public final b f51383b;

    public a0(j0 j0Var, b bVar) {
        this.f51382a = j0Var;
        this.f51383b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a0) {
                a0 a0Var = (a0) obj;
                if (!this.f51382a.equals(a0Var.f51382a) || !this.f51383b.equals(a0Var.f51383b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f51382a.hashCode();
        return this.f51383b.hashCode() + ((hashCode + (k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + k.SESSION_START + ", sessionData=" + this.f51382a + ", applicationInfo=" + this.f51383b + ')';
    }
}
