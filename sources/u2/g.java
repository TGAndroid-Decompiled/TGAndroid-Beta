package u2;

import a8.ia;
import java.nio.ByteBuffer;
public final class g extends k2.h {
    public long f56136r;
    public int f56137s;
    public int f56138w;

    @Override
    public final void clear() {
        super.clear();
        this.f56137s = 0;
    }

    public final boolean e(k2.h hVar) {
        ByteBuffer byteBuffer;
        ia.f(!hVar.getFlag(1073741824));
        ia.f(!hVar.hasSupplementalData());
        ia.f(!hVar.isEndOfStream());
        if (f()) {
            if (this.f56137s < this.f56138w) {
                ByteBuffer byteBuffer2 = hVar.f17172c;
                if (byteBuffer2 != null && (byteBuffer = this.f17172c) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i7 = this.f56137s;
        this.f56137s = i7 + 1;
        if (i7 == 0) {
            this.f17173e = hVar.f17173e;
            if (hVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = hVar.f17172c;
        if (byteBuffer3 != null) {
            b(byteBuffer3.remaining());
            this.f17172c.put(byteBuffer3);
        }
        this.f56136r = hVar.f17173e;
        return true;
    }

    public final boolean f() {
        if (this.f56137s > 0) {
            return true;
        }
        return false;
    }
}
