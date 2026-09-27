package s5;
public final class b {
    public final long f43178a;
    public final l5.i f43179b;
    public final l5.h f43180c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f43178a = j3;
        this.f43179b = iVar;
        this.f43180c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f43178a == bVar.f43178a && this.f43179b.equals(bVar.f43179b) && this.f43180c.equals(bVar.f43180c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f43178a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f43179b.hashCode()) * 1000003) ^ this.f43180c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f43178a + ", transportContext=" + this.f43179b + ", event=" + this.f43180c + "}";
    }
}
