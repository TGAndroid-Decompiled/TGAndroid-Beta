package qa;
public class g0 extends na.u {
    @Override
    public final Object read(va.a aVar) {
        int x4 = aVar.x();
        if (x4 == 9) {
            aVar.t();
            return null;
        } else if (x4 == 8) {
            return Boolean.toString(aVar.n());
        } else {
            return aVar.v();
        }
    }

    @Override
    public final void write(va.b bVar, Object obj) {
        bVar.r((String) obj);
    }
}
