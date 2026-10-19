package s5;
public final class b {
    public final long f46092a;
    public final l5.i f46093b;
    public final l5.h f46094c;

    public b(long j10, l5.i iVar, l5.h hVar) {
        this.f46092a = j10;
        this.f46093b = iVar;
        this.f46094c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f46092a == bVar.f46092a && this.f46093b.equals(bVar.f46093b) && this.f46094c.equals(bVar.f46094c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f46092a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f46093b.hashCode()) * 1000003) ^ this.f46094c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f46092a + ", transportContext=" + this.f46093b + ", event=" + this.f46094c + "}";
    }
}
