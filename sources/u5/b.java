package u5;
public final class b {
    public final long f55715a;
    public final n5.i f55716b;
    public final n5.h f55717c;

    public b(long j10, n5.i iVar, n5.h hVar) {
        this.f55715a = j10;
        this.f55716b = iVar;
        this.f55717c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f55715a == bVar.f55715a && this.f55716b.equals(bVar.f55716b) && this.f55717c.equals(bVar.f55717c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f55715a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f55716b.hashCode()) * 1000003) ^ this.f55717c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f55715a + ", transportContext=" + this.f55716b + ", event=" + this.f55717c + "}";
    }
}
