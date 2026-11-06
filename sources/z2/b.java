package z2;

import c4.i;
import c4.j;
import c4.m;
import java.nio.ByteBuffer;
import k2.h;
import k2.l;
public final class b extends l implements c4.e {
    public final String f59448o;
    public final m f59449p;

    public b(String str, m mVar) {
        super(new i[2], new j[2]);
        this.f59448o = str;
        o(1024);
        this.f59449p = mVar;
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
        return this.f59448o;
    }

    @Override
    public final k2.f h(Throwable th2) {
        return new Exception("Unexpected decode error", th2);
    }

    @Override
    public final k2.f i(h hVar, k2.j jVar, boolean z9) {
        i iVar = (i) hVar;
        j jVar2 = (j) jVar;
        try {
            ByteBuffer byteBuffer = iVar.f17172c;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            m mVar = this.f59449p;
            if (z9) {
                mVar.reset();
            }
            c4.d c10 = mVar.c(0, limit, array);
            long j3 = iVar.f17173e;
            long j10 = iVar.f5286r;
            jVar2.timeUs = j3;
            jVar2.f5287a = c10;
            if (j10 != Long.MAX_VALUE) {
                j3 = j10;
            }
            jVar2.f5288b = j3;
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
