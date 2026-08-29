package qa;

import java.util.Calendar;
import java.util.GregorianCalendar;
public final class p implements na.v {
    public final int f46560a;
    public final Object f46561b;

    public p(Object obj, int i10) {
        this.f46560a = i10;
        this.f46561b = obj;
    }

    @Override
    public final na.u create(na.g gVar, ua.a aVar) {
        switch (this.f46560a) {
            case 0:
                if (aVar.f49163a == Number.class) {
                    return (q) this.f46561b;
                }
                return null;
            case 1:
                if (aVar.f49163a == Object.class) {
                    return new r(gVar, (na.t) this.f46561b);
                }
                return null;
            default:
                Class cls = aVar.f49163a;
                if (cls != Calendar.class && cls != GregorianCalendar.class) {
                    return null;
                }
                return (s0) this.f46561b;
        }
    }

    public String toString() {
        switch (this.f46560a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((s0) this.f46561b) + "]";
            default:
                return super.toString();
        }
    }
}
