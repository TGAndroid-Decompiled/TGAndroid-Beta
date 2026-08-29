package qa;
public class k0 extends na.u {
    @Override
    public final Object read(va.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        return new StringBuilder(aVar.v());
    }

    @Override
    public final void write(va.b bVar, Object obj) {
        String sb2;
        StringBuilder sb3 = (StringBuilder) obj;
        if (sb3 == null) {
            sb2 = null;
        } else {
            sb2 = sb3.toString();
        }
        bVar.r(sb2);
    }
}
