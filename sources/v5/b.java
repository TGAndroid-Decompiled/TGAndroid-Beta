package v5;
public final class b {
    public final long f59401a;
    public final o5.i f59402b;
    public final o5.h f59403c;

    public b(long j3, o5.i iVar, o5.h hVar) {
        this.f59401a = j3;
        this.f59402b = iVar;
        this.f59403c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f59401a == bVar.f59401a && this.f59402b.equals(bVar.f59402b) && this.f59403c.equals(bVar.f59403c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f59401a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f59402b.hashCode()) * 1000003) ^ this.f59403c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f59401a + ", transportContext=" + this.f59402b + ", event=" + this.f59403c + "}";
    }
}
