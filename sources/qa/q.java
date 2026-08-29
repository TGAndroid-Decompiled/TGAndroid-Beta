package qa;
public final class q extends na.u {
    public static final p f46562b = new p(new q(na.t.f17197b), 0);
    public final na.t f46563a;

    public q(na.t tVar) {
        this.f46563a = tVar;
    }

    @Override
    public final Object read(va.a aVar) {
        int x4 = aVar.x();
        int b10 = m1.j.b(x4);
        if (b10 != 5 && b10 != 6) {
            if (b10 == 8) {
                aVar.t();
                return null;
            }
            throw new RuntimeException("Expecting number, got: " + u3.c.m(x4) + "; at path " + aVar.h());
        }
        return this.f46563a.a(aVar);
    }

    @Override
    public final void write(va.b bVar, Object obj) {
        bVar.q((Number) obj);
    }
}
