package za;
public final class a0 {
    public final j0 f48766a;
    public final b f48767b;

    public a0(j0 j0Var, b bVar) {
        this.f48766a = j0Var;
        this.f48767b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a0) {
                a0 a0Var = (a0) obj;
                if (!this.f48766a.equals(a0Var.f48766a) || !this.f48767b.equals(a0Var.f48767b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f48766a.hashCode();
        return this.f48767b.hashCode() + ((hashCode + (k.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + k.SESSION_START + ", sessionData=" + this.f48766a + ", applicationInfo=" + this.f48767b + ')';
    }
}
