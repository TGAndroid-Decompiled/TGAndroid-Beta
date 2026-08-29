package qa;
public class e0 extends na.u {
    @Override
    public final Object read(va.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        return Double.valueOf(aVar.o());
    }

    @Override
    public final void write(va.b bVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            bVar.i();
        } else {
            bVar.n(number.doubleValue());
        }
    }
}
