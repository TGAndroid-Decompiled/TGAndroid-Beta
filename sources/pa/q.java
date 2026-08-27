package pa;

import java.io.IOException;

public final class q extends ma.u {

    public static final p f45655b = new p(new q(ma.t.f17914b), 0);

    public final ma.t f45656a;

    public q(ma.t tVar) {
        this.f45656a = tVar;
    }

    @Override
    public final Object read(ua.a aVar) {
        int iX = aVar.x();
        int iB = m1.j.b(iX);
        if (iB == 5 || iB == 6) {
            return this.f45656a.a(aVar);
        }
        if (iB == 8) {
            aVar.t();
            return null;
        }
        throw new ma.j("Expecting number, got: " + s3.c.n(iX) + "; at path " + aVar.h());
    }

    @Override
    public final void write(ua.b bVar, Object obj) throws IOException {
        bVar.q((Number) obj);
    }
}
