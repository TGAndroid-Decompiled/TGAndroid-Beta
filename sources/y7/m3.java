package y7;

import org.telegram.ui.Components.b10;
public final class m3 implements ka.d {
    public static final m3 f52217a = new Object();
    public static final ka.c f52218b = new ka.c("durationMs", ic.a.m(b10.o(b0.class, new y(1))));
    public static final ka.c f52219c = new ka.c("errorCode", ic.a.m(b10.o(b0.class, new y(2))));
    public static final ka.c d = new ka.c("isColdCall", ic.a.m(b10.o(b0.class, new y(3))));
    public static final ka.c e = new ka.c("autoManageModelOnBackground", ic.a.m(b10.o(b0.class, new y(4))));
    public static final ka.c f52220f = new ka.c("autoManageModelOnLowMemory", ic.a.m(b10.o(b0.class, new y(5))));
    public static final ka.c f52221g = new ka.c("isNnApiEnabled", ic.a.m(b10.o(b0.class, new y(6))));
    public static final ka.c h = new ka.c("eventsCount", ic.a.m(b10.o(b0.class, new y(7))));
    public static final ka.c f52222i = new ka.c("otherErrors", ic.a.m(b10.o(b0.class, new y(8))));
    public static final ka.c f52223j = new ka.c("remoteConfigValueForAcceleration", ic.a.m(b10.o(b0.class, new y(9))));
    public static final ka.c f52224k = new ka.c("isAccelerated", ic.a.m(b10.o(b0.class, new y(10))));

    @Override
    public final void a(Object obj, Object obj2) {
        e7 e7Var = (e7) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(f52218b, e7Var.f52130a);
        eVar.a(f52219c, e7Var.f52131b);
        eVar.a(d, e7Var.f52132c);
        eVar.a(e, e7Var.d);
        eVar.a(f52220f, e7Var.e);
        eVar.a(f52221g, null);
        eVar.a(h, null);
        eVar.a(f52222i, null);
        eVar.a(f52223j, null);
        eVar.a(f52224k, null);
    }
}
