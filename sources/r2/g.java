package r2;

import java.nio.ByteBuffer;
import v7.u6;
public final class g extends h2.h {
    public long f43835r;
    public int f43836s;
    public int v;

    @Override
    public final void clear() {
        super.clear();
        this.f43836s = 0;
    }

    public final boolean g(h2.h hVar) {
        ByteBuffer byteBuffer;
        u6.g(!hVar.getFlag(1073741824));
        u6.g(!hVar.hasSupplementalData());
        u6.g(!hVar.isEndOfStream());
        if (h()) {
            if (this.f43836s < this.v) {
                ByteBuffer byteBuffer2 = hVar.f10326c;
                if (byteBuffer2 != null && (byteBuffer = this.f10326c) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i10 = this.f43836s;
        this.f43836s = i10 + 1;
        if (i10 == 0) {
            this.e = hVar.e;
            if (hVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = hVar.f10326c;
        if (byteBuffer3 != null) {
            b(byteBuffer3.remaining());
            this.f10326c.put(byteBuffer3);
        }
        this.f43835r = hVar.e;
        return true;
    }

    public final boolean h() {
        if (this.f43836s > 0) {
            return true;
        }
        return false;
    }
}
