package w2;

import h2.f;
import h2.h;
import h2.l;
import java.nio.ByteBuffer;
import z3.i;
import z3.j;
import z3.m;
public final class b extends l implements z3.e {
    public final String f48457o;
    public final m f48458p;

    public b(String str, m mVar) {
        super(new i[2], new j[2]);
        this.f48457o = str;
        o(1024);
        this.f48458p = mVar;
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
        return this.f48457o;
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
            ByteBuffer byteBuffer = iVar.f11636c;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            m mVar = this.f48458p;
            if (z10) {
                mVar.reset();
            }
            z3.d a2 = mVar.a(0, limit, array);
            long j10 = iVar.e;
            long j11 = iVar.f50650r;
            jVar2.timeUs = j10;
            jVar2.f50651a = a2;
            if (j11 != Long.MAX_VALUE) {
                j10 = j11;
            }
            jVar2.f50652b = j10;
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
