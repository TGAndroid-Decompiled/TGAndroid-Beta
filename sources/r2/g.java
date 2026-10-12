package r2;

import java.nio.ByteBuffer;
public final class g extends h2.h {
    public long f47101r;
    public int f47102s;
    public int v;

    @Override
    public final void clear() {
        super.clear();
        this.f47102s = 0;
    }

    public final boolean e(h2.h hVar) {
        ByteBuffer byteBuffer;
        e2.d.b(!hVar.getFlag(1073741824));
        e2.d.b(!hVar.hasSupplementalData());
        e2.d.b(!hVar.isEndOfStream());
        if (f()) {
            if (this.f47102s < this.v) {
                ByteBuffer byteBuffer2 = hVar.f10983c;
                if (byteBuffer2 != null && (byteBuffer = this.f10983c) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i10 = this.f47102s;
        this.f47102s = i10 + 1;
        if (i10 == 0) {
            this.f10984e = hVar.f10984e;
            if (hVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = hVar.f10983c;
        if (byteBuffer3 != null) {
            b(byteBuffer3.remaining());
            this.f10983c.put(byteBuffer3);
        }
        this.f47101r = hVar.f10984e;
        return true;
    }

    public final boolean f() {
        if (this.f47102s > 0) {
            return true;
        }
        return false;
    }
}
