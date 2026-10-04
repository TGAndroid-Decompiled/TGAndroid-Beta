package s5;
public final class b {
    public final long f46725a;
    public final l5.i f46726b;
    public final l5.h f46727c;

    public b(long j3, l5.i iVar, l5.h hVar) {
        this.f46725a = j3;
        this.f46726b = iVar;
        this.f46727c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f46725a == bVar.f46725a && this.f46726b.equals(bVar.f46726b) && this.f46727c.equals(bVar.f46727c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f46725a;
        return ((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ this.f46726b.hashCode()) * 1000003) ^ this.f46727c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f46725a + ", transportContext=" + this.f46726b + ", event=" + this.f46727c + "}";
    }
}
