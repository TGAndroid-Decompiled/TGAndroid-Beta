package s5;
public final class b {
    public final long f46523a;
    public final l5.i f46524b;
    public final l5.h f46525c;

    public b(long j10, l5.i iVar, l5.h hVar) {
        this.f46523a = j10;
        this.f46524b = iVar;
        this.f46525c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f46523a == bVar.f46523a && this.f46524b.equals(bVar.f46524b) && this.f46525c.equals(bVar.f46525c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f46523a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f46524b.hashCode()) * 1000003) ^ this.f46525c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f46523a + ", transportContext=" + this.f46524b + ", event=" + this.f46525c + "}";
    }
}
