package t4;

import java.nio.ByteBuffer;
import m3.m;
public abstract class e extends m implements g {
    public final String f48142a;

    public e(String str) {
        super(new j[2], new k[2]);
        this.f48142a = str;
        setInitialInputBufferSize(1024);
    }

    public abstract f c(int i10, boolean z10, byte[] bArr);

    @Override
    public final m3.i createInputBuffer() {
        return new j();
    }

    @Override
    public final m3.k createOutputBuffer() {
        return new d(this, 1);
    }

    @Override
    public final m3.g createUnexpectedDecodeException(Throwable th2) {
        return new Exception("Unexpected decode error", th2);
    }

    @Override
    public final m3.g decode(m3.i iVar, m3.k kVar, boolean z10) {
        j jVar = (j) iVar;
        k kVar2 = (k) kVar;
        try {
            ByteBuffer byteBuffer = jVar.f16828b;
            byteBuffer.getClass();
            kVar2.a(jVar.d, c(byteBuffer.limit(), z10, byteBuffer.array()), jVar.f48144n);
            kVar2.clearFlag(Integer.MIN_VALUE);
            return null;
        } catch (h e10) {
            return e10;
        }
    }

    @Override
    public final String getName() {
        return this.f48142a;
    }

    @Override
    public final void a(long j10) {
    }
}
