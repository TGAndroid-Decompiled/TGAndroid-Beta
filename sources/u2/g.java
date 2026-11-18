package u2;

import a8.la;
import java.nio.ByteBuffer;
public final class g extends k2.h {
    public long f58328r;
    public int f58329s;
    public int f58330w;

    @Override
    public final void clear() {
        super.clear();
        this.f58329s = 0;
    }

    public final boolean e(k2.h hVar) {
        ByteBuffer byteBuffer;
        la.f(!hVar.getFlag(1073741824));
        la.f(!hVar.hasSupplementalData());
        la.f(!hVar.isEndOfStream());
        if (f()) {
            if (this.f58329s < this.f58330w) {
                ByteBuffer byteBuffer2 = hVar.f18124c;
                if (byteBuffer2 != null && (byteBuffer = this.f18124c) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i7 = this.f58329s;
        this.f58329s = i7 + 1;
        if (i7 == 0) {
            this.f18125e = hVar.f18125e;
            if (hVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = hVar.f18124c;
        if (byteBuffer3 != null) {
            b(byteBuffer3.remaining());
            this.f18124c.put(byteBuffer3);
        }
        this.f58328r = hVar.f18125e;
        return true;
    }

    public final boolean f() {
        if (this.f58329s > 0) {
            return true;
        }
        return false;
    }
}
