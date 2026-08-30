package t2;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class c extends a {
    public int h;
    public int f44437n;
    public double f44438r;
    public double f44439s;
    public int v;
    public String f44440w;
    public int f44441x;
    public final long[] f44442y;

    public c(String str) {
        super(str);
        this.f44438r = 72.0d;
        this.f44439s = 72.0d;
        this.v = 1;
        this.f44440w = "";
        this.f44441x = 24;
        this.f44442y = new long[3];
    }

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        r2.b.p(this.f44434f, allocate);
        r2.b.p(0, allocate);
        r2.b.p(0, allocate);
        long[] jArr = this.f44442y;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        r2.b.p(this.h, allocate);
        r2.b.p(this.f44437n, allocate);
        r2.b.n(allocate, this.f44438r);
        r2.b.n(allocate, this.f44439s);
        allocate.putInt((int) 0);
        r2.b.p(this.v, allocate);
        allocate.put((byte) (r2.b.l(this.f44440w) & 255));
        allocate.put(r2.b.b(this.f44440w));
        int l10 = r2.b.l(this.f44440w);
        while (l10 < 31) {
            l10++;
            allocate.put((byte) 0);
        }
        r2.b.p(this.f44441x, allocate);
        r2.b.p(65535, allocate);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override
    public final long getSize() {
        int i10;
        long b10 = b();
        long j10 = 78 + b10;
        if (b10 + 86 >= 4294967296L) {
            i10 = 16;
        } else {
            i10 = 8;
        }
        return j10 + i10;
    }
}
