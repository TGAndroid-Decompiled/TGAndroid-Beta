package va;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import pa.g;
import pa.u;
import pa.v;
public final class b extends u {
    public static final a f45702b = new a();
    public final SimpleDateFormat f45703a;

    public class a implements v {
        @Override
        public final u create(g gVar, wa.a aVar) {
            if (aVar.f46587a == Time.class) {
                return new b(0);
            }
            return null;
        }
    }

    public b(int i10) {
        this();
    }

    @Override
    public final Object read(xa.a aVar) {
        Time time;
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        synchronized (this) {
            TimeZone timeZone = this.f45703a.getTimeZone();
            try {
                time = new Time(this.f45703a.parse(v).getTime());
                this.f45703a.setTimeZone(timeZone);
            } catch (ParseException e) {
                throw new RuntimeException("Failed parsing '" + v + "' as SQL Time; at path " + aVar.j(), e);
            }
        }
        return time;
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            bVar.i();
            return;
        }
        synchronized (this) {
            format = this.f45703a.format((Date) time);
        }
        bVar.r(format);
    }

    private b() {
        this.f45703a = new SimpleDateFormat("hh:mm:ss a");
    }
}
