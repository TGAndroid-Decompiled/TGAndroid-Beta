package qa;
public class f0 extends na.u {
    @Override
    public final Object read(va.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        if (v.length() == 1) {
            return Character.valueOf(v.charAt(0));
        }
        StringBuilder s10 = a4.w.s("Expecting character, got: ", v, "; at ");
        s10.append(aVar.j());
        throw new RuntimeException(s10.toString());
    }

    @Override
    public final void write(va.b bVar, Object obj) {
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
