package u2;

import a8.la;
import java.nio.ByteBuffer;
public final class g extends k2.h {
    public long f58369r;
    public int f58370s;
    public int f58371w;

    @Override
    public final void clear() {
        super.clear();
        this.f58370s = 0;
    }

    public final boolean e(k2.h hVar) {
        ByteBuffer byteBuffer;
        la.f(!hVar.getFlag(1073741824));
        la.f(!hVar.hasSupplementalData());
        la.f(!hVar.isEndOfStream());
        if (f()) {
            if (this.f58370s < this.f58371w) {
                ByteBuffer byteBuffer2 = hVar.f18155c;
                if (byteBuffer2 != null && (byteBuffer = this.f18155c) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i7 = this.f58370s;
        this.f58370s = i7 + 1;
        if (i7 == 0) {
            this.f18156e = hVar.f18156e;
            if (hVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = hVar.f18155c;
        if (byteBuffer3 != null) {
            b(byteBuffer3.remaining());
            this.f18155c.put(byteBuffer3);
        }
        this.f58369r = hVar.f18156e;
        return true;
    }

    public final boolean f() {
        if (this.f58370s > 0) {
            return true;
        }
        return false;
    }
}
