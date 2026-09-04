package w7;

import java.nio.ByteBuffer;
public abstract class l {
    public b2.p0 a(l3.a aVar) {
        boolean z10;
        ByteBuffer byteBuffer = aVar.f10847e;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        return b(aVar, byteBuffer);
    }

    public abstract b2.p0 b(l3.a aVar, ByteBuffer byteBuffer);
}
