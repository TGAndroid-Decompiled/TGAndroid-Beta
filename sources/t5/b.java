package t5;
public final class b {
    public final long f48736a;
    public final m5.i f48737b;
    public final m5.h f48738c;

    public b(long j10, m5.i iVar, m5.h hVar) {
        this.f48736a = j10;
        this.f48737b = iVar;
        this.f48738c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f48736a == bVar.f48736a && this.f48737b.equals(bVar.f48737b) && this.f48738c.equals(bVar.f48738c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f48736a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f48737b.hashCode()) * 1000003) ^ this.f48738c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f48736a + ", transportContext=" + this.f48737b + ", event=" + this.f48738c + "}";
    }
}
