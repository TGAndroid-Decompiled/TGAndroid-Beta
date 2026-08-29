package qa;

import j$.util.Objects;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
public final class h extends na.u {
    public static final e f46528c = new e();
    public final g f46529a;
    public final ArrayList f46530b;

    public h(g gVar) {
        ArrayList arrayList = new ArrayList();
        this.f46530b = arrayList;
        Objects.requireNonNull(gVar);
        this.f46529a = gVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (pa.g.f45682a >= 9) {
            arrayList.add(new SimpleDateFormat(a4.w.y("MMM d, yyyy", " ", "h:mm:ss a"), locale));
        }
    }

    @Override
    public final Object read(va.a aVar) {
        Date b10;
        DateFormat dateFormat;
        TimeZone timeZone;
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        synchronized (this.f46530b) {
            try {
                ArrayList arrayList = this.f46530b;
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
                            b10 = ra.a.b(v, new ParsePosition(0));
                            break;
                        } catch (ParseException e10) {
                            StringBuilder s10 = a4.w.s("Failed parsing '", v, "' as Date; at path ");
                            s10.append(aVar.j());
                            throw new RuntimeException(s10.toString(), e10);
                        }
                    }
                }
            } catch (ParseException unused) {
                dateFormat.setTimeZone(timeZone);
            } finally {
            }
        }
        return this.f46529a.a(b10);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f46530b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    @Override
    public final void write(va.b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.i();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f46530b.get(0);
        synchronized (this.f46530b) {
            format = dateFormat.format(date);
        }
        bVar.r(format);
    }
}
