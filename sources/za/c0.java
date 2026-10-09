package za;
public final class c0 {
    public final l0 f54200a;
    public final b f54201b;

    public c0(l0 l0Var, b bVar) {
        this.f54200a = l0Var;
        this.f54201b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c0) {
                c0 c0Var = (c0) obj;
                if (!this.f54200a.equals(c0Var.f54200a) || !this.f54201b.equals(c0Var.f54201b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f54200a.hashCode();
        return this.f54201b.hashCode() + ((hashCode + (l.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + l.SESSION_START + ", sessionData=" + this.f54200a + ", applicationInfo=" + this.f54201b + ')';
    }
}
