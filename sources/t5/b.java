package t5;
public final class b {
    public final long f48698a;
    public final m5.i f48699b;
    public final m5.h f48700c;

    public b(long j10, m5.i iVar, m5.h hVar) {
        this.f48698a = j10;
        this.f48699b = iVar;
        this.f48700c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f48698a == bVar.f48698a && this.f48699b.equals(bVar.f48699b) && this.f48700c.equals(bVar.f48700c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f48698a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f48699b.hashCode()) * 1000003) ^ this.f48700c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f48698a + ", transportContext=" + this.f48699b + ", event=" + this.f48700c + "}";
    }
}
