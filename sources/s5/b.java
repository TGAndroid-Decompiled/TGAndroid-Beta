package s5;
public final class b {
    public final long f46090a;
    public final l5.i f46091b;
    public final l5.h f46092c;

    public b(long j10, l5.i iVar, l5.h hVar) {
        this.f46090a = j10;
        this.f46091b = iVar;
        this.f46092c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f46090a == bVar.f46090a && this.f46091b.equals(bVar.f46091b) && this.f46092c.equals(bVar.f46092c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f46090a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f46091b.hashCode()) * 1000003) ^ this.f46092c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f46090a + ", transportContext=" + this.f46091b + ", event=" + this.f46092c + "}";
    }
}
