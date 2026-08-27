package pa;

import java.io.IOException;
import java.math.BigInteger;

public class i0 extends ma.u {
    @Override
    public final Object read(ua.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String strV = aVar.v();
        try {
            oa.d.d(strV);
            return new BigInteger(strV);
        } catch (NumberFormatException e9) {
            StringBuilder sbR = a9.p.r("Failed parsing '", strV, "' as BigInteger; at path ");
            sbR.append(aVar.j());
            throw new ma.j(sbR.toString(), e9);
        }
    }

    @Override
    public final void write(ua.b bVar, Object obj) throws IOException {
        bVar.q((BigInteger) obj);
    }
}
