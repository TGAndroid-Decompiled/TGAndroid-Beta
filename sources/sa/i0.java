package sa;

import java.math.BigInteger;
public class i0 extends pa.u {
    @Override
    public final Object read(xa.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        try {
            ra.d.d(v);
            return new BigInteger(v);
        } catch (NumberFormatException e) {
            StringBuilder t6 = android.support.v4.media.a.t("Failed parsing '", v, "' as BigInteger; at path ");
            t6.append(aVar.j());
            throw new RuntimeException(t6.toString(), e);
        }
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        bVar.q((BigInteger) obj);
    }
}
