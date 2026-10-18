package s5;
public final class b {
    public final long f46138a;
    public final l5.i f46139b;
    public final l5.h f46140c;

    public b(long j10, l5.i iVar, l5.h hVar) {
        this.f46138a = j10;
        this.f46139b = iVar;
        this.f46140c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f46138a == bVar.f46138a && this.f46139b.equals(bVar.f46139b) && this.f46140c.equals(bVar.f46140c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f46138a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f46139b.hashCode()) * 1000003) ^ this.f46140c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f46138a + ", transportContext=" + this.f46139b + ", event=" + this.f46140c + "}";
    }
}
