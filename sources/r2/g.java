package r2;

import java.nio.ByteBuffer;
import v7.u6;
public final class g extends h2.h {
    public long f44924r;
    public int f44925s;
    public int v;

    @Override
    public final void clear() {
        super.clear();
        this.f44925s = 0;
    }

    public final boolean e(h2.h hVar) {
        ByteBuffer byteBuffer;
        u6.g(!hVar.getFlag(1073741824));
        u6.g(!hVar.hasSupplementalData());
        u6.g(!hVar.isEndOfStream());
        if (f()) {
            if (this.f44925s < this.v) {
                ByteBuffer byteBuffer2 = hVar.f11634c;
                if (byteBuffer2 != null && (byteBuffer = this.f11634c) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i10 = this.f44925s;
        this.f44925s = i10 + 1;
        if (i10 == 0) {
            this.e = hVar.e;
            if (hVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = hVar.f11634c;
        if (byteBuffer3 != null) {
            b(byteBuffer3.remaining());
            this.f11634c.put(byteBuffer3);
        }
        this.f44924r = hVar.e;
        return true;
    }

    public final boolean f() {
        if (this.f44925s > 0) {
            return true;
        }
        return false;
    }
}
