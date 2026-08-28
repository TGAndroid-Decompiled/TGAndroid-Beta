package r4;

import java.nio.ByteBuffer;
import k3.m;
public abstract class e extends m implements g {
    public final String f47059a;

    public e(String str) {
        super(new j[2], new k[2]);
        this.f47059a = str;
        setInitialInputBufferSize(1024);
    }

    public abstract f c(int i9, boolean z10, byte[] bArr);

    @Override
    public final k3.i createInputBuffer() {
        return new j();
    }

    @Override
    public final k3.k createOutputBuffer() {
        return new d(this, 1);
    }

    @Override
    public final k3.g createUnexpectedDecodeException(Throwable th) {
        return new Exception("Unexpected decode error", th);
    }

    @Override
    public final k3.g decode(k3.i iVar, k3.k kVar, boolean z10) {
        j jVar = (j) iVar;
        k kVar2 = (k) kVar;
        try {
            ByteBuffer byteBuffer = jVar.f14608b;
            byteBuffer.getClass();
            kVar2.a(jVar.d, c(byteBuffer.limit(), z10, byteBuffer.array()), jVar.f47061n);
            kVar2.clearFlag(Integer.MIN_VALUE);
            return null;
        } catch (h e10) {
            return e10;
        }
    }

    @Override
    public final String getName() {
        return this.f47059a;
    }

    @Override
    public final void a(long j10) {
    }
}
