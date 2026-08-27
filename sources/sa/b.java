package sa;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import ma.g;
import ma.j;
import ma.u;
import ma.v;

public final class b extends u {

    public static final a f47820b = new a();

    public final SimpleDateFormat f47821a;

    public class a implements v {
        @Override
        public final u create(g gVar, ta.a aVar) {
            if (aVar.f48151a == Time.class) {
                return new b(0);
            }
            return null;
        }
    }

    public b(int i10) {
        this();
    }

    @Override
    public final Object read(ua.a aVar) {
        Time time;
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String strV = aVar.v();
        synchronized (this) {
            TimeZone timeZone = this.f47821a.getTimeZone();
            try {
                try {
                    time = new Time(this.f47821a.parse(strV).getTime());
                    this.f47821a.setTimeZone(timeZone);
                } catch (ParseException e9) {
                    throw new j("Failed parsing '" + strV + "' as SQL Time; at path " + aVar.j(), e9);
                }
            } catch (Throwable th) {
                this.f47821a.setTimeZone(timeZone);
                throw th;
            }
        }
        return time;
    }

    @Override
    public final void write(ua.b bVar, Object obj) {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            bVar.i();
            return;
        }
        synchronized (this) {
            str = this.f47821a.format((Date) time);
        }
        bVar.r(str);
    }

    private b() {
        this.f47821a = new SimpleDateFormat("hh:mm:ss a");
    }
}
