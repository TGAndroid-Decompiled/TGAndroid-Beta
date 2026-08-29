package ta;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import na.g;
import na.u;
import na.v;
public final class b extends u {
    public static final a f48183b = new a();
    public final SimpleDateFormat f48184a;

    public class a implements v {
        @Override
        public final u create(g gVar, ua.a aVar) {
            if (aVar.f49163a == Time.class) {
                return new b(0);
            }
            return null;
        }
    }

    public b(int i10) {
        this();
    }

    @Override
    public final Object read(va.a aVar) {
        Time time;
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        synchronized (this) {
            TimeZone timeZone = this.f48184a.getTimeZone();
            try {
                time = new Time(this.f48184a.parse(v).getTime());
                this.f48184a.setTimeZone(timeZone);
            } catch (ParseException e10) {
                throw new RuntimeException("Failed parsing '" + v + "' as SQL Time; at path " + aVar.j(), e10);
            }
        }
        return time;
    }

    @Override
    public final void write(va.b bVar, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            bVar.i();
            return;
        }
        synchronized (this) {
            format = this.f48184a.format((Date) time);
        }
        bVar.r(format);
    }

    private b() {
        this.f48184a = new SimpleDateFormat("hh:mm:ss a");
    }
}
