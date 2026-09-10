package r2;

import java.nio.ByteBuffer;
public final class g extends h2.h {
    public long f41173r;
    public int f41174s;
    public int v;

    @Override
    public final void clear() {
        super.clear();
        this.f41174s = 0;
    }

    public final boolean e(h2.h hVar) {
        ByteBuffer byteBuffer;
        e2.d.b(!hVar.getFlag(1073741824));
        e2.d.b(!hVar.hasSupplementalData());
        e2.d.b(!hVar.isEndOfStream());
        if (f()) {
            if (this.f41174s < this.v) {
                ByteBuffer byteBuffer2 = hVar.f9210c;
                if (byteBuffer2 != null && (byteBuffer = this.f9210c) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i10 = this.f41174s;
        this.f41174s = i10 + 1;
        if (i10 == 0) {
            this.e = hVar.e;
            if (hVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = hVar.f9210c;
        if (byteBuffer3 != null) {
            b(byteBuffer3.remaining());
            this.f9210c.put(byteBuffer3);
        }
        this.f41173r = hVar.e;
        return true;
    }

    public final boolean f() {
        if (this.f41174s > 0) {
            return true;
        }
        return false;
    }
}
