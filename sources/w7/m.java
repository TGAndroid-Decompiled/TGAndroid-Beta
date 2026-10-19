package w7;

import java.nio.ByteBuffer;
public abstract class m {
    public b2.t0 a(l3.a aVar) {
        boolean z10;
        ByteBuffer byteBuffer = aVar.f11636c;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        v7.u6.g(z10);
        return b(aVar, byteBuffer);
    }

    public abstract b2.t0 b(l3.a aVar, ByteBuffer byteBuffer);
}
