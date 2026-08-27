package pa;

import java.util.Currency;

public class r0 extends ma.u {
    @Override
    public final Object read(ua.a aVar) {
        String strV = aVar.v();
        try {
            return Currency.getInstance(strV);
        } catch (IllegalArgumentException e9) {
            StringBuilder sbR = a9.p.r("Failed parsing '", strV, "' as Currency; at path ");
            sbR.append(aVar.j());
            throw new ma.j(sbR.toString(), e9);
        }
    }

    @Override
    public final void write(ua.b bVar, Object obj) {
        bVar.r(((Currency) obj).getCurrencyCode());
    }
}
