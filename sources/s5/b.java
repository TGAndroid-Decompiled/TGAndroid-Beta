package s5;
public final class b {
    public final long f46101a;
    public final l5.i f46102b;
    public final l5.h f46103c;

    public b(long j10, l5.i iVar, l5.h hVar) {
        this.f46101a = j10;
        this.f46102b = iVar;
        this.f46103c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f46101a == bVar.f46101a && this.f46102b.equals(bVar.f46102b) && this.f46103c.equals(bVar.f46103c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f46101a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f46102b.hashCode()) * 1000003) ^ this.f46103c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f46101a + ", transportContext=" + this.f46102b + ", event=" + this.f46103c + "}";
    }
}
