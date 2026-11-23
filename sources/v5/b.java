package v5;
public final class b {
    public final long f59282a;
    public final o5.i f59283b;
    public final o5.h f59284c;

    public b(long j3, o5.i iVar, o5.h hVar) {
        this.f59282a = j3;
        this.f59283b = iVar;
        this.f59284c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f59282a == bVar.f59282a && this.f59283b.equals(bVar.f59283b) && this.f59284c.equals(bVar.f59284c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f59282a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f59283b.hashCode()) * 1000003) ^ this.f59284c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f59282a + ", transportContext=" + this.f59283b + ", event=" + this.f59284c + "}";
    }
}
