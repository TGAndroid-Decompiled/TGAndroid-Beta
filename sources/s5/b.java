package s5;
public final class b {
    public final long f48077a;
    public final l5.i f48078b;
    public final l5.h f48079c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f48077a = j3;
        this.f48078b = iVar;
        this.f48079c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f48077a == bVar.f48077a && this.f48078b.equals(bVar.f48078b) && this.f48079c.equals(bVar.f48079c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f48077a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f48078b.hashCode()) * 1000003) ^ this.f48079c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f48077a + ", transportContext=" + this.f48078b + ", event=" + this.f48079c + "}";
    }
}
