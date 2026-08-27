package pa;

public class g0 extends ma.u {
    @Override
    public final Object read(ua.a aVar) {
        int iX = aVar.x();
        if (iX != 9) {
            return iX == 8 ? Boolean.toString(aVar.n()) : aVar.v();
        }
        aVar.t();
        return null;
    }

    @Override
    public final void write(ua.b bVar, Object obj) {
        bVar.r((String) obj);
    }
}
