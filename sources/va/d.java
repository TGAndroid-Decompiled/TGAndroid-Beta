package va;

import java.sql.Timestamp;
import java.util.Date;
import pa.u;
public final class d extends u {
    public static final c f48973b = new c();
    public final u f48974a;

    public d(u uVar) {
        this.f48974a = uVar;
    }

    @Override
    public final Object read(xa.a aVar) {
        Date date = (Date) this.f48974a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        this.f48974a.write(bVar, (Timestamp) obj);
    }
}
