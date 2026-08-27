package q2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public final class h extends com.googlecode.mp4parser.b {

    public final int f46085f;

    public h(String str, int i10) {
        super(str);
        this.f46085f = i10;
    }

    @Override
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        switch (this.f46085f) {
            case 1:
                writableByteChannel.write(d());
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                p2.b.r(0, byteBufferAllocate);
                p2.b.q(0, byteBufferAllocate);
                byteBufferAllocate.putInt(this.f4673b.size());
                writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
                c(writableByteChannel);
                break;
            default:
                super.getBox(writableByteChannel);
                break;
        }
    }

    @Override
    public long getSize() {
        switch (this.f46085f) {
            case 1:
                long jB = b();
                return 8 + jB + ((long) (jB + 16 >= 4294967296L ? 16 : 8));
            default:
                return super.getSize();
        }
    }
}
