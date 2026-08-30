package va;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import pa.g;
import pa.u;
import pa.v;
public final class a extends u {
    public static final C0000a f45636b = new C0000a();
    public final SimpleDateFormat f45637a;

    public class C0000a implements v {
        @Override
        public final u create(g gVar, wa.a aVar) {
            if (aVar.f46505a == Date.class) {
                return new a(0);
            }
            return null;
        }
    }

    public a(int i10) {
        this();
    }

    @Override
    public final Object read(xa.a aVar) {
        Date date;
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        synchronized (this) {
            TimeZone timeZone = this.f45637a.getTimeZone();
            try {
                date = new Date(this.f45637a.parse(v).getTime());
                this.f45637a.setTimeZone(timeZone);
            } catch (ParseException e) {
                throw new RuntimeException("Failed parsing '" + v + "' as SQL Date; at path " + aVar.j(), e);
            }
        }
        return date;
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.i();
            return;
        }
        synchronized (this) {
            format = this.f45637a.format((java.util.Date) date);
        }
        bVar.r(format);
    }

    private a() {
        this.f45637a = new SimpleDateFormat("MMM d, yyyy");
    }
}
