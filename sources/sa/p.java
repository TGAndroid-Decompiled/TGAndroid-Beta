package sa;

import java.util.Calendar;
import java.util.GregorianCalendar;
public final class p implements pa.v {
    public final int f44212a;
    public final Object f44213b;

    public p(Object obj, int i10) {
        this.f44212a = i10;
        this.f44213b = obj;
    }

    @Override
    public final pa.u create(pa.g gVar, wa.a aVar) {
        switch (this.f44212a) {
            case 0:
                if (aVar.f46505a == Number.class) {
                    return (q) this.f44213b;
                }
                return null;
            case 1:
                if (aVar.f46505a == Object.class) {
                    return new r(gVar, (pa.t) this.f44213b);
                }
                return null;
            default:
                Class cls = aVar.f46505a;
                if (cls != Calendar.class && cls != GregorianCalendar.class) {
                    return null;
                }
                return (s0) this.f44213b;
        }
    }

    public String toString() {
        switch (this.f44212a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((s0) this.f44213b) + "]";
            default:
                return super.toString();
        }
    }
}
