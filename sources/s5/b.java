package s5;
public final class b {
    public final long f45960a;
    public final l5.i f45961b;
    public final l5.h f45962c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f45960a = j3;
        this.f45961b = iVar;
        this.f45962c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f45960a == bVar.f45960a && this.f45961b.equals(bVar.f45961b) && this.f45962c.equals(bVar.f45962c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f45960a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f45961b.hashCode()) * 1000003) ^ this.f45962c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f45960a + ", transportContext=" + this.f45961b + ", event=" + this.f45962c + "}";
    }
}
