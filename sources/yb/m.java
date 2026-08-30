package yb;

import java.nio.ByteBuffer;
public final class m extends b {
    public int d;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        this.d = r2.b.a(byteBuffer.get());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass() && this.d == ((m) obj).d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        return "SLConfigDescriptor{predefined=" + this.d + '}';
    }
}
