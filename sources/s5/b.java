package s5;
public final class b {
    public final long f43133a;
    public final l5.i f43134b;
    public final l5.h f43135c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f43133a = j3;
        this.f43134b = iVar;
        this.f43135c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f43133a == bVar.f43133a && this.f43134b.equals(bVar.f43134b) && this.f43135c.equals(bVar.f43135c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f43133a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f43134b.hashCode()) * 1000003) ^ this.f43135c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f43133a + ", transportContext=" + this.f43134b + ", event=" + this.f43135c + "}";
    }
}
