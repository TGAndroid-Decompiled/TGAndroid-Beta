package za;
public final class g implements ia.d {
    public static final g f49047a = new Object();
    public static final ia.c f49048b = ia.c.c("eventType");
    public static final ia.c f49049c = ia.c.c("sessionData");
    public static final ia.c d = ia.c.c("applicationInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        c0 c0Var = (c0) obj;
        ia.e eVar = (ia.e) obj2;
        c0Var.getClass();
        eVar.a(f49048b, l.SESSION_START);
        eVar.a(f49049c, c0Var.f49029a);
        eVar.a(d, c0Var.f49030b);
    }
}
