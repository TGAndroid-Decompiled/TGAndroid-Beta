package r2;

import java.nio.ByteBuffer;
import v7.u6;
public final class g extends h2.h {
    public long f44970r;
    public int f44971s;
    public int v;

    @Override
    public final void clear() {
        super.clear();
        this.f44971s = 0;
    }

    public final boolean g(h2.h hVar) {
        ByteBuffer byteBuffer;
        u6.g(!hVar.getFlag(1073741824));
        u6.g(!hVar.hasSupplementalData());
        u6.g(!hVar.isEndOfStream());
        if (h()) {
            if (this.f44971s < this.v) {
                ByteBuffer byteBuffer2 = hVar.f11637c;
                if (byteBuffer2 != null && (byteBuffer = this.f11637c) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i10 = this.f44971s;
        this.f44971s = i10 + 1;
        if (i10 == 0) {
            this.e = hVar.e;
            if (hVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = hVar.f11637c;
        if (byteBuffer3 != null) {
            b(byteBuffer3.remaining());
            this.f11637c.put(byteBuffer3);
        }
        this.f44970r = hVar.e;
        return true;
    }

    public final boolean h() {
        if (this.f44971s > 0) {
            return true;
        }
        return false;
    }
}
