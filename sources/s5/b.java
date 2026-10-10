package s5;
public final class b {
    public final long f47882a;
    public final l5.i f47883b;
    public final l5.h f47884c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f47882a = j3;
        this.f47883b = iVar;
        this.f47884c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f47882a == bVar.f47882a && this.f47883b.equals(bVar.f47883b) && this.f47884c.equals(bVar.f47884c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f47882a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f47883b.hashCode()) * 1000003) ^ this.f47884c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f47882a + ", transportContext=" + this.f47883b + ", event=" + this.f47884c + "}";
    }
}
