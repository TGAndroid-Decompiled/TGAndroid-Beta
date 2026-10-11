package s5;
public final class b {
    public final long f47962a;
    public final l5.i f47963b;
    public final l5.h f47964c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f47962a = j3;
        this.f47963b = iVar;
        this.f47964c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f47962a == bVar.f47962a && this.f47963b.equals(bVar.f47963b) && this.f47964c.equals(bVar.f47964c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f47962a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f47963b.hashCode()) * 1000003) ^ this.f47964c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f47962a + ", transportContext=" + this.f47963b + ", event=" + this.f47964c + "}";
    }
}
