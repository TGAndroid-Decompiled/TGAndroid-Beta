package sa;
public class f0 extends pa.u {
    @Override
    public final Object read(xa.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        if (v.length() == 1) {
            return Character.valueOf(v.charAt(0));
        }
        StringBuilder t6 = android.support.v4.media.a.t("Expecting character, got: ", v, "; at ");
        t6.append(aVar.j());
        throw new RuntimeException(t6.toString());
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        String valueOf;
        Character ch2 = (Character) obj;
        if (ch2 == null) {
            valueOf = null;
        } else {
            valueOf = String.valueOf(ch2);
        }
        bVar.r(valueOf);
    }
}
