package r3;
public final class t {
    public static final t f46584c = new t(0, 0);
    public final long f46585a;
    public final long f46586b;

    public t(long j10, long j11) {
        this.f46585a = j10;
        this.f46586b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (this.f46585a == tVar.f46585a && this.f46586b == tVar.f46586b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f46585a) * 31) + ((int) this.f46586b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f46585a);
        sb.append(", position=");
        return android.support.v4.media.a.q(sb, this.f46586b, "]");
    }
}
