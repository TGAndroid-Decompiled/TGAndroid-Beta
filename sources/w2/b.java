package w2;

import h2.f;
import h2.h;
import h2.l;
import java.nio.ByteBuffer;
import z3.j;
import z3.k;
import z3.n;
public final class b extends l implements z3.e {
    public final String f48457o;
    public final n f48458p;

    public b(String str, n nVar) {
        super(new j[2], new k[2]);
        this.f48457o = str;
        o(1024);
        this.f48458p = nVar;
    }

    @Override
    public final h f() {
        return new j();
    }

    @Override
    public final h2.j g() {
        return new z3.c(this);
    }

    @Override
    public final String getName() {
        return this.f48457o;
    }

    @Override
    public final f h(Throwable th2) {
        return new Exception("Unexpected decode error", th2);
    }

    @Override
    public final f i(h hVar, h2.j jVar, boolean z10) {
        j jVar2 = (j) hVar;
        k kVar = (k) jVar;
        try {
            ByteBuffer byteBuffer = jVar2.f10979c;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            n nVar = this.f48458p;
            if (z10) {
                nVar.reset();
            }
            z3.d h = nVar.h(0, limit, array);
            long j3 = jVar2.f10980e;
            long j10 = jVar2.f52372r;
            kVar.timeUs = j3;
            kVar.f52373a = h;
            if (j10 != Long.MAX_VALUE) {
                j3 = j10;
            }
            kVar.f52374b = j3;
            kVar.shouldBeSkipped = false;
            return null;
        } catch (z3.f e7) {
            return e7;
        }
    }

    @Override
    public final void b(long j3) {
    }
}
