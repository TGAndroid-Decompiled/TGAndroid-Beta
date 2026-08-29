package qa;

import java.util.Calendar;
public class s0 extends na.u {
    @Override
    public final java.lang.Object read(va.a r13) {
        throw new UnsupportedOperationException("Method not decompiled: qa.s0.read(va.a):java.lang.Object");
    }

    @Override
    public final void write(va.b bVar, Object obj) {
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
