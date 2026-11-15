package u2;

import a8.ja;
import java.nio.ByteBuffer;
public final class g extends k2.h {
    public long f57760r;
    public int f57761s;
    public int f57762w;

    @Override
    public final void clear() {
        super.clear();
        this.f57761s = 0;
    }

    public final boolean e(k2.h hVar) {
        ByteBuffer byteBuffer;
        ja.f(!hVar.getFlag(1073741824));
        ja.f(!hVar.hasSupplementalData());
        ja.f(!hVar.isEndOfStream());
        if (f()) {
            if (this.f57761s < this.f57762w) {
                ByteBuffer byteBuffer2 = hVar.f17732c;
                if (byteBuffer2 != null && (byteBuffer = this.f17732c) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i7 = this.f57761s;
        this.f57761s = i7 + 1;
        if (i7 == 0) {
            this.f17733e = hVar.f17733e;
            if (hVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = hVar.f17732c;
        if (byteBuffer3 != null) {
            b(byteBuffer3.remaining());
            this.f17732c.put(byteBuffer3);
        }
        this.f57760r = hVar.f17733e;
        return true;
    }

    public final boolean f() {
        if (this.f57761s > 0) {
            return true;
        }
        return false;
    }
}
