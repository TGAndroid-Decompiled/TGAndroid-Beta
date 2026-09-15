package za;
public final class a0 {
    public final j0 f48743a;
    public final b f48744b;

    public a0(j0 j0Var, b bVar) {
        this.f48743a = j0Var;
        this.f48744b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a0) {
                a0 a0Var = (a0) obj;
                if (!this.f48743a.equals(a0Var.f48743a) || !this.f48744b.equals(a0Var.f48744b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f48743a.hashCode();
        return this.f48744b.hashCode() + ((hashCode + (k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + k.SESSION_START + ", sessionData=" + this.f48743a + ", applicationInfo=" + this.f48744b + ')';
    }
}
