package s5;
public final class b {
    public final long f47928a;
    public final l5.i f47929b;
    public final l5.h f47930c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f47928a = j3;
        this.f47929b = iVar;
        this.f47930c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f47928a == bVar.f47928a && this.f47929b.equals(bVar.f47929b) && this.f47930c.equals(bVar.f47930c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f47928a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f47929b.hashCode()) * 1000003) ^ this.f47930c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f47928a + ", transportContext=" + this.f47929b + ", event=" + this.f47930c + "}";
    }
}
