package s5;
public final class b {
    public final long f43132a;
    public final l5.i f43133b;
    public final l5.h f43134c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f43132a = j3;
        this.f43133b = iVar;
        this.f43134c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f43132a == bVar.f43132a && this.f43133b.equals(bVar.f43133b) && this.f43134c.equals(bVar.f43134c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f43132a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f43133b.hashCode()) * 1000003) ^ this.f43134c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f43132a + ", transportContext=" + this.f43133b + ", event=" + this.f43134c + "}";
    }
}
