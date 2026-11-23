package u2;

import a8.ma;
import java.nio.ByteBuffer;
public final class g extends k2.h {
    public long f58453r;
    public int f58454s;
    public int f58455w;

    @Override
    public final void clear() {
        super.clear();
        this.f58454s = 0;
    }

    public final boolean e(k2.h hVar) {
        ByteBuffer byteBuffer;
        ma.f(!hVar.getFlag(1073741824));
        ma.f(!hVar.hasSupplementalData());
        ma.f(!hVar.isEndOfStream());
        if (f()) {
            if (this.f58454s < this.f58455w) {
                ByteBuffer byteBuffer2 = hVar.f18223c;
                if (byteBuffer2 != null && (byteBuffer = this.f18223c) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i7 = this.f58454s;
        this.f58454s = i7 + 1;
        if (i7 == 0) {
            this.f18224e = hVar.f18224e;
            if (hVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = hVar.f18223c;
        if (byteBuffer3 != null) {
            b(byteBuffer3.remaining());
            this.f18223c.put(byteBuffer3);
        }
        this.f58453r = hVar.f18224e;
        return true;
    }

    public final boolean f() {
        if (this.f58454s > 0) {
            return true;
        }
        return false;
    }
}
