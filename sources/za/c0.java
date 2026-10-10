package za;
public final class c0 {
    public final l0 f54246a;
    public final b f54247b;

    public c0(l0 l0Var, b bVar) {
        this.f54246a = l0Var;
        this.f54247b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c0) {
                c0 c0Var = (c0) obj;
                if (!this.f54246a.equals(c0Var.f54246a) || !this.f54247b.equals(c0Var.f54247b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f54246a.hashCode();
        return this.f54247b.hashCode() + ((hashCode + (l.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + l.SESSION_START + ", sessionData=" + this.f54246a + ", applicationInfo=" + this.f54247b + ')';
    }
}
