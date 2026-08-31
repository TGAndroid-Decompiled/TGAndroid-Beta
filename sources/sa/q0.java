package sa;

import java.util.UUID;
public class q0 extends pa.u {
    @Override
    public final Object read(xa.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        try {
            return UUID.fromString(v);
        } catch (IllegalArgumentException e6) {
            StringBuilder t6 = android.support.v4.media.a.t("Failed parsing '", v, "' as UUID; at path ");
            t6.append(aVar.j());
            throw new RuntimeException(t6.toString(), e6);
        }
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        String uuid;
        UUID uuid2 = (UUID) obj;
        if (uuid2 == null) {
            uuid = null;
        } else {
            uuid = uuid2.toString();
        }
        bVar.r(uuid);
    }
}
