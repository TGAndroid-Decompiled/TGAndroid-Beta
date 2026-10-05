package s5;
public final class b {
    public final long f46732a;
    public final l5.i f46733b;
    public final l5.h f46734c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f46732a = j3;
        this.f46733b = iVar;
        this.f46734c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f46732a == bVar.f46732a && this.f46733b.equals(bVar.f46733b) && this.f46734c.equals(bVar.f46734c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46732a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f46733b.hashCode()) * 1000003) ^ this.f46734c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f46732a + ", transportContext=" + this.f46733b + ", event=" + this.f46734c + "}";
    }
}
