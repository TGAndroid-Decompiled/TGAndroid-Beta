package s5;
public final class b {
    public final long f42870a;
    public final l5.i f42871b;
    public final l5.h f42872c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f42870a = j3;
        this.f42871b = iVar;
        this.f42872c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f42870a == bVar.f42870a && this.f42871b.equals(bVar.f42871b) && this.f42872c.equals(bVar.f42872c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f42870a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f42871b.hashCode()) * 1000003) ^ this.f42872c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f42870a + ", transportContext=" + this.f42871b + ", event=" + this.f42872c + "}";
    }
}
