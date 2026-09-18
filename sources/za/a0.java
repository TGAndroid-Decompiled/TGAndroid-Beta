package za;
public final class a0 {
    public final j0 f48997a;
    public final b f48998b;

    public a0(j0 j0Var, b bVar) {
        this.f48997a = j0Var;
        this.f48998b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a0) {
                a0 a0Var = (a0) obj;
                if (!this.f48997a.equals(a0Var.f48997a) || !this.f48998b.equals(a0Var.f48998b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f48997a.hashCode();
        return this.f48998b.hashCode() + ((hashCode + (k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + k.SESSION_START + ", sessionData=" + this.f48997a + ", applicationInfo=" + this.f48998b + ')';
    }
}
