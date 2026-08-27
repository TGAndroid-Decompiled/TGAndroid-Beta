package sa;

import java.sql.Timestamp;
import java.util.Date;
import ma.u;

public final class d extends u {

    public static final c f47822b = new c();

    public final u f47823a;

    public d(u uVar) {
        this.f47823a = uVar;
    }

    @Override
    public final Object read(ua.a aVar) {
        Date date = (Date) this.f47823a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override
    public final void write(ua.b bVar, Object obj) {
        this.f47823a.write(bVar, (Timestamp) obj);
    }
}
