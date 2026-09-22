package w2;

import h2.h;
import h2.l;
import java.nio.ByteBuffer;
import z3.f;
import z3.g;
import z3.j;
import z3.k;
import z3.n;
public final class b extends l implements f {
    public final String f44471o;
    public final n f44472p;

    public b(String str, n nVar) {
        super(new j[2], new k[2]);
        this.f44471o = str;
        o(1024);
        this.f44472p = nVar;
    }

    @Override
    public final h f() {
        return new j();
    }

    @Override
    public final h2.j g() {
        return new z3.d(this);
    }

    @Override
    public final String getName() {
        return this.f44471o;
    }

    @Override
    public final h2.f h(Throwable th2) {
        return new Exception("Unexpected decode error", th2);
    }

    @Override
    public final h2.f i(h hVar, h2.j jVar, boolean z10) {
        j jVar2 = (j) hVar;
        k kVar = (k) jVar;
        try {
            ByteBuffer byteBuffer = jVar2.f10093c;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            n nVar = this.f44472p;
            if (z10) {
                nVar.reset();
            }
            z3.e r10 = nVar.r(0, limit, array);
            long j3 = jVar2.e;
            long j10 = jVar2.f48089r;
            kVar.timeUs = j3;
            kVar.f48090a = r10;
            if (j10 != Long.MAX_VALUE) {
                j3 = j10;
            }
            kVar.f48091b = j3;
            kVar.shouldBeSkipped = false;
            return null;
        } catch (g e) {
            return e;
        }
    }

    @Override
    public final void b(long j3) {
    }
}
