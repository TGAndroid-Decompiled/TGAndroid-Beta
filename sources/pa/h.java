package pa;

import j$.util.Objects;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class h extends ma.u {

    public static final e f45621c = new e();

    public final g f45622a;

    public final ArrayList f45623b;

    public h(g gVar) {
        ArrayList arrayList = new ArrayList();
        this.f45623b = arrayList;
        Objects.requireNonNull(gVar);
        this.f45622a = gVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (oa.g.f19387a >= 9) {
            arrayList.add(new SimpleDateFormat(a9.p.w("MMM d, yyyy", " ", "h:mm:ss a"), locale));
        }
    }

    @Override
    public final Object read(ua.a aVar) {
        Date dateB;
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String strV = aVar.v();
        synchronized (this.f45623b) {
            try {
                ArrayList arrayList = this.f45623b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    DateFormat dateFormat = (DateFormat) obj;
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            dateB = dateFormat.parse(strV);
                            dateFormat.setTimeZone(timeZone);
                        } catch (Throwable th) {
                            dateFormat.setTimeZone(timeZone);
                            throw th;
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
                try {
                    dateB = qa.a.b(strV, new ParsePosition(0));
                } catch (ParseException e9) {
                    StringBuilder sbR = a9.p.r("Failed parsing '", strV, "' as Date; at path ");
                    sbR.append(aVar.j());
                    throw new ma.j(sbR.toString(), e9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f45622a.a(dateB);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f45623b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    @Override
    public final void write(ua.b bVar, Object obj) {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            bVar.i();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f45623b.get(0);
        synchronized (this.f45623b) {
            str = dateFormat.format(date);
        }
        bVar.r(str);
    }
}
