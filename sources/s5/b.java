package s5;
public final class b {
    public final long f43135a;
    public final l5.i f43136b;
    public final l5.h f43137c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f43135a = j3;
        this.f43136b = iVar;
        this.f43137c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f43135a == bVar.f43135a && this.f43136b.equals(bVar.f43136b) && this.f43137c.equals(bVar.f43137c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f43135a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f43136b.hashCode()) * 1000003) ^ this.f43137c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f43135a + ", transportContext=" + this.f43136b + ", event=" + this.f43137c + "}";
    }
}
