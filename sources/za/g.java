package za;
public final class g implements ia.d {
    public static final g f49094a = new Object();
    public static final ia.c f49095b = ia.c.c("eventType");
    public static final ia.c f49096c = ia.c.c("sessionData");
    public static final ia.c d = ia.c.c("applicationInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        ia.e eVar = (ia.e) obj2;
        a0Var.getClass();
        eVar.a(f49095b, k.SESSION_START);
        eVar.a(f49096c, a0Var.f49059a);
        eVar.a(d, a0Var.f49060b);
    }
}
