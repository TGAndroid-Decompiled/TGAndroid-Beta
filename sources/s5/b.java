package s5;
public final class b {
    public final long f43102a;
    public final l5.i f43103b;
    public final l5.h f43104c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f43102a = j3;
        this.f43103b = iVar;
        this.f43104c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f43102a == bVar.f43102a && this.f43103b.equals(bVar.f43103b) && this.f43104c.equals(bVar.f43104c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f43102a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f43103b.hashCode()) * 1000003) ^ this.f43104c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f43102a + ", transportContext=" + this.f43103b + ", event=" + this.f43104c + "}";
    }
}
