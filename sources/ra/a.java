package ra;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import la.g;
import la.u;
import la.v;
public final class a extends u {
    public static final C0000a f47098b = new C0000a();
    public final SimpleDateFormat f47099a;

    public class C0000a implements v {
        @Override
        public final u create(g gVar, sa.a aVar) {
            if (aVar.f47502a == Date.class) {
                return new a(0);
            }
            return null;
        }
    }

    public a(int i9) {
        this();
    }

    @Override
    public final Object read(ta.a aVar) {
        Date date;
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        synchronized (this) {
            TimeZone timeZone = this.f47099a.getTimeZone();
            try {
                date = new Date(this.f47099a.parse(v).getTime());
                this.f47099a.setTimeZone(timeZone);
            } catch (ParseException e10) {
                throw new RuntimeException("Failed parsing '" + v + "' as SQL Date; at path " + aVar.j(), e10);
            }
        }
        return date;
    }

    @Override
    public final void write(ta.c cVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            cVar.i();
            return;
        }
        synchronized (this) {
            format = this.f47099a.format((java.util.Date) date);
        }
        cVar.r(format);
    }

    private a() {
        this.f47099a = new SimpleDateFormat("MMM d, yyyy");
    }
}
