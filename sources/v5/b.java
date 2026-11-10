package v5;
public final class b {
    public final long f57232a;
    public final o5.i f57233b;
    public final o5.h f57234c;

    public b(long j3, o5.i iVar, o5.h hVar) {
        this.f57232a = j3;
        this.f57233b = iVar;
        this.f57234c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f57232a == bVar.f57232a && this.f57233b.equals(bVar.f57233b) && this.f57234c.equals(bVar.f57234c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f57232a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f57233b.hashCode()) * 1000003) ^ this.f57234c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f57232a + ", transportContext=" + this.f57233b + ", event=" + this.f57234c + "}";
    }
}
