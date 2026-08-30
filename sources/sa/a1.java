package sa;
public class a1 extends pa.u {
    @Override
    public final Object read(xa.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        return Boolean.valueOf(aVar.v());
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        String bool;
        Boolean bool2 = (Boolean) obj;
        if (bool2 == null) {
            bool = "null";
        } else {
            bool = bool2.toString();
        }
        bVar.r(bool);
    }
}
