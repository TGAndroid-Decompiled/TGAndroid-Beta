package s5;
public final class b {
    public final long f46718a;
    public final l5.i f46719b;
    public final l5.h f46720c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f46718a = j3;
        this.f46719b = iVar;
        this.f46720c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f46718a == bVar.f46718a && this.f46719b.equals(bVar.f46719b) && this.f46720c.equals(bVar.f46720c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46718a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f46719b.hashCode()) * 1000003) ^ this.f46720c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f46718a + ", transportContext=" + this.f46719b + ", event=" + this.f46720c + "}";
    }
}
