package v5;
public final class b {
    public final long f59319a;
    public final o5.i f59320b;
    public final o5.h f59321c;

    public b(long j3, o5.i iVar, o5.h hVar) {
        this.f59319a = j3;
        this.f59320b = iVar;
        this.f59321c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f59319a == bVar.f59319a && this.f59320b.equals(bVar.f59320b) && this.f59321c.equals(bVar.f59321c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f59319a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f59320b.hashCode()) * 1000003) ^ this.f59321c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f59319a + ", transportContext=" + this.f59320b + ", event=" + this.f59321c + "}";
    }
}
