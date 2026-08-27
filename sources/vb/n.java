package vb;

import java.nio.ByteBuffer;
import java.util.logging.Logger;

public final class n extends b {
    public ByteBuffer d;

    static {
        Logger.getLogger(n.class.getName());
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        this.d = (ByteBuffer) byteBuffer.slice().limit(this.f48848b);
    }

    public final String toString() {
        return "UnknownDescriptor{tag=" + this.f48847a + ", sizeOfInstance=" + this.f48848b + ", data=" + this.d + '}';
    }
}
