package vb;

import java.nio.ByteBuffer;

public final class m extends b {
    public int d;

    @Override
    public final void b(ByteBuffer byteBuffer) {
        this.d = p2.b.a(byteBuffer.get());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && m.class == obj.getClass() && this.d == ((m) obj).d;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        return "SLConfigDescriptor{predefined=" + this.d + '}';
    }
}
