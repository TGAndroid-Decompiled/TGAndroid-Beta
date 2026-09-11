package s5;
public final class b {
    public final long f45932a;
    public final l5.i f45933b;
    public final l5.h f45934c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f45932a = j3;
        this.f45933b = iVar;
        this.f45934c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f45932a == bVar.f45932a && this.f45933b.equals(bVar.f45933b) && this.f45934c.equals(bVar.f45934c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f45932a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f45933b.hashCode()) * 1000003) ^ this.f45934c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f45932a + ", transportContext=" + this.f45933b + ", event=" + this.f45934c + "}";
    }
}
