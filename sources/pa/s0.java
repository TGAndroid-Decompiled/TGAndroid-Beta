package pa;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class s0 extends ma.u {
    @Override
    public final Object read(ua.a aVar) throws IOException {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        aVar.b();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (aVar.x() == 4) {
                aVar.f();
                return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
            }
            String strR = aVar.r();
            int iP = aVar.p();
            strR.getClass();
            switch (strR) {
                case "dayOfMonth":
                    i12 = iP;
                    break;
                case "minute":
                    i14 = iP;
                    break;
                case "second":
                    i15 = iP;
                    break;
                case "year":
                    i10 = iP;
                    break;
                case "month":
                    i11 = iP;
                    break;
                case "hourOfDay":
                    i13 = iP;
                    break;
            }
        }
    }

    @Override
    public final void write(ua.b bVar, Object obj) throws IOException {
        Calendar calendar = (Calendar) obj;
        if (calendar == null) {
            bVar.i();
            return;
        }
        bVar.c();
        bVar.g("year");
        bVar.o(calendar.get(1));
        bVar.g("month");
        bVar.o(calendar.get(2));
        bVar.g("dayOfMonth");
        bVar.o(calendar.get(5));
        bVar.g("hourOfDay");
        bVar.o(calendar.get(11));
        bVar.g("minute");
        bVar.o(calendar.get(12));
        bVar.g("second");
        bVar.o(calendar.get(13));
        bVar.f();
    }
}
