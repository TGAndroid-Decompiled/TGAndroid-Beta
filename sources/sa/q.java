package sa;

import vh.w2;
public final class q extends pa.u {
    public static final p f44279b = new p(new q(pa.t.f41114b), 0);
    public final pa.t f44280a;

    public q(pa.t tVar) {
        this.f44280a = tVar;
    }

    @Override
    public final Object read(xa.a aVar) {
        int x10 = aVar.x();
        int c3 = m1.j.c(x10);
        if (c3 != 5 && c3 != 6) {
            if (c3 == 8) {
                aVar.t();
                return null;
            }
            throw new RuntimeException("Expecting number, got: " + w2.m(x10) + "; at path " + aVar.h());
        }
        return this.f44280a.a(aVar);
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        bVar.q((Number) obj);
    }
}
