package s5;
public final class b {
    public final long f41783a;
    public final l5.i f41784b;
    public final l5.h f41785c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f41783a = j3;
        this.f41784b = iVar;
        this.f41785c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f41783a == bVar.f41783a && this.f41784b.equals(bVar.f41784b) && this.f41785c.equals(bVar.f41785c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f41783a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f41784b.hashCode()) * 1000003) ^ this.f41785c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f41783a + ", transportContext=" + this.f41784b + ", event=" + this.f41785c + "}";
    }
}
