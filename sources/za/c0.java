package za;
public final class c0 {
    public final l0 f49027a;
    public final b f49028b;

    public c0(l0 l0Var, b bVar) {
        this.f49027a = l0Var;
        this.f49028b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c0) {
                c0 c0Var = (c0) obj;
                if (!this.f49027a.equals(c0Var.f49027a) || !this.f49028b.equals(c0Var.f49028b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f49027a.hashCode();
        return this.f49028b.hashCode() + ((hashCode + (l.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + l.SESSION_START + ", sessionData=" + this.f49027a + ", applicationInfo=" + this.f49028b + ')';
    }
}
