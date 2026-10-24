package s5;
public final class b {
    public final long f46522a;
    public final l5.i f46523b;
    public final l5.h f46524c;

    public b(long j10, l5.i iVar, l5.h hVar) {
        this.f46522a = j10;
        this.f46523b = iVar;
        this.f46524c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f46522a == bVar.f46522a && this.f46523b.equals(bVar.f46523b) && this.f46524c.equals(bVar.f46524c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f46522a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f46523b.hashCode()) * 1000003) ^ this.f46524c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f46522a + ", transportContext=" + this.f46523b + ", event=" + this.f46524c + "}";
    }
}
