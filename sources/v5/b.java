package v5;
public final class b {
    public final long f57132a;
    public final o5.i f57133b;
    public final o5.h f57134c;

    public b(long j3, o5.i iVar, o5.h hVar) {
        this.f57132a = j3;
        this.f57133b = iVar;
        this.f57134c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f57132a == bVar.f57132a && this.f57133b.equals(bVar.f57133b) && this.f57134c.equals(bVar.f57134c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f57132a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f57133b.hashCode()) * 1000003) ^ this.f57134c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f57132a + ", transportContext=" + this.f57133b + ", event=" + this.f57134c + "}";
    }
}
