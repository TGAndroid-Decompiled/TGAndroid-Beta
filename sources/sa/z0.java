package sa;
public class z0 extends pa.u {
    @Override
    public final Object read(xa.a aVar) {
        int x10 = aVar.x();
        if (x10 == 9) {
            aVar.t();
            return null;
        } else if (x10 == 6) {
            return Boolean.valueOf(Boolean.parseBoolean(aVar.v()));
        } else {
            return Boolean.valueOf(aVar.n());
        }
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        bVar.p((Boolean) obj);
    }
}
