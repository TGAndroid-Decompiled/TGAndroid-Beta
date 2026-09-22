package za;
public final class a0 {
    public final j0 f48736a;
    public final b f48737b;

    public a0(j0 j0Var, b bVar) {
        this.f48736a = j0Var;
        this.f48737b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a0) {
                a0 a0Var = (a0) obj;
                if (!this.f48736a.equals(a0Var.f48736a) || !this.f48737b.equals(a0Var.f48737b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f48736a.hashCode();
        return this.f48737b.hashCode() + ((hashCode + (k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + k.SESSION_START + ", sessionData=" + this.f48736a + ", applicationInfo=" + this.f48737b + ')';
    }
}
