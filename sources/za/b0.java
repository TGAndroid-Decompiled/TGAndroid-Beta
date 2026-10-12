package za;
public final class b0 {
    public final k0 f54417a;
    public final b f54418b;

    public b0(k0 k0Var, b bVar) {
        this.f54417a = k0Var;
        this.f54418b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b0) {
                b0 b0Var = (b0) obj;
                if (!this.f54417a.equals(b0Var.f54417a) || !this.f54418b.equals(b0Var.f54418b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f54417a.hashCode();
        return this.f54418b.hashCode() + ((hashCode + (l.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + l.SESSION_START + ", sessionData=" + this.f54417a + ", applicationInfo=" + this.f54418b + ')';
    }
}
