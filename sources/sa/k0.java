package sa;
public class k0 extends pa.u {
    @Override
    public final Object read(xa.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        return new StringBuilder(aVar.v());
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        String sb;
        StringBuilder sb2 = (StringBuilder) obj;
        if (sb2 == null) {
            sb = null;
        } else {
            sb = sb2.toString();
        }
        bVar.r(sb);
    }
}
