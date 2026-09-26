package za;
public final class g implements ia.d {
    public static final g f49045a = new Object();
    public static final ia.c f49046b = ia.c.c("eventType");
    public static final ia.c f49047c = ia.c.c("sessionData");
    public static final ia.c d = ia.c.c("applicationInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        c0 c0Var = (c0) obj;
        ia.e eVar = (ia.e) obj2;
        c0Var.getClass();
        eVar.a(f49046b, l.SESSION_START);
        eVar.a(f49047c, c0Var.f49027a);
        eVar.a(d, c0Var.f49028b);
    }
}
