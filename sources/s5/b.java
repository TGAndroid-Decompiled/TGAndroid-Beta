package s5;
public final class b {
    public final long f42800a;
    public final l5.i f42801b;
    public final l5.h f42802c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f42800a = j3;
        this.f42801b = iVar;
        this.f42802c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f42800a == bVar.f42800a && this.f42801b.equals(bVar.f42801b) && this.f42802c.equals(bVar.f42802c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f42800a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f42801b.hashCode()) * 1000003) ^ this.f42802c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f42800a + ", transportContext=" + this.f42801b + ", event=" + this.f42802c + "}";
    }
}
