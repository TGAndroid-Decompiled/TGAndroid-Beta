package sa;

import java.math.BigDecimal;
public class h0 extends pa.u {
    @Override
    public final Object read(xa.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        try {
            return ra.d.i(v);
        } catch (NumberFormatException e) {
            StringBuilder t6 = android.support.v4.media.a.t("Failed parsing '", v, "' as BigDecimal; at path ");
            t6.append(aVar.j());
            throw new RuntimeException(t6.toString(), e);
        }
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        bVar.q((BigDecimal) obj);
    }
}
