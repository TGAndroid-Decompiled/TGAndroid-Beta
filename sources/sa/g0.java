package sa;
public class g0 extends pa.u {
    @Override
    public final Object read(xa.a aVar) {
        int x10 = aVar.x();
        if (x10 == 9) {
            aVar.t();
            return null;
        } else if (x10 == 8) {
            return Boolean.toString(aVar.n());
        } else {
            return aVar.v();
        }
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        bVar.r((String) obj);
    }
}
