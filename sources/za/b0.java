package za;
public final class b0 {
    public final k0 f54280a;
    public final b f54281b;

    public b0(k0 k0Var, b bVar) {
        this.f54280a = k0Var;
        this.f54281b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b0) {
                b0 b0Var = (b0) obj;
                if (!this.f54280a.equals(b0Var.f54280a) || !this.f54281b.equals(b0Var.f54281b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f54280a.hashCode();
        return this.f54281b.hashCode() + ((hashCode + (l.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + l.SESSION_START + ", sessionData=" + this.f54280a + ", applicationInfo=" + this.f54281b + ')';
    }
}
