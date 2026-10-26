package y7;

import org.telegram.ui.Components.b10;
public final class r1 implements ka.d {
    public static final r1 f52280a = new Object();
    public static final ka.c f52281b = new ka.c("logEventKey", ic.a.m(b10.o(b0.class, new y(1))));
    public static final ka.c f52282c = new ka.c("eventCount", ic.a.m(b10.o(b0.class, new y(2))));
    public static final ka.c d = new ka.c("inferenceDurationStats", ic.a.m(b10.o(b0.class, new y(3))));

    @Override
    public final void a(Object obj, Object obj2) {
        r0 r0Var = (r0) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(f52281b, r0Var.f52277a);
        eVar.a(f52282c, r0Var.f52278b);
        eVar.a(d, r0Var.f52279c);
    }
}
