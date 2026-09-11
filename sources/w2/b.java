package w2;

import h2.g;
import h2.h;
import h2.j;
import java.nio.ByteBuffer;
import z3.f;
import z3.i;
import z3.m;
public final class b extends j implements z3.e {
    public final m f47912o;

    public b(String str, m mVar) {
        super(new i[2], new z3.j[2]);
        boolean z10;
        int i10 = this.f10861g;
        g[] gVarArr = this.f10859e;
        if (i10 == gVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        for (g gVar : gVarArr) {
            gVar.l(1024);
        }
        this.f47912o = mVar;
    }

    @Override
    public final g f() {
        return new i();
    }

    @Override
    public final h g() {
        return new z3.c(this);
    }

    @Override
    public final h2.e h(Throwable th2) {
        return new Exception("Unexpected decode error", th2);
    }

    @Override
    public final h2.e i(g gVar, h hVar, boolean z10) {
        i iVar = (i) gVar;
        z3.j jVar = (z3.j) hVar;
        try {
            ByteBuffer byteBuffer = iVar.f10847e;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            m mVar = this.f47912o;
            if (z10) {
                mVar.reset();
            }
            z3.d p5 = mVar.p(0, limit, array);
            long j3 = iVar.h;
            long j10 = iVar.v;
            jVar.f10852c = j3;
            jVar.f50699f = p5;
            if (j10 != Long.MAX_VALUE) {
                j3 = j10;
            }
            jVar.h = j3;
            jVar.f10853e = false;
            return null;
        } catch (f e7) {
            return e7;
        }
    }

    @Override
    public final void b(long j3) {
    }
}
