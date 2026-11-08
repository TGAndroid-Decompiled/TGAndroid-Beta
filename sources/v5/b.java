package v5;
public final class b {
    public final long f57224a;
    public final o5.i f57225b;
    public final o5.h f57226c;

    public b(long j3, o5.i iVar, o5.h hVar) {
        this.f57224a = j3;
        this.f57225b = iVar;
        this.f57226c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f57224a == bVar.f57224a && this.f57225b.equals(bVar.f57225b) && this.f57226c.equals(bVar.f57226c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f57224a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f57225b.hashCode()) * 1000003) ^ this.f57226c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f57224a + ", transportContext=" + this.f57225b + ", event=" + this.f57226c + "}";
    }
}
