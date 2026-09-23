package za;
public final class c0 {
    public final l0 f48700a;
    public final b f48701b;

    public c0(l0 l0Var, b bVar) {
        this.f48700a = l0Var;
        this.f48701b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c0) {
                c0 c0Var = (c0) obj;
                if (!this.f48700a.equals(c0Var.f48700a) || !this.f48701b.equals(c0Var.f48701b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f48700a.hashCode();
        return this.f48701b.hashCode() + ((hashCode + (l.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + l.SESSION_START + ", sessionData=" + this.f48700a + ", applicationInfo=" + this.f48701b + ')';
    }
}
