package pa;

public class f0 extends ma.u {
    @Override
    public final Object read(ua.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String strV = aVar.v();
        if (strV.length() == 1) {
            return Character.valueOf(strV.charAt(0));
        }
        StringBuilder sbR = a9.p.r("Expecting character, got: ", strV, "; at ");
        sbR.append(aVar.j());
        throw new ma.j(sbR.toString());
    }

    @Override
    public final void write(ua.b bVar, Object obj) {
        Character ch2 = (Character) obj;
        bVar.r(ch2 == null ? null : String.valueOf(ch2));
    }
}
