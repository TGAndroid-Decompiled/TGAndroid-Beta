package w7;

import java.nio.ByteBuffer;
public abstract class l {
    public b2.u0 a(l3.a aVar) {
        boolean z10;
        ByteBuffer byteBuffer = aVar.f7587c;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        v7.t6.f(z10);
        return b(aVar, byteBuffer);
    }

    public abstract b2.u0 b(l3.a aVar, ByteBuffer byteBuffer);
}
