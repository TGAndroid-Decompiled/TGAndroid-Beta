package r2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public final class c extends a {
    public int h;

    public int f46698n;

    public double f46699r;

    public double f46700s;
    public int v;

    public String f46701w;

    public int f46702x;

    public final long[] f46703y;

    public c(String str) {
        super(str);
        this.f46699r = 72.0d;
        this.f46700s = 72.0d;
        this.v = 1;
        this.f46701w = "";
        this.f46702x = 24;
        this.f46703y = new long[3];
    }

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(d());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(78);
        byteBufferAllocate.position(6);
        p2.b.p(this.f46695f, byteBufferAllocate);
        p2.b.p(0, byteBufferAllocate);
        p2.b.p(0, byteBufferAllocate);
        long[] jArr = this.f46703y;
        byteBufferAllocate.putInt((int) jArr[0]);
        byteBufferAllocate.putInt((int) jArr[1]);
        byteBufferAllocate.putInt((int) jArr[2]);
        p2.b.p(this.h, byteBufferAllocate);
        p2.b.p(this.f46698n, byteBufferAllocate);
        p2.b.n(byteBufferAllocate, this.f46699r);
        p2.b.n(byteBufferAllocate, this.f46700s);
        byteBufferAllocate.putInt((int) 0);
        p2.b.p(this.v, byteBufferAllocate);
        byteBufferAllocate.put((byte) (p2.b.l(this.f46701w) & 255));
        byteBufferAllocate.put(p2.b.b(this.f46701w));
        int iL = p2.b.l(this.f46701w);
        while (iL < 31) {
            iL++;
            byteBufferAllocate.put((byte) 0);
        }
        p2.b.p(this.f46702x, byteBufferAllocate);
        p2.b.p(65535, byteBufferAllocate);
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        c(writableByteChannel);
    }

    @Override
    public final long getSize() {
        long jB = b();
        return 78 + jB + ((long) (jB + 86 >= 4294967296L ? 16 : 8));
    }
}
