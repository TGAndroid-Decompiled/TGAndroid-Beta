package s5;
public final class b {
    public final long f43119a;
    public final l5.i f43120b;
    public final l5.h f43121c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f43119a = j3;
        this.f43120b = iVar;
        this.f43121c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f43119a == bVar.f43119a && this.f43120b.equals(bVar.f43120b) && this.f43121c.equals(bVar.f43121c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f43119a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f43120b.hashCode()) * 1000003) ^ this.f43121c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f43119a + ", transportContext=" + this.f43120b + ", event=" + this.f43121c + "}";
    }
}
