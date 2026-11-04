package t2;

import b8.zb;
import java.nio.ByteBuffer;
public final class g extends j2.h {
    public long f54842r;
    public int f54843s;
    public int f54844w;

    @Override
    public final void clear() {
        super.clear();
        this.f54843s = 0;
    }

    public final boolean e(j2.h hVar) {
        ByteBuffer byteBuffer;
        zb.f(!hVar.getFlag(1073741824));
        zb.f(!hVar.hasSupplementalData());
        zb.f(!hVar.isEndOfStream());
        if (f()) {
            if (this.f54843s < this.f54844w) {
                ByteBuffer byteBuffer2 = hVar.f16157c;
                if (byteBuffer2 != null && (byteBuffer = this.f16157c) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i3 = this.f54843s;
        this.f54843s = i3 + 1;
        if (i3 == 0) {
            this.f16158e = hVar.f16158e;
            if (hVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = hVar.f16157c;
        if (byteBuffer3 != null) {
            b(byteBuffer3.remaining());
            this.f16157c.put(byteBuffer3);
        }
        this.f54842r = hVar.f16158e;
        return true;
    }

    public final boolean f() {
        if (this.f54843s > 0) {
            return true;
        }
        return false;
    }
}
