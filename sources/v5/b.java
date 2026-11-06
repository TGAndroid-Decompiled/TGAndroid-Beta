package v5;
public final class b {
    public final long f57131a;
    public final o5.i f57132b;
    public final o5.h f57133c;

    public b(long j3, o5.i iVar, o5.h hVar) {
        this.f57131a = j3;
        this.f57132b = iVar;
        this.f57133c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f57131a == bVar.f57131a && this.f57132b.equals(bVar.f57132b) && this.f57133c.equals(bVar.f57133c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f57131a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f57132b.hashCode()) * 1000003) ^ this.f57133c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f57131a + ", transportContext=" + this.f57132b + ", event=" + this.f57133c + "}";
    }
}
