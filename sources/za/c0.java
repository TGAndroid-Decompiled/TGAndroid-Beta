package za;
public final class c0 {
    public final l0 f49029a;
    public final b f49030b;

    public c0(l0 l0Var, b bVar) {
        this.f49029a = l0Var;
        this.f49030b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c0) {
                c0 c0Var = (c0) obj;
                if (!this.f49029a.equals(c0Var.f49029a) || !this.f49030b.equals(c0Var.f49030b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f49029a.hashCode();
        return this.f49030b.hashCode() + ((hashCode + (l.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + l.SESSION_START + ", sessionData=" + this.f49029a + ", applicationInfo=" + this.f49030b + ')';
    }
}
