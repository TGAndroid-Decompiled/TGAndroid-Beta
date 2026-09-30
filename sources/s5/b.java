package s5;
public final class b {
    public final long f43241a;
    public final l5.i f43242b;
    public final l5.h f43243c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f43241a = j3;
        this.f43242b = iVar;
        this.f43243c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f43241a == bVar.f43241a && this.f43242b.equals(bVar.f43242b) && this.f43243c.equals(bVar.f43243c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f43241a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f43242b.hashCode()) * 1000003) ^ this.f43243c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f43241a + ", transportContext=" + this.f43242b + ", event=" + this.f43243c + "}";
    }
}
