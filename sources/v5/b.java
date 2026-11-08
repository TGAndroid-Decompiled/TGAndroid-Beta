package v5;
public final class b {
    public final long f57223a;
    public final o5.i f57224b;
    public final o5.h f57225c;

    public b(long j3, o5.i iVar, o5.h hVar) {
        this.f57223a = j3;
        this.f57224b = iVar;
        this.f57225c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f57223a == bVar.f57223a && this.f57224b.equals(bVar.f57224b) && this.f57225c.equals(bVar.f57225c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f57223a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f57224b.hashCode()) * 1000003) ^ this.f57225c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f57223a + ", transportContext=" + this.f57224b + ", event=" + this.f57225c + "}";
    }
}
