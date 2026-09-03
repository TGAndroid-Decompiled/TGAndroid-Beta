package sa;

import java.util.Calendar;
import java.util.GregorianCalendar;
public final class p implements pa.v {
    public final int f47231a;
    public final Object f47232b;

    public p(Object obj, int i10) {
        this.f47231a = i10;
        this.f47232b = obj;
    }

    @Override
    public final pa.u create(pa.g gVar, wa.a aVar) {
        switch (this.f47231a) {
            case 0:
                if (aVar.f49520a == Number.class) {
                    return (q) this.f47232b;
                }
                return null;
            case 1:
                if (aVar.f49520a == Object.class) {
                    return new r(gVar, (pa.t) this.f47232b);
                }
                return null;
            default:
                Class cls = aVar.f49520a;
                if (cls != Calendar.class && cls != GregorianCalendar.class) {
                    return null;
                }
                return (s0) this.f47232b;
        }
    }

    public String toString() {
        switch (this.f47231a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((s0) this.f47232b) + "]";
            default:
                return super.toString();
        }
    }
}
