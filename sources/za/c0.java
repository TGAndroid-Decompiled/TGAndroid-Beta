package za;
public final class c0 {
    public final l0 f49030a;
    public final b f49031b;

    public c0(l0 l0Var, b bVar) {
        this.f49030a = l0Var;
        this.f49031b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c0) {
                c0 c0Var = (c0) obj;
                if (!this.f49030a.equals(c0Var.f49030a) || !this.f49031b.equals(c0Var.f49031b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f49030a.hashCode();
        return this.f49031b.hashCode() + ((hashCode + (l.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + l.SESSION_START + ", sessionData=" + this.f49030a + ", applicationInfo=" + this.f49031b + ')';
    }
}
