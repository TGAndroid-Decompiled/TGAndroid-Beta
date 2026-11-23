package u2;

import a8.ma;
import java.nio.ByteBuffer;
public final class g extends k2.h {
    public long f58338r;
    public int f58339s;
    public int f58340w;

    @Override
    public final void clear() {
        super.clear();
        this.f58339s = 0;
    }

    public final boolean e(k2.h hVar) {
        ByteBuffer byteBuffer;
        ma.f(!hVar.getFlag(1073741824));
        ma.f(!hVar.hasSupplementalData());
        ma.f(!hVar.isEndOfStream());
        if (f()) {
            if (this.f58339s < this.f58340w) {
                ByteBuffer byteBuffer2 = hVar.f18121c;
                if (byteBuffer2 != null && (byteBuffer = this.f18121c) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i7 = this.f58339s;
        this.f58339s = i7 + 1;
        if (i7 == 0) {
            this.f18122e = hVar.f18122e;
            if (hVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = hVar.f18121c;
        if (byteBuffer3 != null) {
            b(byteBuffer3.remaining());
            this.f18121c.put(byteBuffer3);
        }
        this.f58338r = hVar.f18122e;
        return true;
    }

    public final boolean f() {
        if (this.f58339s > 0) {
            return true;
        }
        return false;
    }
}
