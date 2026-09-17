package za;
public final class g implements ia.d {
    public static final g f51453a = new Object();
    public static final ia.c f51454b = ia.c.c("eventType");
    public static final ia.c f51455c = ia.c.c("sessionData");
    public static final ia.c d = ia.c.c("applicationInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        ia.e eVar = (ia.e) obj2;
        a0Var.getClass();
        eVar.a(f51454b, k.SESSION_START);
        eVar.a(f51455c, a0Var.f51414a);
        eVar.a(d, a0Var.f51415b);
    }
}
