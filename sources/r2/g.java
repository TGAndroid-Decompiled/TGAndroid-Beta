package r2;

import java.nio.ByteBuffer;
public final class g extends h2.h {
    public long f42274r;
    public int f42275s;
    public int v;

    @Override
    public final void clear() {
        super.clear();
        this.f42275s = 0;
    }

    public final boolean h(h2.h hVar) {
        ByteBuffer byteBuffer;
        e2.d.b(!hVar.getFlag(1073741824));
        e2.d.b(!hVar.hasSupplementalData());
        e2.d.b(!hVar.isEndOfStream());
        if (i()) {
            if (this.f42275s < this.v) {
                ByteBuffer byteBuffer2 = hVar.f10097c;
                if (byteBuffer2 != null && (byteBuffer = this.f10097c) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i10 = this.f42275s;
        this.f42275s = i10 + 1;
        if (i10 == 0) {
            this.e = hVar.e;
            if (hVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        ByteBuffer byteBuffer3 = hVar.f10097c;
        if (byteBuffer3 != null) {
            c(byteBuffer3.remaining());
            this.f10097c.put(byteBuffer3);
        }
        this.f42274r = hVar.e;
        return true;
    }

    public final boolean i() {
        if (this.f42275s > 0) {
            return true;
        }
        return false;
    }
}
