package s5;
public final class b {
    public final long f46118a;
    public final l5.i f46119b;
    public final l5.h f46120c;

    public b(long j10, l5.i iVar, l5.h hVar) {
        this.f46118a = j10;
        this.f46119b = iVar;
        this.f46120c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f46118a == bVar.f46118a && this.f46119b.equals(bVar.f46119b) && this.f46120c.equals(bVar.f46120c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f46118a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f46119b.hashCode()) * 1000003) ^ this.f46120c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f46118a + ", transportContext=" + this.f46119b + ", event=" + this.f46120c + "}";
    }
}
