package v5;
public final class b {
    public final long f59277a;
    public final o5.i f59278b;
    public final o5.h f59279c;

    public b(long j3, o5.i iVar, o5.h hVar) {
        this.f59277a = j3;
        this.f59278b = iVar;
        this.f59279c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f59277a == bVar.f59277a && this.f59278b.equals(bVar.f59278b) && this.f59279c.equals(bVar.f59279c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f59277a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f59278b.hashCode()) * 1000003) ^ this.f59279c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f59277a + ", transportContext=" + this.f59278b + ", event=" + this.f59279c + "}";
    }
}
