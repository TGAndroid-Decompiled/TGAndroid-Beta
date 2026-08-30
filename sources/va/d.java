package va;

import java.sql.Timestamp;
import java.util.Date;
import pa.u;
public final class d extends u {
    public static final c f45640b = new c();
    public final u f45641a;

    public d(u uVar) {
        this.f45641a = uVar;
    }

    @Override
    public final Object read(xa.a aVar) {
        Date date = (Date) this.f45641a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        this.f45641a.write(bVar, (Timestamp) obj);
    }
}
