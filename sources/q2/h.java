package q2;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class h extends com.googlecode.mp4parser.b {
    public final int f45921f;

    public h(String str, int i9) {
        super(str);
        this.f45921f = i9;
    }

    @Override
    public void getBox(WritableByteChannel writableByteChannel) {
        switch (this.f45921f) {
            case 1:
                writableByteChannel.write(d());
                ByteBuffer allocate = ByteBuffer.allocate(8);
                p2.b.r(0, allocate);
                p2.b.q(0, allocate);
                allocate.putInt(this.f4231b.size());
                writableByteChannel.write((ByteBuffer) allocate.rewind());
                c(writableByteChannel);
                return;
            default:
                super.getBox(writableByteChannel);
                return;
        }
    }

    @Override
    public long getSize() {
        int i9;
        switch (this.f45921f) {
            case 1:
                long b10 = b();
                long j10 = 8 + b10;
                if (b10 + 16 >= 4294967296L) {
                    i9 = 16;
                } else {
                    i9 = 8;
                }
                return j10 + i9;
            default:
                return super.getSize();
        }
    }
}
