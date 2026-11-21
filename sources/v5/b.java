package v5;
public final class b {
    public final long f59315a;
    public final o5.i f59316b;
    public final o5.h f59317c;

    public b(long j3, o5.i iVar, o5.h hVar) {
        this.f59315a = j3;
        this.f59316b = iVar;
        this.f59317c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f59315a == bVar.f59315a && this.f59316b.equals(bVar.f59316b) && this.f59317c.equals(bVar.f59317c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f59315a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f59316b.hashCode()) * 1000003) ^ this.f59317c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f59315a + ", transportContext=" + this.f59316b + ", event=" + this.f59317c + "}";
    }
}
