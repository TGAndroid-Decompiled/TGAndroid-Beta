package zb;

import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

public final class b implements ByteChannel {

    public ByteBuffer f50319a;

    @Override
    public final boolean isOpen() {
        return true;
    }

    @Override
    public final int read(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        ByteBuffer byteBuffer2 = this.f50319a;
        if (byteBuffer2.remaining() <= 0) {
            return -1;
        }
        byteBuffer.put((ByteBuffer) byteBuffer2.duplicate().limit(byteBuffer.remaining() + byteBuffer2.position()));
        byteBuffer2.position(byteBuffer2.position() + iRemaining);
        return iRemaining;
    }

    @Override
    public final int write(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        this.f50319a.put(byteBuffer);
        return iRemaining;
    }

    @Override
    public final void close() {
    }
}
