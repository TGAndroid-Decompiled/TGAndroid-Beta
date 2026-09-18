package za;
public final class a0 {
    public final j0 f48771a;
    public final b f48772b;

    public a0(j0 j0Var, b bVar) {
        this.f48771a = j0Var;
        this.f48772b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a0) {
                a0 a0Var = (a0) obj;
                if (!this.f48771a.equals(a0Var.f48771a) || !this.f48772b.equals(a0Var.f48772b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f48771a.hashCode();
        return this.f48772b.hashCode() + ((hashCode + (k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + k.SESSION_START + ", sessionData=" + this.f48771a + ", applicationInfo=" + this.f48772b + ')';
    }
}
