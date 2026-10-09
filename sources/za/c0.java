package za;
public final class c0 {
    public final l0 f54202a;
    public final b f54203b;

    public c0(l0 l0Var, b bVar) {
        this.f54202a = l0Var;
        this.f54203b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c0) {
                c0 c0Var = (c0) obj;
                if (!this.f54202a.equals(c0Var.f54202a) || !this.f54203b.equals(c0Var.f54203b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f54202a.hashCode();
        return this.f54203b.hashCode() + ((hashCode + (l.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + l.SESSION_START + ", sessionData=" + this.f54202a + ", applicationInfo=" + this.f54203b + ')';
    }
}
