package za;
public final class a0 {
    public final j0 f49043a;
    public final b f49044b;

    public a0(j0 j0Var, b bVar) {
        this.f49043a = j0Var;
        this.f49044b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a0) {
                a0 a0Var = (a0) obj;
                if (!this.f49043a.equals(a0Var.f49043a) || !this.f49044b.equals(a0Var.f49044b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f49043a.hashCode();
        return this.f49044b.hashCode() + ((hashCode + (k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + k.SESSION_START + ", sessionData=" + this.f49043a + ", applicationInfo=" + this.f49044b + ')';
    }
}
