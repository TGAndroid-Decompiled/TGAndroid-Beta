package ta;

import java.sql.Timestamp;
import java.util.Date;
import na.u;
public final class d extends u {
    public static final c f48185b = new c();
    public final u f48186a;

    public d(u uVar) {
        this.f48186a = uVar;
    }

    @Override
    public final Object read(va.a aVar) {
        Date date = (Date) this.f48186a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override
    public final void write(va.b bVar, Object obj) {
        this.f48186a.write(bVar, (Timestamp) obj);
    }
}
