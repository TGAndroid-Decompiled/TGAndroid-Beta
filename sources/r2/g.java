package r2;

import java.nio.ByteBuffer;
public final class g extends h2.h {
    public long f44850r;
    public int f44851s;
    public int v;

    @Override
    public final void clear() {
        super.clear();
        this.f44851s = 0;
    }

    public final boolean f(h2.h hVar) {
        ByteBuffer byteBuffer;
        e2.d.b(!hVar.getFlag(1073741824));
        e2.d.b(!hVar.hasSupplementalData());
        e2.d.b(!hVar.isEndOfStream());
        if (g()) {
            if (this.f44851s < this.v) {
                ByteBuffer byteBuffer2 = hVar.f10876c;
                if (byteBuffer2 != null && (byteBuffer = this.f10876c) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i10 = this.f44851s;
        this.f44851s = i10 + 1;
        if (i10 == 0) {
            this.f10877e = hVar.f10877e;
            if (hVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = hVar.f10876c;
        if (byteBuffer3 != null) {
            b(byteBuffer3.remaining());
            this.f10876c.put(byteBuffer3);
        }
        this.f44850r = hVar.f10877e;
        return true;
    }

    public final boolean g() {
        if (this.f44851s > 0) {
            return true;
        }
        return false;
    }
}
