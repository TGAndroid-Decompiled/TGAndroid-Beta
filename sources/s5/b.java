package s5;
public final class b {
    public final long f45933a;
    public final l5.i f45934b;
    public final l5.h f45935c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f45933a = j3;
        this.f45934b = iVar;
        this.f45935c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f45933a == bVar.f45933a && this.f45934b.equals(bVar.f45934b) && this.f45935c.equals(bVar.f45935c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f45933a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f45934b.hashCode()) * 1000003) ^ this.f45935c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f45933a + ", transportContext=" + this.f45934b + ", event=" + this.f45935c + "}";
    }
}
