package s5;
public final class b {
    public final long f45961a;
    public final l5.i f45962b;
    public final l5.h f45963c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f45961a = j3;
        this.f45962b = iVar;
        this.f45963c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f45961a == bVar.f45961a && this.f45962b.equals(bVar.f45962b) && this.f45963c.equals(bVar.f45963c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f45961a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f45962b.hashCode()) * 1000003) ^ this.f45963c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f45961a + ", transportContext=" + this.f45962b + ", event=" + this.f45963c + "}";
    }
}
