package s5;
public final class b {
    public final long f45018a;
    public final l5.i f45019b;
    public final l5.h f45020c;

    public b(long j10, l5.i iVar, l5.h hVar) {
        this.f45018a = j10;
        this.f45019b = iVar;
        this.f45020c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f45018a == bVar.f45018a && this.f45019b.equals(bVar.f45019b) && this.f45020c.equals(bVar.f45020c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f45018a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f45019b.hashCode()) * 1000003) ^ this.f45020c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f45018a + ", transportContext=" + this.f45019b + ", event=" + this.f45020c + "}";
    }
}
