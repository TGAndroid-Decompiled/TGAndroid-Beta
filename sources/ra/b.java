package ra;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import la.g;
import la.u;
import la.v;
public final class b extends u {
    public static final a f47100b = new a();
    public final SimpleDateFormat f47101a;

    public class a implements v {
        @Override
        public final u create(g gVar, sa.a aVar) {
            if (aVar.f47502a == Time.class) {
                return new b(0);
            }
            return null;
        }
    }

    public b(int i9) {
        this();
    }

    @Override
    public final Object read(ta.a aVar) {
        Time time;
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        synchronized (this) {
            TimeZone timeZone = this.f47101a.getTimeZone();
            try {
                time = new Time(this.f47101a.parse(v).getTime());
                this.f47101a.setTimeZone(timeZone);
            } catch (ParseException e10) {
                throw new RuntimeException("Failed parsing '" + v + "' as SQL Time; at path " + aVar.j(), e10);
            }
        }
        return time;
    }

    @Override
    public final void write(ta.c cVar, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            cVar.i();
            return;
        }
        synchronized (this) {
            format = this.f47101a.format((Date) time);
        }
        cVar.r(format);
    }

    private b() {
        this.f47101a = new SimpleDateFormat("hh:mm:ss a");
    }
}
