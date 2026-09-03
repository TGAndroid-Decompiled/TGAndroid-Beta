package r3;
public final class t {
    public static final t f46615c = new t(0, 0);
    public final long f46616a;
    public final long f46617b;

    public t(long j10, long j11) {
        this.f46616a = j10;
        this.f46617b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (this.f46616a == tVar.f46616a && this.f46617b == tVar.f46617b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f46616a) * 31) + ((int) this.f46617b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f46616a);
        sb.append(", position=");
        return android.support.v4.media.a.q(sb, this.f46617b, "]");
    }
}
