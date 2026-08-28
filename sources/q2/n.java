package q2;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class n extends com.googlecode.mp4parser.b {
    public n() {
        super("stsd");
    }

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(8);
        p2.b.r(0, allocate);
        p2.b.q(0, allocate);
        allocate.putInt(this.f4231b.size());
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override
    public final long getSize() {
        int i9;
        long b10 = b();
        long j10 = 8 + b10;
        if (b10 + 16 >= 4294967296L) {
            i9 = 16;
        } else {
            i9 = 8;
        }
        return j10 + i9;
    }
}
