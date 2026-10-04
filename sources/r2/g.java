package r2;

import java.nio.ByteBuffer;
public final class g extends h2.h {
    public long f45720r;
    public int f45721s;
    public int v;

    @Override
    public final void clear() {
        super.clear();
        this.f45721s = 0;
    }

    public final boolean e(h2.h hVar) {
        ByteBuffer byteBuffer;
        e2.d.b(!hVar.getFlag(1073741824));
        e2.d.b(!hVar.hasSupplementalData());
        e2.d.b(!hVar.isEndOfStream());
        if (f()) {
            if (this.f45721s < this.v) {
                ByteBuffer byteBuffer2 = hVar.f10979c;
                if (byteBuffer2 != null && (byteBuffer = this.f10979c) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i10 = this.f45721s;
        this.f45721s = i10 + 1;
        if (i10 == 0) {
            this.f10980e = hVar.f10980e;
            if (hVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = hVar.f10979c;
        if (byteBuffer3 != null) {
            b(byteBuffer3.remaining());
            this.f10979c.put(byteBuffer3);
        }
        this.f45720r = hVar.f10980e;
        return true;
    }

    public final boolean f() {
        if (this.f45721s > 0) {
            return true;
        }
        return false;
    }
}
