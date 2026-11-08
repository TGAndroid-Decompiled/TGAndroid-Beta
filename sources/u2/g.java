package u2;

import a8.ia;
import java.nio.ByteBuffer;
public final class g extends k2.h {
    public long f56250r;
    public int f56251s;
    public int f56252w;

    @Override
    public final void clear() {
        super.clear();
        this.f56251s = 0;
    }

    public final boolean e(k2.h hVar) {
        ByteBuffer byteBuffer;
        ia.f(!hVar.getFlag(1073741824));
        ia.f(!hVar.hasSupplementalData());
        ia.f(!hVar.isEndOfStream());
        if (f()) {
            if (this.f56251s < this.f56252w) {
                ByteBuffer byteBuffer2 = hVar.f17175c;
                if (byteBuffer2 != null && (byteBuffer = this.f17175c) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i7 = this.f56251s;
        this.f56251s = i7 + 1;
        if (i7 == 0) {
            this.f17176e = hVar.f17176e;
            if (hVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = hVar.f17175c;
        if (byteBuffer3 != null) {
            b(byteBuffer3.remaining());
            this.f17175c.put(byteBuffer3);
        }
        this.f56250r = hVar.f17176e;
        return true;
    }

    public final boolean f() {
        if (this.f56251s > 0) {
            return true;
        }
        return false;
    }
}
