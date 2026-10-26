package w7;

import org.telegram.ui.Components.b10;
public final class p2 implements ka.d {
    public static final p2 f50948a = new Object();
    public static final ka.c f50949b = new ka.c("durationMs", ic.a.m(b10.m(h.class, new e(1))));
    public static final ka.c f50950c = new ka.c("errorCode", ic.a.m(b10.m(h.class, new e(2))));
    public static final ka.c d = new ka.c("isColdCall", ic.a.m(b10.m(h.class, new e(3))));
    public static final ka.c e = new ka.c("autoManageModelOnBackground", ic.a.m(b10.m(h.class, new e(4))));
    public static final ka.c f50951f = new ka.c("autoManageModelOnLowMemory", ic.a.m(b10.m(h.class, new e(5))));
    public static final ka.c f50952g = new ka.c("isNnApiEnabled", ic.a.m(b10.m(h.class, new e(6))));
    public static final ka.c h = new ka.c("eventsCount", ic.a.m(b10.m(h.class, new e(7))));
    public static final ka.c f50953i = new ka.c("otherErrors", ic.a.m(b10.m(h.class, new e(8))));
    public static final ka.c f50954j = new ka.c("remoteConfigValueForAcceleration", ic.a.m(b10.m(h.class, new e(9))));
    public static final ka.c f50955k = new ka.c("isAccelerated", ic.a.m(b10.m(h.class, new e(10))));

    @Override
    public final void a(Object obj, Object obj2) {
        d6 d6Var = (d6) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(f50949b, d6Var.f50832a);
        eVar.a(f50950c, d6Var.f50833b);
        eVar.a(d, d6Var.f50834c);
        eVar.a(e, null);
        eVar.a(f50951f, null);
        eVar.a(f50952g, null);
        eVar.a(h, null);
        eVar.a(f50953i, null);
        eVar.a(f50954j, null);
        eVar.a(f50955k, null);
    }
}
