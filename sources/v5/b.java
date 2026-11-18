package v5;
public final class b {
    public final long f59276a;
    public final o5.i f59277b;
    public final o5.h f59278c;

    public b(long j3, o5.i iVar, o5.h hVar) {
        this.f59276a = j3;
        this.f59277b = iVar;
        this.f59278c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f59276a == bVar.f59276a && this.f59277b.equals(bVar.f59277b) && this.f59278c.equals(bVar.f59278c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f59276a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f59277b.hashCode()) * 1000003) ^ this.f59278c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f59276a + ", transportContext=" + this.f59277b + ", event=" + this.f59278c + "}";
    }
}
