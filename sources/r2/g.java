package r2;

import java.nio.ByteBuffer;
public final class g extends h2.h {
    public long f46976r;
    public int f46977s;
    public int v;

    @Override
    public final void clear() {
        super.clear();
        this.f46977s = 0;
    }

    public final boolean d(h2.h hVar) {
        ByteBuffer byteBuffer;
        e2.d.b(!hVar.getFlag(1073741824));
        e2.d.b(!hVar.hasSupplementalData());
        e2.d.b(!hVar.isEndOfStream());
        if (f()) {
            if (this.f46977s < this.v) {
                ByteBuffer byteBuffer2 = hVar.f10984c;
                if (byteBuffer2 != null && (byteBuffer = this.f10984c) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i10 = this.f46977s;
        this.f46977s = i10 + 1;
        if (i10 == 0) {
            this.f10985e = hVar.f10985e;
            if (hVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = hVar.f10984c;
        if (byteBuffer3 != null) {
            b(byteBuffer3.remaining());
            this.f10984c.put(byteBuffer3);
        }
        this.f46976r = hVar.f10985e;
        return true;
    }

    public final boolean f() {
        if (this.f46977s > 0) {
            return true;
        }
        return false;
    }
}
