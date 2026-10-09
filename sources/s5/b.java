package s5;
public final class b {
    public final long f47836a;
    public final l5.i f47837b;
    public final l5.h f47838c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f47836a = j3;
        this.f47837b = iVar;
        this.f47838c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f47836a == bVar.f47836a && this.f47837b.equals(bVar.f47837b) && this.f47838c.equals(bVar.f47838c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f47836a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f47837b.hashCode()) * 1000003) ^ this.f47838c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f47836a + ", transportContext=" + this.f47837b + ", event=" + this.f47838c + "}";
    }
}
