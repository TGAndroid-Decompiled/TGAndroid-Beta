package qa;

import java.util.Currency;
public class r0 extends na.u {
    @Override
    public final Object read(va.a aVar) {
        String v = aVar.v();
        try {
            return Currency.getInstance(v);
        } catch (IllegalArgumentException e10) {
            StringBuilder s10 = a4.w.s("Failed parsing '", v, "' as Currency; at path ");
            s10.append(aVar.j());
            throw new RuntimeException(s10.toString(), e10);
        }
    }

    @Override
    public final void write(va.b bVar, Object obj) {
        bVar.r(((Currency) obj).getCurrencyCode());
    }
}
