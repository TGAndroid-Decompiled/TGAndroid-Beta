package w2;

import h2.f;
import h2.h;
import h2.l;
import java.nio.ByteBuffer;
import z3.i;
import z3.j;
import z3.m;
public final class b extends l implements z3.e {
    public final String f50652o;
    public final m f50653p;

    public b(String str, m mVar) {
        super(new i[2], new j[2]);
        this.f50652o = str;
        o(1024);
        this.f50653p = mVar;
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
        return this.f50652o;
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
            ByteBuffer byteBuffer = iVar.f12570c;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            m mVar = this.f50653p;
            if (z10) {
                mVar.reset();
            }
            z3.d j10 = mVar.j(0, limit, array);
            long j11 = iVar.e;
            long j12 = iVar.f52658r;
            jVar2.timeUs = j11;
            jVar2.f52659a = j10;
            if (j12 != Long.MAX_VALUE) {
                j11 = j12;
            }
            jVar2.f52660b = j11;
            jVar2.shouldBeSkipped = false;
            return null;
        } catch (z3.f e) {
            return e;
        }
    }

    @Override
    public final void b(long j10) {
    }
}
