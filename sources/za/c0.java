package za;
public final class c0 {
    public final l0 f49017a;
    public final b f49018b;

    public c0(l0 l0Var, b bVar) {
        this.f49017a = l0Var;
        this.f49018b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c0) {
                c0 c0Var = (c0) obj;
                if (!this.f49017a.equals(c0Var.f49017a) || !this.f49018b.equals(c0Var.f49018b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f49017a.hashCode();
        return this.f49018b.hashCode() + ((hashCode + (l.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + l.SESSION_START + ", sessionData=" + this.f49017a + ", applicationInfo=" + this.f49018b + ')';
    }
}
