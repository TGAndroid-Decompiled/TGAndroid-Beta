package s5;
public final class b {
    public final long f46717a;
    public final l5.i f46718b;
    public final l5.h f46719c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f46717a = j3;
        this.f46718b = iVar;
        this.f46719c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f46717a == bVar.f46717a && this.f46718b.equals(bVar.f46718b) && this.f46719c.equals(bVar.f46719c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46717a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f46718b.hashCode()) * 1000003) ^ this.f46719c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f46717a + ", transportContext=" + this.f46718b + ", event=" + this.f46719c + "}";
    }
}
