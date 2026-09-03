package r3;
public final class t {
    public static final t f43272c = new t(0, 0);
    public final long f43273a;
    public final long f43274b;

    public t(long j10, long j11) {
        this.f43273a = j10;
        this.f43274b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (this.f43273a == tVar.f43273a && this.f43274b == tVar.f43274b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f43273a) * 31) + ((int) this.f43274b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f43273a);
        sb.append(", position=");
        return android.support.v4.media.a.q(sb, this.f43274b, "]");
    }
}
