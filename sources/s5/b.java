package s5;
public final class b {
    public final long f46100a;
    public final l5.i f46101b;
    public final l5.h f46102c;

    public b(long j10, l5.i iVar, l5.h hVar) {
        this.f46100a = j10;
        this.f46101b = iVar;
        this.f46102c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f46100a == bVar.f46100a && this.f46101b.equals(bVar.f46101b) && this.f46102c.equals(bVar.f46102c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f46100a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f46101b.hashCode()) * 1000003) ^ this.f46102c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f46100a + ", transportContext=" + this.f46101b + ", event=" + this.f46102c + "}";
    }
}
