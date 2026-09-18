package s5;
public final class b {
    public final long f42875a;
    public final l5.i f42876b;
    public final l5.h f42877c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f42875a = j3;
        this.f42876b = iVar;
        this.f42877c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f42875a == bVar.f42875a && this.f42876b.equals(bVar.f42876b) && this.f42877c.equals(bVar.f42877c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f42875a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f42876b.hashCode()) * 1000003) ^ this.f42877c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f42875a + ", transportContext=" + this.f42876b + ", event=" + this.f42877c + "}";
    }
}
