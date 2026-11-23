package u2;

import a8.la;
import java.nio.ByteBuffer;
public final class g extends k2.h {
    public long f58373r;
    public int f58374s;
    public int f58375w;

    @Override
    public final void clear() {
        super.clear();
        this.f58374s = 0;
    }

    public final boolean e(k2.h hVar) {
        ByteBuffer byteBuffer;
        la.f(!hVar.getFlag(1073741824));
        la.f(!hVar.hasSupplementalData());
        la.f(!hVar.isEndOfStream());
        if (f()) {
            if (this.f58374s < this.f58375w) {
                ByteBuffer byteBuffer2 = hVar.f18158c;
                if (byteBuffer2 != null && (byteBuffer = this.f18158c) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i7 = this.f58374s;
        this.f58374s = i7 + 1;
        if (i7 == 0) {
            this.f18159e = hVar.f18159e;
            if (hVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = hVar.f18158c;
        if (byteBuffer3 != null) {
            b(byteBuffer3.remaining());
            this.f18158c.put(byteBuffer3);
        }
        this.f58373r = hVar.f18159e;
        return true;
    }

    public final boolean f() {
        if (this.f58374s > 0) {
            return true;
        }
        return false;
    }
}
