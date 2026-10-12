package s5;
public final class b {
    public final long f48069a;
    public final l5.i f48070b;
    public final l5.h f48071c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f48069a = j3;
        this.f48070b = iVar;
        this.f48071c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f48069a == bVar.f48069a && this.f48070b.equals(bVar.f48070b) && this.f48071c.equals(bVar.f48071c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f48069a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f48070b.hashCode()) * 1000003) ^ this.f48071c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f48069a + ", transportContext=" + this.f48070b + ", event=" + this.f48071c + "}";
    }
}
