package za;
public final class c0 {
    public final l0 f49028a;
    public final b f49029b;

    public c0(l0 l0Var, b bVar) {
        this.f49028a = l0Var;
        this.f49029b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c0) {
                c0 c0Var = (c0) obj;
                if (!this.f49028a.equals(c0Var.f49028a) || !this.f49029b.equals(c0Var.f49029b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f49028a.hashCode();
        return this.f49029b.hashCode() + ((hashCode + (l.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + l.SESSION_START + ", sessionData=" + this.f49028a + ", applicationInfo=" + this.f49029b + ')';
    }
}
