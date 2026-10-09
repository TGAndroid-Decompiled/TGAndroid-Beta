package r2;

import java.nio.ByteBuffer;
public final class g extends h2.h {
    public long f46886r;
    public int f46887s;
    public int v;

    @Override
    public final void clear() {
        super.clear();
        this.f46887s = 0;
    }

    public final boolean d(h2.h hVar) {
        ByteBuffer byteBuffer;
        e2.d.b(!hVar.getFlag(1073741824));
        e2.d.b(!hVar.hasSupplementalData());
        e2.d.b(!hVar.isEndOfStream());
        if (f()) {
            if (this.f46887s < this.v) {
                ByteBuffer byteBuffer2 = hVar.f10985c;
                if (byteBuffer2 != null && (byteBuffer = this.f10985c) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i10 = this.f46887s;
        this.f46887s = i10 + 1;
        if (i10 == 0) {
            this.f10986e = hVar.f10986e;
            if (hVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = hVar.f10985c;
        if (byteBuffer3 != null) {
            b(byteBuffer3.remaining());
            this.f10985c.put(byteBuffer3);
        }
        this.f46886r = hVar.f10986e;
        return true;
    }

    public final boolean f() {
        if (this.f46887s > 0) {
            return true;
        }
        return false;
    }
}
