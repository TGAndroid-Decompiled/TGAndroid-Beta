package sa;
public final class q extends pa.u {
    public static final p f47202b = new p(new q(pa.t.f44250b), 0);
    public final pa.t f47203a;

    public q(pa.t tVar) {
        this.f47203a = tVar;
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
            throw new RuntimeException("Expecting number, got: " + w.c.m(x10) + "; at path " + aVar.h());
        }
        return this.f47203a.a(aVar);
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        bVar.q((Number) obj);
    }
}
