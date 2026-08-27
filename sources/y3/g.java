package y3;

import java.nio.ByteBuffer;

public final class g extends k3.i {

    public long f49484n;

    public int f49485r;

    public int f49486s;

    @Override
    public final void clear() {
        super.clear();
        this.f49485r = 0;
    }

    public final boolean e(k3.i iVar) {
        ByteBuffer byteBuffer;
        d5.a.f(!iVar.getFlag(1073741824));
        d5.a.f(!iVar.hasSupplementalData());
        d5.a.f(!iVar.isEndOfStream());
        int i10 = this.f49485r;
        if (i10 > 0) {
            if (i10 >= this.f49486s || iVar.isDecodeOnly() != isDecodeOnly()) {
                return false;
            }
            ByteBuffer byteBuffer2 = iVar.f14429b;
            if (byteBuffer2 != null && (byteBuffer = this.f14429b) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i11 = this.f49485r;
        this.f49485r = i11 + 1;
        if (i11 == 0) {
            this.d = iVar.d;
            if (iVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        if (iVar.isDecodeOnly()) {
            setFlags(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer3 = iVar.f14429b;
        if (byteBuffer3 != null) {
            b(byteBuffer3.remaining());
            this.f14429b.put(byteBuffer3);
        }
        this.f49484n = iVar.d;
        return true;
    }
}
