package za;
public final class c0 {
    public final l0 f49136a;
    public final b f49137b;

    public c0(l0 l0Var, b bVar) {
        this.f49136a = l0Var;
        this.f49137b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c0) {
                c0 c0Var = (c0) obj;
                if (!this.f49136a.equals(c0Var.f49136a) || !this.f49137b.equals(c0Var.f49137b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f49136a.hashCode();
        return this.f49137b.hashCode() + ((hashCode + (l.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + l.SESSION_START + ", sessionData=" + this.f49136a + ", applicationInfo=" + this.f49137b + ')';
    }
}
