package za;
public final class a0 {
    public final j0 f53081a;
    public final b f53082b;

    public a0(j0 j0Var, b bVar) {
        this.f53081a = j0Var;
        this.f53082b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a0) {
                a0 a0Var = (a0) obj;
                if (!this.f53081a.equals(a0Var.f53081a) || !this.f53082b.equals(a0Var.f53082b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f53081a.hashCode();
        return this.f53082b.hashCode() + ((hashCode + (k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + k.SESSION_START + ", sessionData=" + this.f53081a + ", applicationInfo=" + this.f53082b + ')';
    }
}
