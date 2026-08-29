package qa;

import java.math.BigDecimal;
public class h0 extends na.u {
    @Override
    public final Object read(va.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        try {
            return pa.d.i(v);
        } catch (NumberFormatException e10) {
            StringBuilder s10 = a4.w.s("Failed parsing '", v, "' as BigDecimal; at path ");
            s10.append(aVar.j());
            throw new RuntimeException(s10.toString(), e10);
        }
    }

    @Override
    public final void write(va.b bVar, Object obj) {
        bVar.q((BigDecimal) obj);
    }
}
