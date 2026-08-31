package sa;

import java.util.Currency;
public class r0 extends pa.u {
    @Override
    public final Object read(xa.a aVar) {
        String v = aVar.v();
        try {
            return Currency.getInstance(v);
        } catch (IllegalArgumentException e6) {
            StringBuilder t6 = android.support.v4.media.a.t("Failed parsing '", v, "' as Currency; at path ");
            t6.append(aVar.j());
            throw new RuntimeException(t6.toString(), e6);
        }
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        bVar.r(((Currency) obj).getCurrencyCode());
    }
}
