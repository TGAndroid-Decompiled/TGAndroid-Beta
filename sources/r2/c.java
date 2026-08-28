package r2;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class c extends a {
    public int h;
    public int f47008n;
    public double f47009r;
    public double f47010s;
    public int v;
    public String f47011w;
    public int f47012x;
    public final long[] f47013y;

    public c(String str) {
        super(str);
        this.f47009r = 72.0d;
        this.f47010s = 72.0d;
        this.v = 1;
        this.f47011w = "";
        this.f47012x = 24;
        this.f47013y = new long[3];
    }

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        p2.b.p(this.f47005f, allocate);
        p2.b.p(0, allocate);
        p2.b.p(0, allocate);
        long[] jArr = this.f47013y;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        p2.b.p(this.h, allocate);
        p2.b.p(this.f47008n, allocate);
        p2.b.n(allocate, this.f47009r);
        p2.b.n(allocate, this.f47010s);
        allocate.putInt((int) 0);
        p2.b.p(this.v, allocate);
        allocate.put((byte) (p2.b.l(this.f47011w) & 255));
        allocate.put(p2.b.b(this.f47011w));
        int l10 = p2.b.l(this.f47011w);
        while (l10 < 31) {
            l10++;
            allocate.put((byte) 0);
        }
        p2.b.p(this.f47012x, allocate);
        p2.b.p(65535, allocate);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override
    public final long getSize() {
        int i9;
        long b10 = b();
        long j10 = 78 + b10;
        if (b10 + 86 >= 4294967296L) {
            i9 = 16;
        } else {
            i9 = 8;
        }
        return j10 + i9;
    }
}
