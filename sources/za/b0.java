package za;
public final class b0 {
    public final k0 f47865a;
    public final b f47866b;

    public b0(k0 k0Var, b bVar) {
        this.f47865a = k0Var;
        this.f47866b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b0) {
                b0 b0Var = (b0) obj;
                if (!this.f47865a.equals(b0Var.f47865a) || !this.f47866b.equals(b0Var.f47866b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f47865a.hashCode();
        return this.f47866b.hashCode() + ((hashCode + (k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + k.SESSION_START + ", sessionData=" + this.f47865a + ", applicationInfo=" + this.f47866b + ')';
    }
}
