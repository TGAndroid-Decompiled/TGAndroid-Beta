package pa;

import java.util.UUID;

public class q0 extends ma.u {
    @Override
    public final Object read(ua.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String strV = aVar.v();
        try {
            return UUID.fromString(strV);
        } catch (IllegalArgumentException e9) {
            StringBuilder sbR = a9.p.r("Failed parsing '", strV, "' as UUID; at path ");
            sbR.append(aVar.j());
            throw new ma.j(sbR.toString(), e9);
        }
    }

    @Override
    public final void write(ua.b bVar, Object obj) {
        UUID uuid = (UUID) obj;
        bVar.r(uuid == null ? null : uuid.toString());
    }
}
