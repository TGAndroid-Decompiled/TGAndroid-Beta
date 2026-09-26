package r2;

import java.nio.ByteBuffer;
public final class g extends h2.h {
    public long f42239r;
    public int f42240s;
    public int v;

    @Override
    public final void clear() {
        super.clear();
        this.f42240s = 0;
    }

    public final boolean e(h2.h hVar) {
        ByteBuffer byteBuffer;
        e2.d.b(!hVar.getFlag(1073741824));
        e2.d.b(!hVar.hasSupplementalData());
        e2.d.b(!hVar.isEndOfStream());
        if (f()) {
            if (this.f42240s < this.v) {
                ByteBuffer byteBuffer2 = hVar.f10078c;
                if (byteBuffer2 != null && (byteBuffer = this.f10078c) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i10 = this.f42240s;
        this.f42240s = i10 + 1;
        if (i10 == 0) {
            this.e = hVar.e;
            if (hVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = hVar.f10078c;
        if (byteBuffer3 != null) {
            b(byteBuffer3.remaining());
            this.f10078c.put(byteBuffer3);
        }
        this.f42239r = hVar.e;
        return true;
    }

    public final boolean f() {
        if (this.f42240s > 0) {
            return true;
        }
        return false;
    }
}
