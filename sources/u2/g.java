package u2;

import a8.la;
import java.nio.ByteBuffer;
public final class g extends k2.h {
    public long f58327r;
    public int f58328s;
    public int f58329w;

    @Override
    public final void clear() {
        super.clear();
        this.f58328s = 0;
    }

    public final boolean e(k2.h hVar) {
        ByteBuffer byteBuffer;
        la.f(!hVar.getFlag(1073741824));
        la.f(!hVar.hasSupplementalData());
        la.f(!hVar.isEndOfStream());
        if (f()) {
            if (this.f58328s < this.f58329w) {
                ByteBuffer byteBuffer2 = hVar.f18127c;
                if (byteBuffer2 != null && (byteBuffer = this.f18127c) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i7 = this.f58328s;
        this.f58328s = i7 + 1;
        if (i7 == 0) {
            this.f18128e = hVar.f18128e;
            if (hVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = hVar.f18127c;
        if (byteBuffer3 != null) {
            b(byteBuffer3.remaining());
            this.f18127c.put(byteBuffer3);
        }
        this.f58327r = hVar.f18128e;
        return true;
    }

    public final boolean f() {
        if (this.f58328s > 0) {
            return true;
        }
        return false;
    }
}
