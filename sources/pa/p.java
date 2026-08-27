package pa;

import java.util.Calendar;
import java.util.GregorianCalendar;

public final class p implements ma.v {

    public final int f45653a;

    public final Object f45654b;

    public p(Object obj, int i10) {
        this.f45653a = i10;
        this.f45654b = obj;
    }

    @Override
    public final ma.u create(ma.g gVar, ta.a aVar) {
        switch (this.f45653a) {
            case 0:
                if (aVar.f48151a == Number.class) {
                    return (q) this.f45654b;
                }
                return null;
            case 1:
                if (aVar.f48151a == Object.class) {
                    return new r(gVar, (ma.t) this.f45654b);
                }
                return null;
            default:
                Class cls = aVar.f48151a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (s0) this.f45654b;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f45653a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((s0) this.f45654b) + "]";
            default:
                return super.toString();
        }
    }
}
