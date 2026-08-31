package yb;

import java.nio.ByteBuffer;
import java.util.logging.Logger;
public final class n extends b {
    public ByteBuffer d;

    static {
        Logger.getLogger(n.class.getName());
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        this.d = (ByteBuffer) byteBuffer.slice().limit(this.f50822b);
    }

    public final String toString() {
        return "UnknownDescriptor{tag=" + this.f50821a + ", sizeOfInstance=" + this.f50822b + ", data=" + this.d + '}';
    }
}
