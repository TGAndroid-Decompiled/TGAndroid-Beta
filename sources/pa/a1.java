package pa;

public class a1 extends ma.u {
    @Override
    public final Object read(ua.a aVar) {
        if (aVar.x() != 9) {
            return Boolean.valueOf(aVar.v());
        }
        aVar.t();
        return null;
    }

    @Override
    public final void write(ua.b bVar, Object obj) {
        Boolean bool = (Boolean) obj;
        bVar.r(bool == null ? "null" : bool.toString());
    }
}
