package za;
public final class b0 {
    public final k0 f54314a;
    public final b f54315b;

    public b0(k0 k0Var, b bVar) {
        this.f54314a = k0Var;
        this.f54315b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b0) {
                b0 b0Var = (b0) obj;
                if (!this.f54314a.equals(b0Var.f54314a) || !this.f54315b.equals(b0Var.f54315b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f54314a.hashCode();
        return this.f54315b.hashCode() + ((hashCode + (l.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + l.SESSION_START + ", sessionData=" + this.f54314a + ", applicationInfo=" + this.f54315b + ')';
    }
}
