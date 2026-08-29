package ta;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import na.g;
import na.u;
import na.v;
public final class a extends u {
    public static final C0000a f48181b = new C0000a();
    public final SimpleDateFormat f48182a;

    public class C0000a implements v {
        @Override
        public final u create(g gVar, ua.a aVar) {
            if (aVar.f49163a == Date.class) {
                return new a(0);
            }
            return null;
        }
    }

    public a(int i10) {
        this();
    }

    @Override
    public final Object read(va.a aVar) {
        Date date;
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        synchronized (this) {
            TimeZone timeZone = this.f48182a.getTimeZone();
            try {
                date = new Date(this.f48182a.parse(v).getTime());
                this.f48182a.setTimeZone(timeZone);
            } catch (ParseException e10) {
                throw new RuntimeException("Failed parsing '" + v + "' as SQL Date; at path " + aVar.j(), e10);
            }
        }
        return date;
    }

    @Override
    public final void write(va.b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.i();
            return;
        }
        synchronized (this) {
            format = this.f48182a.format((java.util.Date) date);
        }
        bVar.r(format);
    }

    private a() {
        this.f48182a = new SimpleDateFormat("MMM d, yyyy");
    }
}
