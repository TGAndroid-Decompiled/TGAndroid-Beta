package sa;

import java.util.Calendar;
import java.util.GregorianCalendar;
public final class p implements pa.v {
    public final int f44277a;
    public final Object f44278b;

    public p(Object obj, int i10) {
        this.f44277a = i10;
        this.f44278b = obj;
    }

    @Override
    public final pa.u create(pa.g gVar, wa.a aVar) {
        switch (this.f44277a) {
            case 0:
                if (aVar.f46587a == Number.class) {
                    return (q) this.f44278b;
                }
                return null;
            case 1:
                if (aVar.f46587a == Object.class) {
                    return new r(gVar, (pa.t) this.f44278b);
                }
                return null;
            default:
                Class cls = aVar.f46587a;
                if (cls != Calendar.class && cls != GregorianCalendar.class) {
                    return null;
                }
                return (s0) this.f44278b;
        }
    }

    public String toString() {
        switch (this.f44277a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((s0) this.f44278b) + "]";
            default:
                return super.toString();
        }
    }
}
