package za;
public final class a0 {
    public final j0 f49063a;
    public final b f49064b;

    public a0(j0 j0Var, b bVar) {
        this.f49063a = j0Var;
        this.f49064b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a0) {
                a0 a0Var = (a0) obj;
                if (!this.f49063a.equals(a0Var.f49063a) || !this.f49064b.equals(a0Var.f49064b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f49063a.hashCode();
        return this.f49064b.hashCode() + ((hashCode + (k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + k.SESSION_START + ", sessionData=" + this.f49063a + ", applicationInfo=" + this.f49064b + ')';
    }
}
