package r2;

import a8.yb;
import java.nio.ByteBuffer;
public final class g extends h2.h {
    public long f47250r;
    public int f47251s;
    public int v;

    @Override
    public final void clear() {
        super.clear();
        this.f47251s = 0;
    }

    public final boolean f(h2.h hVar) {
        ByteBuffer byteBuffer;
        yb.g(!hVar.getFlag(1073741824));
        yb.g(!hVar.hasSupplementalData());
        yb.g(!hVar.isEndOfStream());
        if (h()) {
            if (this.f47251s < this.v) {
                ByteBuffer byteBuffer2 = hVar.f12569c;
                if (byteBuffer2 != null && (byteBuffer = this.f12569c) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i10 = this.f47251s;
        this.f47251s = i10 + 1;
        if (i10 == 0) {
            this.e = hVar.e;
            if (hVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = hVar.f12569c;
        if (byteBuffer3 != null) {
            b(byteBuffer3.remaining());
            this.f12569c.put(byteBuffer3);
        }
        this.f47250r = hVar.e;
        return true;
    }

    public final boolean h() {
        if (this.f47251s > 0) {
            return true;
        }
        return false;
    }
}
