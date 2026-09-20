package s5;
public final class b {
    public final long f43147a;
    public final l5.i f43148b;
    public final l5.h f43149c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f43147a = j3;
        this.f43148b = iVar;
        this.f43149c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f43147a == bVar.f43147a && this.f43148b.equals(bVar.f43148b) && this.f43149c.equals(bVar.f43149c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f43147a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f43148b.hashCode()) * 1000003) ^ this.f43149c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f43147a + ", transportContext=" + this.f43148b + ", event=" + this.f43149c + "}";
    }
}
