package y3;

import java.nio.ByteBuffer;
public final class g extends k3.i {
    public long f49494n;
    public int f49495r;
    public int f49496s;

    @Override
    public final void clear() {
        super.clear();
        this.f49495r = 0;
    }

    public final boolean e(k3.i iVar) {
        ByteBuffer byteBuffer;
        d5.a.f(!iVar.getFlag(1073741824));
        d5.a.f(!iVar.hasSupplementalData());
        d5.a.f(!iVar.isEndOfStream());
        int i9 = this.f49495r;
        if (i9 > 0) {
            if (i9 < this.f49496s && iVar.isDecodeOnly() == isDecodeOnly()) {
                ByteBuffer byteBuffer2 = iVar.f14608b;
                if (byteBuffer2 != null && (byteBuffer = this.f14608b) != null) {
                    if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        int i10 = this.f49495r;
        this.f49495r = i10 + 1;
        if (i10 == 0) {
            this.d = iVar.d;
            if (iVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        if (iVar.isDecodeOnly()) {
            setFlags(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer3 = iVar.f14608b;
        if (byteBuffer3 != null) {
            c(byteBuffer3.remaining());
            this.f14608b.put(byteBuffer3);
        }
        this.f49494n = iVar.d;
        return true;
    }
}
