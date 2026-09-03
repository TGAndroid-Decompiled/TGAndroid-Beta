package t2;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
public final class c extends a {
    public int h;
    public int f44499n;
    public double f44500r;
    public double f44501s;
    public int v;
    public String f44502w;
    public int f44503x;
    public final long[] f44504y;

    public c(String str) {
        super(str);
        this.f44500r = 72.0d;
        this.f44501s = 72.0d;
        this.v = 1;
        this.f44502w = "";
        this.f44503x = 24;
        this.f44504y = new long[3];
    }

    @Override
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        r2.b.p(this.f44496f, allocate);
        r2.b.p(0, allocate);
        r2.b.p(0, allocate);
        long[] jArr = this.f44504y;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        r2.b.p(this.h, allocate);
        r2.b.p(this.f44499n, allocate);
        r2.b.n(allocate, this.f44500r);
        r2.b.n(allocate, this.f44501s);
        allocate.putInt((int) 0);
        r2.b.p(this.v, allocate);
        allocate.put((byte) (r2.b.l(this.f44502w) & 255));
        allocate.put(r2.b.b(this.f44502w));
        int l10 = r2.b.l(this.f44502w);
        while (l10 < 31) {
            l10++;
            allocate.put((byte) 0);
        }
        r2.b.p(this.f44503x, allocate);
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
