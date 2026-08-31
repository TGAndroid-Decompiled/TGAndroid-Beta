package sa;

import java.util.Calendar;
import java.util.GregorianCalendar;
public final class p implements pa.v {
    public final int f47200a;
    public final Object f47201b;

    public p(Object obj, int i10) {
        this.f47200a = i10;
        this.f47201b = obj;
    }

    @Override
    public final pa.u create(pa.g gVar, wa.a aVar) {
        switch (this.f47200a) {
            case 0:
                if (aVar.f49483a == Number.class) {
                    return (q) this.f47201b;
                }
                return null;
            case 1:
                if (aVar.f49483a == Object.class) {
                    return new r(gVar, (pa.t) this.f47201b);
                }
                return null;
            default:
                Class cls = aVar.f49483a;
                if (cls != Calendar.class && cls != GregorianCalendar.class) {
                    return null;
                }
                return (s0) this.f47201b;
        }
    }

    public String toString() {
        switch (this.f47200a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((s0) this.f47201b) + "]";
            default:
                return super.toString();
        }
    }
}
