package r2;

import java.nio.ByteBuffer;
import v7.t6;
public final class g extends h2.h {
    public long f46231r;
    public int f46232s;
    public int f46233w;

    @Override
    public final void clear() {
        super.clear();
        this.f46232s = 0;
    }

    public final boolean e(h2.h hVar) {
        ByteBuffer byteBuffer;
        t6.f(!hVar.getFlag(1073741824));
        t6.f(!hVar.hasSupplementalData());
        t6.f(!hVar.isEndOfStream());
        if (f()) {
            if (this.f46232s < this.f46233w) {
                ByteBuffer byteBuffer2 = hVar.f7586c;
                if (byteBuffer2 != null && (byteBuffer = this.f7586c) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i10 = this.f46232s;
        this.f46232s = i10 + 1;
        if (i10 == 0) {
            this.e = hVar.e;
            if (hVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = hVar.f7586c;
        if (byteBuffer3 != null) {
            c(byteBuffer3.remaining());
            this.f7586c.put(byteBuffer3);
        }
        this.f46231r = hVar.e;
        return true;
    }

    public final boolean f() {
        if (this.f46232s > 0) {
            return true;
        }
        return false;
    }
}
