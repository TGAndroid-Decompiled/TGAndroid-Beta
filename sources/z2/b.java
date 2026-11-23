package z2;

import c4.i;
import c4.j;
import c4.m;
import java.nio.ByteBuffer;
import k2.f;
import k2.h;
import k2.l;
public final class b extends l implements c4.e {
    public final String f61355o;
    public final m f61356p;

    public b(String str, m mVar) {
        super(new i[2], new j[2]);
        this.f61355o = str;
        o(1024);
        this.f61356p = mVar;
    }

    @Override
    public final h f() {
        return new i();
    }

    @Override
    public final k2.j g() {
        return new c4.c(this);
    }

    @Override
    public final String getName() {
        return this.f61355o;
    }

    @Override
    public final f h(Throwable th2) {
        return new Exception("Unexpected decode error", th2);
    }

    @Override
    public final f i(h hVar, k2.j jVar, boolean z10) {
        i iVar = (i) hVar;
        j jVar2 = (j) jVar;
        try {
            ByteBuffer byteBuffer = iVar.f18121c;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            m mVar = this.f61356p;
            if (z10) {
                mVar.reset();
            }
            c4.d q10 = mVar.q(0, limit, array);
            long j3 = iVar.f18122e;
            long j10 = iVar.f4384r;
            jVar2.timeUs = j3;
            jVar2.f4385a = q10;
            if (j10 != Long.MAX_VALUE) {
                j3 = j10;
            }
            jVar2.f4386b = j3;
            jVar2.shouldBeSkipped = false;
            return null;
        } catch (c4.f e10) {
            return e10;
        }
    }

    @Override
    public final void b(long j3) {
    }
}
