package s5;
public final class b {
    public final long f43168a;
    public final l5.i f43169b;
    public final l5.h f43170c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f43168a = j3;
        this.f43169b = iVar;
        this.f43170c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f43168a == bVar.f43168a && this.f43169b.equals(bVar.f43169b) && this.f43170c.equals(bVar.f43170c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f43168a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f43169b.hashCode()) * 1000003) ^ this.f43170c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f43168a + ", transportContext=" + this.f43169b + ", event=" + this.f43170c + "}";
    }
}
