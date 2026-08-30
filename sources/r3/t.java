package r3;
public final class t {
    public static final t f43248c = new t(0, 0);
    public final long f43249a;
    public final long f43250b;

    public t(long j10, long j11) {
        this.f43249a = j10;
        this.f43250b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (this.f43249a == tVar.f43249a && this.f43250b == tVar.f43250b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f43249a) * 31) + ((int) this.f43250b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f43249a);
        sb.append(", position=");
        return android.support.v4.media.a.q(sb, this.f43250b, "]");
    }
}
