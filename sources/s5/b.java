package s5;
public final class b {
    public final long f43134a;
    public final l5.i f43135b;
    public final l5.h f43136c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f43134a = j3;
        this.f43135b = iVar;
        this.f43136c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f43134a == bVar.f43134a && this.f43135b.equals(bVar.f43135b) && this.f43136c.equals(bVar.f43136c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f43134a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f43135b.hashCode()) * 1000003) ^ this.f43136c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f43134a + ", transportContext=" + this.f43135b + ", event=" + this.f43136c + "}";
    }
}
