package qa;

import java.util.UUID;
public class q0 extends na.u {
    @Override
    public final Object read(va.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        try {
            return UUID.fromString(v);
        } catch (IllegalArgumentException e10) {
            StringBuilder s10 = a4.w.s("Failed parsing '", v, "' as UUID; at path ");
            s10.append(aVar.j());
            throw new RuntimeException(s10.toString(), e10);
        }
    }

    @Override
    public final void write(va.b bVar, Object obj) {
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
