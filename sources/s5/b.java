package s5;
public final class b {
    public final long f42844a;
    public final l5.i f42845b;
    public final l5.h f42846c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f42844a = j3;
        this.f42845b = iVar;
        this.f42846c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f42844a == bVar.f42844a && this.f42845b.equals(bVar.f42845b) && this.f42846c.equals(bVar.f42846c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f42844a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f42845b.hashCode()) * 1000003) ^ this.f42846c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f42844a + ", transportContext=" + this.f42845b + ", event=" + this.f42846c + "}";
    }
}
