package r3;

import j3.n0;
import java.io.EOFException;
public final class j implements v {
    public final byte[] f43251a = new byte[4096];

    @Override
    public final void a(int i10, h5.w wVar) {
        wVar.G(i10);
    }

    @Override
    public final void d(int i10, h5.w wVar) {
        wVar.G(i10);
    }

    @Override
    public final int e(g5.j jVar, int i10, boolean z4) {
        byte[] bArr = this.f43251a;
        int read = jVar.read(bArr, 0, Math.min(bArr.length, i10));
        if (read == -1) {
            if (z4) {
                return -1;
            }
            throw new EOFException();
        }
        return read;
    }

    @Override
    public final void b(n0 n0Var) {
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, u uVar) {
    }
}
