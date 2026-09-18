package w2;

import h2.f;
import h2.h;
import h2.l;
import java.nio.ByteBuffer;
import z3.i;
import z3.j;
import z3.m;
public final class b extends l implements z3.e {
    public final String f44728o;
    public final m f44729p;

    public b(String str, m mVar) {
        super(new i[2], new j[2]);
        this.f44728o = str;
        o(1024);
        this.f44729p = mVar;
    }

    @Override
    public final h f() {
        return new i();
    }

    @Override
    public final h2.j g() {
        return new z3.c(this);
    }

    @Override
    public final String getName() {
        return this.f44728o;
    }

    @Override
    public final f h(Throwable th2) {
        return new Exception("Unexpected decode error", th2);
    }

    @Override
    public final f i(h hVar, h2.j jVar, boolean z10) {
        i iVar = (i) hVar;
        j jVar2 = (j) jVar;
        try {
            ByteBuffer byteBuffer = iVar.f10096c;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            m mVar = this.f44729p;
            if (z10) {
                mVar.reset();
            }
            z3.d r10 = mVar.r(0, limit, array);
            long j3 = iVar.e;
            long j10 = iVar.f48350r;
            jVar2.timeUs = j3;
            jVar2.f48351a = r10;
            if (j10 != Long.MAX_VALUE) {
                j3 = j10;
            }
            jVar2.f48352b = j3;
            jVar2.shouldBeSkipped = false;
            return null;
        } catch (z3.f e) {
            return e;
        }
    }

    @Override
    public final void b(long j3) {
    }
}
