package v5;
public final class b {
    public final long f57107a;
    public final o5.i f57108b;
    public final o5.h f57109c;

    public b(long j3, o5.i iVar, o5.h hVar) {
        this.f57107a = j3;
        this.f57108b = iVar;
        this.f57109c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f57107a == bVar.f57107a && this.f57108b.equals(bVar.f57108b) && this.f57109c.equals(bVar.f57109c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f57107a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f57108b.hashCode()) * 1000003) ^ this.f57109c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f57107a + ", transportContext=" + this.f57108b + ", event=" + this.f57109c + "}";
    }
}
