package s5;
public final class b {
    public final long f47838a;
    public final l5.i f47839b;
    public final l5.h f47840c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f47838a = j3;
        this.f47839b = iVar;
        this.f47840c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f47838a == bVar.f47838a && this.f47839b.equals(bVar.f47839b) && this.f47840c.equals(bVar.f47840c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f47838a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f47839b.hashCode()) * 1000003) ^ this.f47840c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f47838a + ", transportContext=" + this.f47839b + ", event=" + this.f47840c + "}";
    }
}
