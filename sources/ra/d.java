package ra;

import java.sql.Timestamp;
import java.util.Date;
import la.u;
public final class d extends u {
    public static final c f47102b = new c();
    public final u f47103a;

    public d(u uVar) {
        this.f47103a = uVar;
    }

    @Override
    public final Object read(ta.a aVar) {
        Date date = (Date) this.f47103a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override
    public final void write(ta.c cVar, Object obj) {
        this.f47103a.write(cVar, (Timestamp) obj);
    }
}
