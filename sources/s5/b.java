package s5;
public final class b {
    public final long f46097a;
    public final l5.i f46098b;
    public final l5.h f46099c;

    public b(long j10, l5.i iVar, l5.h hVar) {
        this.f46097a = j10;
        this.f46098b = iVar;
        this.f46099c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f46097a == bVar.f46097a && this.f46098b.equals(bVar.f46098b) && this.f46099c.equals(bVar.f46099c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f46097a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f46098b.hashCode()) * 1000003) ^ this.f46099c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f46097a + ", transportContext=" + this.f46098b + ", event=" + this.f46099c + "}";
    }
}
