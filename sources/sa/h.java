package sa;

import j$.util.Objects;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
public final class h extends pa.u {
    public static final e f44246c = new e();
    public final g f44247a;
    public final ArrayList f44248b;

    public h(g gVar) {
        ArrayList arrayList = new ArrayList();
        this.f44248b = arrayList;
        Objects.requireNonNull(gVar);
        this.f44247a = gVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (ra.g.f43434a >= 9) {
            arrayList.add(new SimpleDateFormat(android.support.v4.media.a.z("MMM d, yyyy", " ", "h:mm:ss a"), locale));
        }
    }

    @Override
    public final Object read(xa.a aVar) {
        Date b10;
        DateFormat dateFormat;
        TimeZone timeZone;
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        synchronized (this.f44248b) {
            try {
                ArrayList arrayList = this.f44248b;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        dateFormat = (DateFormat) obj;
                        timeZone = dateFormat.getTimeZone();
                        b10 = dateFormat.parse(v);
                        dateFormat.setTimeZone(timeZone);
                    } else {
                        try {
                            b10 = ta.a.b(v, new ParsePosition(0));
                            break;
                        } catch (ParseException e) {
                            StringBuilder t6 = android.support.v4.media.a.t("Failed parsing '", v, "' as Date; at path ");
                            t6.append(aVar.j());
                            throw new RuntimeException(t6.toString(), e);
                        }
                    }
                }
            } catch (ParseException unused) {
                dateFormat.setTimeZone(timeZone);
            } finally {
            }
        }
        return this.f44247a.a(b10);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f44248b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.i();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f44248b.get(0);
        synchronized (this.f44248b) {
            format = dateFormat.format(date);
        }
        bVar.r(format);
    }
}
