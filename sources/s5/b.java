package s5;
public final class b {
    public final long f48079a;
    public final l5.i f48080b;
    public final l5.h f48081c;

    public b(long j10, l5.i iVar, l5.h hVar) {
        this.f48079a = j10;
        this.f48080b = iVar;
        this.f48081c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f48079a == bVar.f48079a && this.f48080b.equals(bVar.f48080b) && this.f48081c.equals(bVar.f48081c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f48079a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f48080b.hashCode()) * 1000003) ^ this.f48081c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f48079a + ", transportContext=" + this.f48080b + ", event=" + this.f48081c + "}";
    }
}
