package v5;
public final class b {
    public final long f57236a;
    public final o5.i f57237b;
    public final o5.h f57238c;

    public b(long j3, o5.i iVar, o5.h hVar) {
        this.f57236a = j3;
        this.f57237b = iVar;
        this.f57238c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f57236a == bVar.f57236a && this.f57237b.equals(bVar.f57237b) && this.f57238c.equals(bVar.f57238c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f57236a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f57237b.hashCode()) * 1000003) ^ this.f57238c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f57236a + ", transportContext=" + this.f57237b + ", event=" + this.f57238c + "}";
    }
}
