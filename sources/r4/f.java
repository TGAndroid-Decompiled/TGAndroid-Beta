package r4;

import java.nio.ByteBuffer;

public abstract class f extends k3.m implements h {

    public final String f46750a;

    public f(String str) {
        super(new k[2], new l[2]);
        this.f46750a = str;
        setInitialInputBufferSize(1024);
    }

    public abstract g c(int i10, boolean z10, byte[] bArr);

    @Override
    public final k3.i createInputBuffer() {
        return new k();
    }

    @Override
    public final k3.k createOutputBuffer() {
        return new e(this, 1);
    }

    @Override
    public final k3.g createUnexpectedDecodeException(Throwable th) {
        return new i("Unexpected decode error", th);
    }

    @Override
    public final k3.g decode(k3.i iVar, k3.k kVar, boolean z10) {
        k kVar2 = (k) iVar;
        l lVar = (l) kVar;
        try {
            ByteBuffer byteBuffer = kVar2.f14429b;
            byteBuffer.getClass();
            lVar.a(kVar2.d, c(byteBuffer.limit(), z10, byteBuffer.array()), kVar2.f46752n);
            lVar.clearFlag(Integer.MIN_VALUE);
            return null;
        } catch (i e9) {
            return e9;
        }
    }

    @Override
    public final String getName() {
        return this.f46750a;
    }

    @Override
    public final void a(long j10) {
    }
}
