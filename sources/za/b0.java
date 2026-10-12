package za;
public final class b0 {
    public final k0 f54425a;
    public final b f54426b;

    public b0(k0 k0Var, b bVar) {
        this.f54425a = k0Var;
        this.f54426b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b0) {
                b0 b0Var = (b0) obj;
                if (!this.f54425a.equals(b0Var.f54425a) || !this.f54426b.equals(b0Var.f54426b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f54425a.hashCode();
        return this.f54426b.hashCode() + ((hashCode + (l.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + l.SESSION_START + ", sessionData=" + this.f54425a + ", applicationInfo=" + this.f54426b + ')';
    }
}
