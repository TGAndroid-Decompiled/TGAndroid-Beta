package r2;

import java.nio.ByteBuffer;
public final class g extends h2.g {
    public long v;
    public int f44823w;
    public int f44824x;

    @Override
    public final void i() {
        super.i();
        this.f44823w = 0;
    }

    public final boolean n(h2.g gVar) {
        ByteBuffer byteBuffer;
        e2.d.b(!gVar.c(1073741824));
        e2.d.b(!gVar.c(268435456));
        e2.d.b(!gVar.c(4));
        if (o()) {
            if (this.f44823w < this.f44824x) {
                ByteBuffer byteBuffer2 = gVar.f10847e;
                if (byteBuffer2 != null && (byteBuffer = this.f10847e) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i10 = this.f44823w;
        this.f44823w = i10 + 1;
        if (i10 == 0) {
            this.h = gVar.h;
            if (gVar.c(1)) {
                this.f6773b = 1;
            }
        }
        ByteBuffer byteBuffer3 = gVar.f10847e;
        if (byteBuffer3 != null) {
            l(byteBuffer3.remaining());
            this.f10847e.put(byteBuffer3);
        }
        this.v = gVar.h;
        return true;
    }

    public final boolean o() {
        if (this.f44823w > 0) {
            return true;
        }
        return false;
    }
}
