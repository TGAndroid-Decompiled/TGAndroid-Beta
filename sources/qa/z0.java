package qa;
public class z0 extends na.u {
    @Override
    public final Object read(va.a aVar) {
        int x4 = aVar.x();
        if (x4 == 9) {
            aVar.t();
            return null;
        } else if (x4 == 6) {
            return Boolean.valueOf(Boolean.parseBoolean(aVar.v()));
        } else {
            return Boolean.valueOf(aVar.n());
        }
    }

    @Override
    public final void write(va.b bVar, Object obj) {
        bVar.p((Boolean) obj);
    }
}
