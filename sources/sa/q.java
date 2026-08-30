package sa;

import vh.v2;
public final class q extends pa.u {
    public static final p f44214b = new p(new q(pa.t.f41091b), 0);
    public final pa.t f44215a;

    public q(pa.t tVar) {
        this.f44215a = tVar;
    }

    @Override
    public final Object read(xa.a aVar) {
        int x10 = aVar.x();
        int b10 = m1.j.b(x10);
        if (b10 != 5 && b10 != 6) {
            if (b10 == 8) {
                aVar.t();
                return null;
            }
            throw new RuntimeException("Expecting number, got: " + v2.m(x10) + "; at path " + aVar.h());
        }
        return this.f44215a.a(aVar);
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        bVar.q((Number) obj);
    }
}
