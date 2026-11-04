package y2;

import b4.i;
import b4.j;
import b4.m;
import j2.f;
import j2.h;
import j2.l;
import java.nio.ByteBuffer;
public final class b extends l implements b4.e {
    public final String f58896o;
    public final m f58897p;

    public b(String str, m mVar) {
        super(new i[2], new j[2]);
        this.f58896o = str;
        o(1024);
        this.f58897p = mVar;
    }

    @Override
    public final h f() {
        return new i();
    }

    @Override
    public final j2.j g() {
        return new b4.c(this);
    }

    @Override
    public final String getName() {
        return this.f58896o;
    }

    @Override
    public final f h(Throwable th2) {
        return new Exception("Unexpected decode error", th2);
    }

    @Override
    public final f i(h hVar, j2.j jVar, boolean z10) {
        i iVar = (i) hVar;
        j jVar2 = (j) jVar;
        try {
            ByteBuffer byteBuffer = iVar.f16157c;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            m mVar = this.f58897p;
            if (z10) {
                mVar.reset();
            }
            b4.d B = mVar.B(0, limit, array);
            long j10 = iVar.f16158e;
            long j11 = iVar.f2369r;
            jVar2.timeUs = j10;
            jVar2.f2370a = B;
            if (j11 != Long.MAX_VALUE) {
                j10 = j11;
            }
            jVar2.f2371b = j10;
            jVar2.shouldBeSkipped = false;
            return null;
        } catch (b4.f e10) {
            return e10;
        }
    }

    @Override
    public final void b(long j10) {
    }
}
