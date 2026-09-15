package s5;
public final class b {
    public final long f42848a;
    public final l5.i f42849b;
    public final l5.h f42850c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f42848a = j3;
        this.f42849b = iVar;
        this.f42850c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f42848a == bVar.f42848a && this.f42849b.equals(bVar.f42849b) && this.f42850c.equals(bVar.f42850c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f42848a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f42849b.hashCode()) * 1000003) ^ this.f42850c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f42848a + ", transportContext=" + this.f42849b + ", event=" + this.f42850c + "}";
    }
}
