package sa;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import ma.g;
import ma.j;
import ma.u;
import ma.v;

public final class a extends u {

    public static final C0000a f47818b = new C0000a();

    public final SimpleDateFormat f47819a;

    public class C0000a implements v {
        @Override
        public final u create(g gVar, ta.a aVar) {
            if (aVar.f48151a == Date.class) {
                return new a(0);
            }
            return null;
        }
    }

    public a(int i10) {
        this();
    }

    @Override
    public final Object read(ua.a aVar) {
        Date date;
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String strV = aVar.v();
        synchronized (this) {
            TimeZone timeZone = this.f47819a.getTimeZone();
            try {
                try {
                    date = new Date(this.f47819a.parse(strV).getTime());
                    this.f47819a.setTimeZone(timeZone);
                } catch (ParseException e9) {
                    throw new j("Failed parsing '" + strV + "' as SQL Date; at path " + aVar.j(), e9);
                }
            } catch (Throwable th) {
                this.f47819a.setTimeZone(timeZone);
                throw th;
            }
        }
        return date;
    }

    @Override
    public final void write(ua.b bVar, Object obj) {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            bVar.i();
            return;
        }
        synchronized (this) {
            str = this.f47819a.format((java.util.Date) date);
        }
        bVar.r(str);
    }

    private a() {
        this.f47819a = new SimpleDateFormat("MMM d, yyyy");
    }
}
