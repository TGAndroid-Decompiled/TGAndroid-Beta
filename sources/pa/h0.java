package pa;

import java.io.IOException;
import java.math.BigDecimal;

public class h0 extends ma.u {
    @Override
    public final Object read(ua.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String strV = aVar.v();
        try {
            return oa.d.i(strV);
        } catch (NumberFormatException e9) {
            StringBuilder sbR = a9.p.r("Failed parsing '", strV, "' as BigDecimal; at path ");
            sbR.append(aVar.j());
            throw new ma.j(sbR.toString(), e9);
        }
    }

    @Override
    public final void write(ua.b bVar, Object obj) throws IOException {
        bVar.q((BigDecimal) obj);
    }
}
