package q2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public final class n extends com.googlecode.mp4parser.b {
    public n() {
        super("stsd");
    }

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(d());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        p2.b.r(0, byteBufferAllocate);
        p2.b.q(0, byteBufferAllocate);
        byteBufferAllocate.putInt(this.f4673b.size());
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        c(writableByteChannel);
    }

    @Override
    public final long getSize() {
        long jB = b();
        return 8 + jB + ((long) (jB + 16 >= 4294967296L ? 16 : 8));
    }
}
