package s5;
public final class b {
    public final long f48068a;
    public final l5.i f48069b;
    public final l5.h f48070c;

    public b(long j10, l5.i iVar, l5.h hVar) {
        this.f48068a = j10;
        this.f48069b = iVar;
        this.f48070c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f48068a == bVar.f48068a && this.f48069b.equals(bVar.f48069b) && this.f48070c.equals(bVar.f48070c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f48068a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f48069b.hashCode()) * 1000003) ^ this.f48070c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f48068a + ", transportContext=" + this.f48069b + ", event=" + this.f48070c + "}";
    }
}
