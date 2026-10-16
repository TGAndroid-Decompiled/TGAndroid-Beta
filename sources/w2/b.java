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
    public final String f47072o;
    public final n f47073p;

    public b(String str, n nVar) {
        super(new j[2], new k[2]);
        this.f47072o = str;
        o(1024);
        this.f47073p = nVar;
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
        return this.f47072o;
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
            ByteBuffer byteBuffer = jVar2.f10330c;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            n nVar = this.f47073p;
            if (z10) {
                nVar.reset();
            }
            z3.e x10 = nVar.x(0, limit, array);
            long j10 = jVar2.e;
            long j11 = jVar2.f49267r;
            kVar.timeUs = j10;
            kVar.f49268a = x10;
            if (j11 != Long.MAX_VALUE) {
                j10 = j11;
            }
            kVar.f49269b = j10;
            kVar.shouldBeSkipped = false;
            return null;
        } catch (g e) {
            return e;
        }
    }

    @Override
    public final void b(long j10) {
    }
}
