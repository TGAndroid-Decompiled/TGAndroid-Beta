package v5;
public final class b {
    public final long f58707a;
    public final o5.i f58708b;
    public final o5.h f58709c;

    public b(long j3, o5.i iVar, o5.h hVar) {
        this.f58707a = j3;
        this.f58708b = iVar;
        this.f58709c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f58707a == bVar.f58707a && this.f58708b.equals(bVar.f58708b) && this.f58709c.equals(bVar.f58709c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f58707a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f58708b.hashCode()) * 1000003) ^ this.f58709c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f58707a + ", transportContext=" + this.f58708b + ", event=" + this.f58709c + "}";
    }
}
