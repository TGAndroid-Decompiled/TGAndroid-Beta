package t5;
public final class b {
    public final long f48701a;
    public final m5.i f48702b;
    public final m5.h f48703c;

    public b(long j10, m5.i iVar, m5.h hVar) {
        this.f48701a = j10;
        this.f48702b = iVar;
        this.f48703c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f48701a == bVar.f48701a && this.f48702b.equals(bVar.f48702b) && this.f48703c.equals(bVar.f48703c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f48701a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f48702b.hashCode()) * 1000003) ^ this.f48703c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f48701a + ", transportContext=" + this.f48702b + ", event=" + this.f48703c + "}";
    }
}
