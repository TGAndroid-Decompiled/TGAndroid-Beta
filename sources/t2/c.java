package t2;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class c extends a {
    public int h;
    public int f47872n;
    public double f47873r;
    public double f47874s;
    public int v;
    public String f47875w;
    public int f47876x;
    public final long[] f47877y;

    public c(String str) {
        super(str);
        this.f47873r = 72.0d;
        this.f47874s = 72.0d;
        this.v = 1;
        this.f47875w = "";
        this.f47876x = 24;
        this.f47877y = new long[3];
    }

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        r2.b.p(this.f47869f, allocate);
        r2.b.p(0, allocate);
        r2.b.p(0, allocate);
        long[] jArr = this.f47877y;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        r2.b.p(this.h, allocate);
        r2.b.p(this.f47872n, allocate);
        r2.b.n(allocate, this.f47873r);
        r2.b.n(allocate, this.f47874s);
        allocate.putInt((int) 0);
        r2.b.p(this.v, allocate);
        allocate.put((byte) (r2.b.l(this.f47875w) & 255));
        allocate.put(r2.b.b(this.f47875w));
        int l10 = r2.b.l(this.f47875w);
        while (l10 < 31) {
            l10++;
            allocate.put((byte) 0);
        }
        r2.b.p(this.f47876x, allocate);
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
